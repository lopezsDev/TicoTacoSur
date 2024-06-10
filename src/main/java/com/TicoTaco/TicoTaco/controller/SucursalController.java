package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.dto.SucursalDTO;
import com.TicoTaco.TicoTaco.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sucursales")
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @GetMapping
    public ResponseEntity<List<SucursalDTO>> getAllSucursales() {
        List<SucursalDTO> sucursales = sucursalService.getAllSucursales();
        return new ResponseEntity<>(sucursales, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SucursalDTO> getSucursalById(@PathVariable Long id) {
        SucursalDTO sucursal = sucursalService.getSucursalById(id);
        return new ResponseEntity<>(sucursal, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<SucursalDTO> createSucursal(@RequestBody SucursalDTO sucursalDTO) {
        SucursalDTO createdSucursal = sucursalService.createSucursal(sucursalDTO);
        return new ResponseEntity<>(createdSucursal, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SucursalDTO> updateSucursal(@PathVariable Long id, @RequestBody SucursalDTO sucursalDTO) {
        SucursalDTO updatedSucursal = sucursalService.updateSucursal(id, sucursalDTO);
        return new ResponseEntity<>(updatedSucursal, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSucursal(@PathVariable Long id) {
        sucursalService.deleteSucursal(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

