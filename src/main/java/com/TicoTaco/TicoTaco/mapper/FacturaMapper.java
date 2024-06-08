package com.TicoTaco.TicoTaco.mapper;

import com.TicoTaco.TicoTaco.Repository.DetallesFacturaRepository;
import com.TicoTaco.TicoTaco.Repository.MonedaRepository;
import com.TicoTaco.TicoTaco.Repository.PedidoClienteRepository;
import com.TicoTaco.TicoTaco.Repository.SucursalRepository;
import com.TicoTaco.TicoTaco.dto.*;
import com.TicoTaco.TicoTaco.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FacturaMapper {

    @Autowired
    private DetallesFacturaRepository detallesFacturaRepository;

    @Autowired
    private SucursalRepository sucursalRepository;

    @Autowired
    private PedidoClienteRepository pedidoClienteRepository;

    @Autowired
    private MonedaRepository monedaRepository;

    public FacturaModel toEntity(FacturaDTO dto) {
        FacturaModel factura = new FacturaModel();
        factura.setFechaPedido(dto.getFechaPedido());
        factura.setMontoTotal(dto.getMontoTotal());
        factura.setDetalleFacturaId(detallesFacturaRepository.findById(dto.getDetalleFacturaId().getDetalleFacturaId()).orElse(null));
        factura.setSucursalId(sucursalRepository.findById(dto.getSucursalId().getSucursalId()).orElse(null));
        factura.setPedidoClienteId(pedidoClienteRepository.findById(dto.getPedidoClienteId().getPedidoClienteId()).orElse(null));
        factura.setMonedaId(monedaRepository.findById(dto.getMonedaId().getMonedaId()).orElse(null));
        return factura;
    }

    public FacturaDTO toDto(FacturaModel factura) {
        DetallesFacturaDTO detalleFacturaDTO = new DetallesFacturaDTO(
                factura.getDetalleFacturaId().getDetalleFacturaId(),
                factura.getDetalleFacturaId().getCantidad(),
                factura.getDetalleFacturaId().getPrecioLinea(),
                factura.getDetalleFacturaId().getObservaciones()
        );

        SucursalDTO sucursalDTO = new SucursalDTO(
                factura.getSucursalId().getSucursalId(),
                factura.getSucursalId().getNombreSucursal()
        );

        PedidoClienteDTO pedidoClienteDTO = new PedidoClienteDTO(
                factura.getPedidoClienteId().getPedidoClienteId(),
                factura.getPedidoClienteId().getMesaAsignada(),
                factura.getPedidoClienteId().getTiempoPreparacion(),
                factura.getPedidoClienteId().getEstadoId(),
                factura.getPedidoClienteId().getExpressId(),
                factura.getPedidoClienteId().getEmpleadoId(),
                factura.getPedidoClienteId().getClienteId(),
                factura.getPedidoClienteId().getMenuId()
        );

        MonedaDTO monedaDTO = new MonedaDTO(
                factura.getMonedaId().getMonedaId(),
                factura.getMonedaId().getMoneda()
        );

        return new FacturaDTO(
                factura.getFacturaId(),
                factura.getFechaPedido(),
                factura.getMontoTotal(),
                detalleFacturaDTO,
                sucursalDTO,
                pedidoClienteDTO,
                monedaDTO
        );
    }

    public List<FacturaDTO> toDtoList(List<FacturaModel> facturas) {
        return facturas.stream().map(this::toDto).collect(Collectors.toList());
    }

    public List<FacturaModel> toEntityList(List<FacturaDTO> dtos) {
        return dtos.stream().map(this::toEntity).collect(Collectors.toList());
    }
}

