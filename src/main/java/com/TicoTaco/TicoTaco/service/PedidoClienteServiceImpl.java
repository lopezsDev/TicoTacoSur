package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.PedidoClienteRepository;
import com.TicoTaco.TicoTaco.exceptions.ResourceNotFoundException;
import com.TicoTaco.TicoTaco.model.PedidoClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoClienteServiceImpl implements PedidoClienteService {

    @Autowired
    private PedidoClienteRepository pedidoClienteRepository;

    @Override
    @Transactional(readOnly = true)
    public List<PedidoClienteModel> getAllPedidosCliente() {
        return pedidoClienteRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public PedidoClienteModel getPedidoClienteById(Long id) {
        return pedidoClienteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("PedidoCliente not found with id " + id));
    }

    @Override
    @Transactional
    public PedidoClienteModel createPedidoCliente(PedidoClienteModel pedidoCliente) {
        return pedidoClienteRepository.save(pedidoCliente);
    }

    @Override
    @Transactional
    public PedidoClienteModel updatePedidoCliente(Long id, PedidoClienteModel pedidoClienteDetails) {
        PedidoClienteModel pedidoCliente = getPedidoClienteById(id);

        pedidoCliente.setMesaAsignada(pedidoClienteDetails.getMesaAsignada());
        pedidoCliente.setTiempoPreparacion(pedidoClienteDetails.getTiempoPreparacion());
        pedidoCliente.setEstadoId(pedidoClienteDetails.getEstadoId());
        pedidoCliente.setExpressId(pedidoClienteDetails.getExpressId());
        pedidoCliente.setEmpleadoId(pedidoClienteDetails.getEmpleadoId());
        pedidoCliente.setClienteId(pedidoClienteDetails.getClienteId());
        pedidoCliente.setMenuId(pedidoClienteDetails.getMenuId());

        return pedidoClienteRepository.save(pedidoCliente);
    }

    @Override
    @Transactional
    public void deletePedidoCliente(Long id) {
        PedidoClienteModel pedidoCliente = getPedidoClienteById(id);
        pedidoClienteRepository.delete(pedidoCliente);
    }
}
