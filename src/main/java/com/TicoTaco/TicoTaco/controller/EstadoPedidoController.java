package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.dto.EstadoPedidoDTO;
import com.TicoTaco.TicoTaco.mapper.EstadoPedidoMapper;
import com.TicoTaco.TicoTaco.model.EstadoPedidoModel;
import com.TicoTaco.TicoTaco.service.EstadoPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/estado-pedido")
public class EstadoPedidoController {

    @Autowired
    private EstadoPedidoService estadoPedidoService;

    @Autowired
    private EstadoPedidoMapper estadoPedidoMapper;

    @GetMapping
    public ResponseEntity<List<EstadoPedidoDTO>> getAllEstadosPedido() {
        List<EstadoPedidoModel> estadosPedido = estadoPedidoService.getAllEstadosPedido();
        List<EstadoPedidoDTO> estadoPedidoDTOs = estadosPedido.stream()
                .map(estadoPedidoMapper::toDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(estadoPedidoDTOs, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<EstadoPedidoDTO> createEstadoPedido(@RequestBody EstadoPedidoDTO estadoPedidoDTO) {
        EstadoPedidoModel estadoPedido = estadoPedidoMapper.toEntity(estadoPedidoDTO);
        EstadoPedidoModel createdEstadoPedido = estadoPedidoService.createEstadoPedido(estadoPedido);
        return new ResponseEntity<>(estadoPedidoMapper.toDto(createdEstadoPedido), HttpStatus.CREATED);
    }
}
