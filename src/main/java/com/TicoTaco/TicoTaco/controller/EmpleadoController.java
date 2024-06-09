package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.dto.EmpleadoDTO;
import com.TicoTaco.TicoTaco.mapper.EmpleadoMapper;
import com.TicoTaco.TicoTaco.model.EmpleadoModel;
import com.TicoTaco.TicoTaco.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @Autowired
    private EmpleadoMapper empleadoMapper;

    @GetMapping
    public ResponseEntity<List<EmpleadoDTO>> getAllEmpleados() {
        List<EmpleadoModel> empleados = empleadoService.getAllEmpleados();
        List<EmpleadoDTO> empleadosDTO = empleados.stream()
                .map(empleadoMapper::toDto)
                .collect(Collectors.toList());
        return new ResponseEntity<>(empleadosDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<EmpleadoDTO> createEmpleado(@RequestBody EmpleadoDTO empleadoDTO) {
        EmpleadoModel empleado = empleadoMapper.toEntity(empleadoDTO);
        EmpleadoModel createdEmpleado = empleadoService.createEmpleado(empleado);
        return new ResponseEntity<>(empleadoMapper.toDto(createdEmpleado), HttpStatus.CREATED);
    }
}
