package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.DireccionRepository;
import com.TicoTaco.TicoTaco.model.DireccionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DireccionService {

    private final DireccionRepository direccionRepository;

    @Autowired
    public DireccionService(DireccionRepository direccionRepository) {
        this.direccionRepository = direccionRepository;
    }

    public List<DireccionModel> getAllDirecciones() {
        return direccionRepository.findAll();
    }

    public Optional<DireccionModel> getDireccionById(long id) {
        return direccionRepository.findById(id);
    }

    public DireccionModel createDireccion(DireccionModel direccion) {
        return direccionRepository.save(direccion);
    }

    public DireccionModel updateDireccion(long id, DireccionModel direccionDetails) {
        DireccionModel direccion = direccionRepository.findById(id).orElse(null);

        if (direccion != null) {
            direccion.setDireccionEspecifica(direccionDetails.getDireccionEspecifica());
            direccion.setDistritoId(direccionDetails.getDistritoId());

            return direccionRepository.save(direccion);
        } else {
            return null;
        }
    }

    public void deleteDireccion(Long id) {
        direccionRepository.deleteById(id);
    }
}
