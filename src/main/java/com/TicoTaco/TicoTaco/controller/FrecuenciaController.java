package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.model.FrecuenciaModel;
import com.TicoTaco.TicoTaco.service.FrecuenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/frecuencia")
public class FrecuenciaController {

    @Autowired
    private FrecuenciaService frecuenciaService;

    @GetMapping
    public List<FrecuenciaModel> getAllFrecuencias() {
        return frecuenciaService.getAllFrecuencias();
    }

    @GetMapping("/{id}")
    public Optional<FrecuenciaModel> getFrecuenciaById(@PathVariable Long id) {
        return frecuenciaService.getFrecuenciaById(id);
    }

    @PostMapping
    public FrecuenciaModel createFrecuencia(@RequestBody FrecuenciaModel frecuencia) {
        return frecuenciaService.createFrecuencia(frecuencia);
    }

    @PutMapping("/{id}")
    public FrecuenciaModel updateFrecuencia(@PathVariable Integer id, @RequestBody FrecuenciaModel frecuenciaDetails) {
        return frecuenciaService.updateFrecuencia(id, frecuenciaDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteFrecuencia(@PathVariable Integer id) {
        frecuenciaService.deleteFrecuencia(id);
    }
}

