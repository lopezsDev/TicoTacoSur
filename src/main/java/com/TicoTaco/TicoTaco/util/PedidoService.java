package com.TicoTaco.TicoTaco.util;

import com.TicoTaco.TicoTaco.Exception.ResourceNotFoundException;
import com.TicoTaco.TicoTaco.Repository.*;
import com.TicoTaco.TicoTaco.model.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;


@Service
public class PedidoService {
    private final PedidoClienteRepository pedidoClienteRepository;
    private final DetallesFacturaRepository detallesFacturaRepository;
    private final ProductoRepository productoRepository;
    private final ComboRepository comboRepository;
    private final EstadoPedidoRepository estadoPedidoRepository;
    private final FacturaRepository facturaRepository;

    public PedidoService(PedidoClienteRepository pedidoClienteRepository, DetallesFacturaRepository detallesFacturaRepository, ProductoRepository productoRepository, ComboRepository comboRepository, EstadoPedidoRepository estadoPedidoRepository, FacturaRepository facturaRepository) {
        this.pedidoClienteRepository = pedidoClienteRepository;
        this.detallesFacturaRepository = detallesFacturaRepository;
        this.productoRepository = productoRepository;
        this.comboRepository = comboRepository;
        this.estadoPedidoRepository = estadoPedidoRepository;
        this.facturaRepository = facturaRepository;
    }

    @Transactional
    public FacturaModel realizarVenta(Long idCliente, Long idCombo, Long idProducto) {
        // Obtener el combo y el producto
        ComboModel combo = comboRepository.findById(idCombo).orElseThrow(() -> new ResourceNotFoundException("Combo no encontrado"));
        ProductoModel producto = productoRepository.findById(idProducto).orElseThrow(() -> new ResourceNotFoundException("Producto no encontrado"));

        // Obtener el estado del pedido "Pendiente"
        EstadoPedidoModel estadoPendiente = estadoPedidoRepository.findByEstado("Pendiente")
                .orElseThrow(() -> new ResourceNotFoundException("Estado de pedido 'Pendiente' no encontrado"));

        // Crear un nuevo pedido cliente
        PedidoClienteModel pedidoCliente = new PedidoClienteModel();
        pedidoCliente.setClienteId(idCliente);
        pedidoCliente.setEstadoId(estadoPendiente.getEstadoId());
        pedidoCliente.setTiempoPreparacion(LocalDateTime.now());
        pedidoCliente = pedidoClienteRepository.save(pedidoCliente);

        // Crear los detalles de factura
        DetallesFacturaModel detalleCombo = new DetallesFacturaModel();
        detalleCombo.setCantidad(1);
        detalleCombo.setPrecioLinea(combo.getPrecio());
        detallesFacturaRepository.save(detalleCombo);

        DetallesFacturaModel detalleProducto = new DetallesFacturaModel();
        detalleProducto.setCantidad(1);
        detalleProducto.setPrecioLinea(producto.getPrecio().doubleValue());
        detallesFacturaRepository.save(detalleProducto);

        // Crear la factura
        FacturaModel factura = new FacturaModel();
        factura.setMontoTotal(combo.getPrecio() + producto.getPrecio().doubleValue());
        factura = facturaRepository.save(factura);

        return factura;
    }
}