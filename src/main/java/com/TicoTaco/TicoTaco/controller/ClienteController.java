package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/buscarClientes")
    public List<Map<String, Object>> buscarClientes(@RequestParam String consulta) {
        List<Map<String, Object>> clientes = clienteService.buscarClientes(consulta);
        return clientes;
    }
}
