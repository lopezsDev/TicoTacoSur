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

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @Autowired
    private FacturaMapper facturaMapper;

    @GetMapping
    public List<FacturaDTO> getAllFacturas() {
        return facturaMapper.toDtoList(facturaService.getAllFacturas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FacturaDTO> getFacturaById(@PathVariable Long id) {
        FacturaModel factura = facturaService.getFacturaById(id);
        if (factura != null) {
            return new ResponseEntity<>(facturaMapper.toDto(factura), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<FacturaDTO> createFactura(@RequestBody FacturaDTO facturaDTO) {
        FacturaModel factura = facturaMapper.toEntity(facturaDTO);
        FacturaModel createdFactura = facturaService.createFactura(factura);
        return new ResponseEntity<>(facturaMapper.toDto(createdFactura), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FacturaDTO> updateFactura(@PathVariable Long id, @RequestBody FacturaDTO facturaDTO) {
        FacturaModel factura = facturaMapper.toEntity(facturaDTO);
        FacturaModel updatedFactura = facturaService.updateFactura(id, factura);
        if (updatedFactura != null) {
            return new ResponseEntity<>(facturaMapper.toDto(updatedFactura), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFactura(@PathVariable Long id) {
        if (facturaService.deleteFactura(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

