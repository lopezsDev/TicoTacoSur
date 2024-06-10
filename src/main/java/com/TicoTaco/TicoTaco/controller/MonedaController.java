package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.dto.MonedaDTO;
import com.TicoTaco.TicoTaco.mapper.MonedaMapper;
import com.TicoTaco.TicoTaco.model.MonedaModel;
import com.TicoTaco.TicoTaco.service.MonedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/moneda")
public class MonedaController {

    @Autowired
    private MonedaService monedaService;

    @Autowired
    private MonedaMapper monedaMapper;

    @GetMapping
    public ResponseEntity<List<MonedaDTO>> getAllMonedas() {
        List<MonedaModel> monedas = monedaService.getAllMonedas();
        List<MonedaDTO> monedasDTO = monedas.stream()
                .map(monedaMapper::toDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(monedasDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<MonedaDTO> createMoneda(@RequestBody MonedaDTO monedaDTO) {
        MonedaModel moneda = monedaMapper.toEntity(monedaDTO);
        MonedaModel createdMoneda = monedaService.createMoneda(moneda);
        return new ResponseEntity<>(monedaMapper.toDto(createdMoneda), HttpStatus.CREATED);
    }
}
