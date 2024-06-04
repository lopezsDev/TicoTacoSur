package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.model.SucursalEmpleadoModel;
import com.TicoTaco.TicoTaco.Repository.SucursalEmpleadoRepository;
import com.TicoTaco.TicoTaco.serializable.SucursalEmpleadoId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SucursalEmpleadoService {

    @Autowired
    private SucursalEmpleadoRepository sucursalEmpleadoRepository;

    public List<SucursalEmpleadoModel> findAll() {
        return sucursalEmpleadoRepository.findAll();
    }

    public Optional<SucursalEmpleadoModel> findById(SucursalEmpleadoId id) {
        return sucursalEmpleadoRepository.findById(id);
    }

    public SucursalEmpleadoModel save(SucursalEmpleadoModel sucursalEmpleado) {
        return sucursalEmpleadoRepository.save(sucursalEmpleado);
    }

    public SucursalEmpleadoModel update(SucursalEmpleadoId id, SucursalEmpleadoModel SucursalEmpleadoDetails) {
        Optional<SucursalEmpleadoModel> optionalSucursalEmpleado = sucursalEmpleadoRepository.findById(id);

        if (optionalSucursalEmpleado.isPresent()) {
            SucursalEmpleadoModel SucursalEmpleado = optionalSucursalEmpleado.get();
            SucursalEmpleado.setEmpleadoId(SucursalEmpleadoDetails.getEmpleadoId());
            SucursalEmpleado.setSucursalId(SucursalEmpleadoDetails.getSucursalId());

            return sucursalEmpleadoRepository.save(SucursalEmpleado);
        } else {
            throw new RuntimeException("SucursalEmpleado not found with id " + id);
        }
    }

    public void deleteById(SucursalEmpleadoId id) {
        sucursalEmpleadoRepository.deleteById(id);
    }
}
