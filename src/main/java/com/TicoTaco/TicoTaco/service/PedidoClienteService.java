package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.PedidoClienteRepository;
import com.TicoTaco.TicoTaco.model.PedidoClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoClienteService {

    @Autowired
    private PedidoClienteRepository pedidoClienteRepository;

    @Transactional
    public PedidoClienteModel createPedido(PedidoClienteModel pedidoCliente) {
        return pedidoClienteRepository.save(pedidoCliente);
    }

    public List<PedidoClienteModel> getAllPedidos() {
        return pedidoClienteRepository.findAll();
    }

    public PedidoClienteModel getPedidoById(Long id) {
        return pedidoClienteRepository.findById(id).orElse(null);
    }

    public PedidoClienteModel updatePedido(Long id, PedidoClienteModel pedidoDetails) {
        PedidoClienteModel pedidoCliente = pedidoClienteRepository.findById(id).orElse(null);
        if (pedidoCliente != null) {
            pedidoCliente.setMesaAsignada(pedidoDetails.getMesaAsignada());
            pedidoCliente.setTiempoPreparacion(pedidoDetails.getTiempoPreparacion());
            pedidoCliente.setEstado(pedidoDetails.getEstado());
            pedidoCliente.setExpress(pedidoDetails.getExpress());
            pedidoCliente.setEmpleado(pedidoDetails.getEmpleado());
            pedidoCliente.setCliente(pedidoDetails.getCliente());
            pedidoCliente.setMenu(pedidoDetails.getMenu());
            return pedidoClienteRepository.save(pedidoCliente);
        }
        return null;
    }

    public void deletePedido(Integer id) {
        pedidoClienteRepository.deleteById(id);
    }
}
