package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.model.ClienteModel;
import com.TicoTaco.TicoTaco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/buscar")
    public List<Map<String, Object>> buscarClientes(@RequestParam String consulta) {
        List<Map<String, Object>> clientes = clienteService.buscarClientes(consulta);
        return clientes;
    }

    @GetMapping
    public List<ClienteModel> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{id}")
    public ClienteModel getClienteById(@PathVariable Long id) {
        return clienteService.getClienteById(id);
    }

    @PostMapping
    public ClienteModel createCliente(@RequestBody ClienteModel cliente) {
        return clienteService.createCliente(cliente);
    }

    @PutMapping("/{id}")
    public ClienteModel updateCliente(@PathVariable Long id, @RequestBody ClienteModel clienteDetails) {
        return clienteService.updateCliente(id, clienteDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
    }

}
