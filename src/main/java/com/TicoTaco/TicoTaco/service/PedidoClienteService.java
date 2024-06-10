package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.model.PedidoClienteModel;

import java.util.List;

import java.util.List;

public interface PedidoClienteService {
    List<PedidoClienteModel> getAllPedidosCliente();
    PedidoClienteModel getPedidoClienteById(Long id);
    PedidoClienteModel createPedidoCliente(PedidoClienteModel pedidoCliente);
    PedidoClienteModel updatePedidoCliente(Long id, PedidoClienteModel pedidoCliente);
    void deletePedidoCliente(Long id);
}
