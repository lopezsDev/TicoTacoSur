package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.EmpleadoRepository;
import com.TicoTaco.TicoTaco.model.EmpleadoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<EmpleadoModel> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    @Transactional
    public EmpleadoModel createEmpleado(EmpleadoModel empleado) {
        return empleadoRepository.save(empleado);
    }
}

