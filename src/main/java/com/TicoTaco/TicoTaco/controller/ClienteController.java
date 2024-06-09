package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.dto.ClienteDTO;
import com.TicoTaco.TicoTaco.mapper.ClienteMapper;
import com.TicoTaco.TicoTaco.model.ClienteModel;
import com.TicoTaco.TicoTaco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ClienteMapper clienteMapper;

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> getAllClientes() {
        List<ClienteModel> clientes = clienteService.getAllClientes();
        List<ClienteDTO> clientesDTO = clientes.stream()
                .map(clienteMapper::toDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(clientesDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ClienteDTO> createCliente(@RequestBody ClienteDTO clienteDTO) {
        ClienteModel cliente = clienteMapper.toEntity(clienteDTO);
        ClienteModel createdCliente = clienteService.createCliente(cliente);
        return new ResponseEntity<>(clienteMapper.toDto(createdCliente), HttpStatus.CREATED);
    }
}

