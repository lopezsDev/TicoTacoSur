package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.model.ClienteModel;
import com.TicoTaco.TicoTaco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ClienteModel> getClienteById(@PathVariable Long id) {
        ClienteModel cliente = clienteService.getClienteById(id);
        if (cliente != null) {
            return new ResponseEntity<>(cliente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<ClienteModel> createCliente(@RequestBody ClienteModel cliente) {
        ClienteModel newCliente = clienteService.createCliente(cliente);
        return new ResponseEntity<>(newCliente, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteModel> updateCliente(@PathVariable Long id, @RequestBody ClienteModel clienteDetails) {
        ClienteModel updatedCliente = clienteService.updateCliente(id, clienteDetails);
        if (updatedCliente != null) {
            return new ResponseEntity<>(updatedCliente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
