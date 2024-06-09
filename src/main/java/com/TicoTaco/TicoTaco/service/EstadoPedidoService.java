package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.EstadoPedidoRepository;
import com.TicoTaco.TicoTaco.model.EstadoPedidoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import java.util.List;

public interface EstadoPedidoService {
    List<EstadoPedidoModel> getAllEstadosPedido();
    EstadoPedidoModel createEstadoPedido(EstadoPedidoModel estadoPedido);
}
