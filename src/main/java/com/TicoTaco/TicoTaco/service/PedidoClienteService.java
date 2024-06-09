package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.model.PedidoClienteModel;

import java.util.List;

public interface PedidoClienteService {
    List<PedidoClienteModel> getAllPedidosCliente();
    PedidoClienteModel createPedidoCliente(PedidoClienteModel pedidoCliente);
}
