package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.PedidoClienteRepository;
import com.TicoTaco.TicoTaco.model.PedidoClienteModel;
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
    @Transactional
    public PedidoClienteModel createPedidoCliente(PedidoClienteModel pedidoCliente) {
        return pedidoClienteRepository.save(pedidoCliente);
    }
}
