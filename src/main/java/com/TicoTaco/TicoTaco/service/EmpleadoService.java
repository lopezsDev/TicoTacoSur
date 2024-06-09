package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.EmpleadoRepository;
import com.TicoTaco.TicoTaco.model.EmpleadoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import java.util.List;

public interface EmpleadoService {
    List<EmpleadoModel> getAllEmpleados();
    EmpleadoModel createEmpleado(EmpleadoModel empleado);
}


