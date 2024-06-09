package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.dto.FacturaDTO;
import com.TicoTaco.TicoTaco.mapper.FacturaMapper;
import com.TicoTaco.TicoTaco.model.FacturaModel;
import com.TicoTaco.TicoTaco.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @Autowired
    private FacturaMapper facturaMapper;

    @GetMapping
    public ResponseEntity<List<FacturaDTO>> getAllFacturas() {
        List<FacturaModel> facturas = facturaService.getAllFacturas();
        List<FacturaDTO> facturasDTO = facturas.stream()
                .map(facturaMapper::toDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(facturasDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<FacturaDTO> createFactura(@RequestBody FacturaDTO facturaDTO) {
        FacturaModel factura = facturaMapper.toEntity(facturaDTO);
        FacturaModel createdFactura = facturaService.createFactura(factura);
        return new ResponseEntity<>(facturaMapper.toDto(createdFactura), HttpStatus.CREATED);
    }
}
