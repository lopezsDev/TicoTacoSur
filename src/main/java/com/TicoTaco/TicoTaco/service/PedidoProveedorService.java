package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.PedidoProveedorRepository;
import com.TicoTaco.TicoTaco.model.PedidoProveedorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoProveedorService {

    private final PedidoProveedorRepository pedidoProveedorRepository;

    @Autowired
    public PedidoProveedorService(PedidoProveedorRepository pedidoProveedorRepository) {
        this.pedidoProveedorRepository = pedidoProveedorRepository;
    }

    public List<PedidoProveedorModel> getAllPedidosProveedor() {
        return pedidoProveedorRepository.findAll();
    }

    public Optional<PedidoProveedorModel> getPedidoProveedorById(long id) {
        return pedidoProveedorRepository.findById(id);
    }

    public PedidoProveedorModel createPedidoProveedor(PedidoProveedorModel pedidoProveedor) {
        return pedidoProveedorRepository.save(pedidoProveedor);
    }

    public PedidoProveedorModel updatePedidoProveedor(long id, PedidoProveedorModel pedidoProveedorDetails) {
        PedidoProveedorModel pedidoProveedor = pedidoProveedorRepository.findById(id).orElse(null);

        if (pedidoProveedor != null) {
            pedidoProveedor.setFechaPedido(pedidoProveedorDetails.getFechaPedido());
            pedidoProveedor.setMontoTotal(pedidoProveedorDetails.getMontoTotal());
            pedidoProveedor.setSucursalId(pedidoProveedorDetails.getSucursalId());
            pedidoProveedor.setProveedorId(pedidoProveedorDetails.getProveedorId());
            pedidoProveedor.setDetallePedidoProveedorId(pedidoProveedorDetails.getDetallePedidoProveedorId());

            return pedidoProveedorRepository.save(pedidoProveedor);
        } else {
            return null;
        }
    }

    public void deletePedidoProveedor(long id) {
        pedidoProveedorRepository.deleteById(id);
    }
}

