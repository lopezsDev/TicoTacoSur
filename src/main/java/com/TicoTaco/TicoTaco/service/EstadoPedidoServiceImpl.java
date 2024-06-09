package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.EstadoPedidoRepository;
import com.TicoTaco.TicoTaco.model.EstadoPedidoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstadoPedidoServiceImpl implements EstadoPedidoService {

    @Autowired
    private EstadoPedidoRepository estadoPedidoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<EstadoPedidoModel> getAllEstadosPedido() {
        return estadoPedidoRepository.findAll();
    }

    @Override
    @Transactional
    public EstadoPedidoModel createEstadoPedido(EstadoPedidoModel estadoPedido) {
        return estadoPedidoRepository.save(estadoPedido);
    }
}
