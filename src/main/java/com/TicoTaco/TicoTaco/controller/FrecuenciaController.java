package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.dto.FrecuenciaDTO;
import com.TicoTaco.TicoTaco.mapper.FrecuenciaMapper;
import com.TicoTaco.TicoTaco.model.FrecuenciaModel;
import com.TicoTaco.TicoTaco.service.FrecuenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/frecuencias")
public class FrecuenciaController {

    @Autowired
    private FrecuenciaService frecuenciaService;

    @Autowired
    private FrecuenciaMapper frecuenciaMapper;

    @GetMapping
    public ResponseEntity<List<FrecuenciaDTO>> getAllFrecuencias() {
        List<FrecuenciaModel> frecuencias = frecuenciaService.getAllFrecuencias();
        List<FrecuenciaDTO> frecuenciaDTOs = frecuencias.stream()
                .map(frecuenciaMapper::toDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(frecuenciaDTOs, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<FrecuenciaDTO> createFrecuencia(@RequestBody FrecuenciaDTO frecuenciaDTO) {
        FrecuenciaModel frecuencia = frecuenciaMapper.toEntity(frecuenciaDTO);
        FrecuenciaModel createdFrecuencia = frecuenciaService.createFrecuencia(frecuencia);
        return new ResponseEntity<>(frecuenciaMapper.toDto(createdFrecuencia), HttpStatus.CREATED);
    }
}


