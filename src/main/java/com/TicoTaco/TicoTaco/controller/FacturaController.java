package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.model.FacturaModel;
import com.TicoTaco.TicoTaco.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/factura")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping
    public List<FacturaModel> getAllFacturas() {
        return facturaService.getAllFacturas();
    }

    @GetMapping("/{id}")
    public Optional<FacturaModel> getFacturaById(@PathVariable Long id) {
        return facturaService.getFacturaById(id);
    }

    @PostMapping
    public FacturaModel createFactura(@RequestBody FacturaModel factura) {
        return facturaService.createFactura(factura);
    }

    @PutMapping("/{id}")
    public FacturaModel updateFactura(@PathVariable Long id, @RequestBody FacturaModel facturaDetails) {
        return facturaService.updateFactura(id, facturaDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteFactura(@PathVariable Long id) {
        facturaService.deleteFactura(id);
    }
}

