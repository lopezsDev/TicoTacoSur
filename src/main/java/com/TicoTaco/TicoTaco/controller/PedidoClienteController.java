package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.dto.PedidoClienteDTO;
import com.TicoTaco.TicoTaco.mapper.PedidoClienteMapper;
import com.TicoTaco.TicoTaco.model.PedidoClienteModel;
import com.TicoTaco.TicoTaco.service.PedidoClienteService;
import com.TicoTaco.TicoTaco.service.PedidoClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/pedidosCliente")
public class PedidoClienteController {

    @Autowired
    private PedidoClienteService pedidoClienteService;

    @Autowired
    private PedidoClienteMapper pedidoClienteMapper;

    @GetMapping
    public ResponseEntity<List<PedidoClienteDTO>> getAllPedidosCliente() {
        List<PedidoClienteModel> pedidosCliente = pedidoClienteService.getAllPedidosCliente();
        List<PedidoClienteDTO> pedidosClienteDTO = pedidosCliente.stream()
                .map(pedidoClienteMapper::toDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(pedidosClienteDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PedidoClienteDTO> createPedidoCliente(@RequestBody PedidoClienteDTO pedidoClienteDTO) {
        PedidoClienteModel pedidoCliente = pedidoClienteMapper.toEntity(pedidoClienteDTO);
        PedidoClienteModel createdPedidoCliente = pedidoClienteService.createPedidoCliente(pedidoCliente);
        return new ResponseEntity<>(pedidoClienteMapper.toDto(createdPedidoCliente), HttpStatus.CREATED);
    }
}

