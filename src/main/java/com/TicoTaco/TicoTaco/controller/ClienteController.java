package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ticotaco")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }


    @GetMapping("/buscar-clientes")
    public List<Map<String, Object>> buscarClientes(@RequestParam("consulta") String consulta) {
        return clienteService.buscarClientes(consulta);
    }
}
