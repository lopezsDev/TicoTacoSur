package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.PedidoClienteRepository;
import com.TicoTaco.TicoTaco.model.PedidoClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoClienteService {

    private final PedidoClienteRepository pedidoClienteRepository;

    @Autowired
    public PedidoClienteService(PedidoClienteRepository pedidoClienteRepository) {
        this.pedidoClienteRepository = pedidoClienteRepository;
    }

    public List<PedidoClienteModel> getAllPedidosCliente() {
        return pedidoClienteRepository.findAll();
    }

    public Optional<PedidoClienteModel> getPedidoClienteById(long id) {
        return pedidoClienteRepository.findById(id);
    }

    public PedidoClienteModel createPedidoCliente(PedidoClienteModel pedidoCliente) {
        return pedidoClienteRepository.save(pedidoCliente);
    }

    public PedidoClienteModel updatePedidoCliente(long id, PedidoClienteModel pedidoClienteDetails) {
        PedidoClienteModel pedidoCliente = pedidoClienteRepository.findById(id).orElse(null);

        if (pedidoCliente != null) {
            pedidoCliente.setHoraPedido(pedidoClienteDetails.getHoraPedido());
            pedidoCliente.setEstadoId(pedidoClienteDetails.getEstadoId());
            pedidoCliente.setMenuId(pedidoClienteDetails.getMenuId());
            pedidoCliente.setClienteId(pedidoClienteDetails.getClienteId());
            pedidoCliente.setTipoEntregaId(pedidoClienteDetails.getTipoEntregaId());

            return pedidoClienteRepository.save(pedidoCliente);
        } else {
            return null;
        }
    }

    public void deletePedidoCliente(long id) {
        pedidoClienteRepository.deleteById(id);
    }
}
