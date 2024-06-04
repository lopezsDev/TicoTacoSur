package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.EmpleadoRepository;
import com.TicoTaco.TicoTaco.model.EmpleadoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<EmpleadoModel> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    public Optional<EmpleadoModel> getEmpleadoById(long id) {
        return empleadoRepository.findById(id);
    }

    public EmpleadoModel createEmpleado(EmpleadoModel empleado) {
        return empleadoRepository.save(empleado);
    }

    public EmpleadoModel updateEmpleado(long id, EmpleadoModel empleadoDetails) {
        EmpleadoModel empleado = empleadoRepository.findById(id).orElse(null);

        if (empleado != null) {
            empleado.setEmpleadoId(empleadoDetails.getEmpleadoId());
            empleado.setNombreEmpleado(empleadoDetails.getNombreEmpleado());
            empleado.setApellidoEmpleado(empleadoDetails.getApellidoEmpleado());
            empleado.setFechaContratacion(empleadoDetails.getFechaContratacion());
            empleado.setPuestoId(empleadoDetails.getPuestoId());
            empleado.setContactoId(empleadoDetails.getContactoId());
            empleado.setPlanillaId(empleadoDetails.getPlanillaId());
            empleado.setPermisoId(empleadoDetails.getPermisoId());

            return empleadoRepository.save(empleado);
        } else {
            return null;
        }
    }

    public void deleteEmpleado(long id) {
        empleadoRepository.deleteById(id);
    }
}

