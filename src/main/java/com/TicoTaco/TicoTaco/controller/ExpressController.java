package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.dto.ExpressDTO;
import com.TicoTaco.TicoTaco.mapper.ExpressMapper;
import com.TicoTaco.TicoTaco.model.ExpressModel;
import com.TicoTaco.TicoTaco.service.ExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/express")
public class ExpressController {

    @Autowired
    private ExpressService expressService;

    @Autowired
    private ExpressMapper expressMapper;

    @GetMapping
    public ResponseEntity<List<ExpressDTO>> getAllExpresses() {
        List<ExpressModel> expresses = expressService.getAllExpresses();
        List<ExpressDTO> expressDTOs = expresses.stream()
                .map(expressMapper::toDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(expressDTOs, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ExpressDTO> createExpress(@RequestBody ExpressDTO expressDTO) {
        ExpressModel express = expressMapper.toEntity(expressDTO);
        ExpressModel createdExpress = expressService.createExpress(express);
        return new ResponseEntity<>(expressMapper.toDto(createdExpress), HttpStatus.CREATED);
    }
}
