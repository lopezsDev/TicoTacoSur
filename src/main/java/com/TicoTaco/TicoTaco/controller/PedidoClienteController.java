package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.model.PedidoClienteModel;
import com.TicoTaco.TicoTaco.service.PedidoClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoClienteController {

    @Autowired
    private PedidoClienteService pedidoClienteService;


    @GetMapping
    public List<PedidoClienteModel> getAllPedidos() {
        return pedidoClienteService.getAllPedidos();
    }

    @GetMapping("/{id}")
    public PedidoClienteModel getPedidoById(@PathVariable Long id) {
        return pedidoClienteService.getPedidoById(id);
    }

    @PostMapping
    public PedidoClienteModel createPedido(@RequestBody PedidoClienteModel pedidoCliente) {
        return pedidoClienteService.createPedido(pedidoCliente);
    }

    @PutMapping("/{id}")
    public PedidoClienteModel updatePedido(@PathVariable Long id, @RequestBody PedidoClienteModel pedidoDetails) {
        return pedidoClienteService.updatePedido(id, pedidoDetails);
    }

    @DeleteMapping("/{id}")
    public void deletePedido(@PathVariable Long id) {
        pedidoClienteService.deletePedido(id);
    }
}

