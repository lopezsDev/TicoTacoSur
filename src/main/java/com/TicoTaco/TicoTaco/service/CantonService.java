package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.CantonRepository;
import com.TicoTaco.TicoTaco.model.CantonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CantonService {

    private final CantonRepository cantonRepository;

    @Autowired
    public CantonService(CantonRepository cantonRepository) {
        this.cantonRepository = cantonRepository;
    }

    // Obtener todos los elementos
    public List<CantonModel> getAllCantones() {
        return cantonRepository.findAll();
    }

    // Obtener un elemento por su ID
    public Optional<CantonModel> getCantonById(Long id) {
        return cantonRepository.findById(id);
    }

    // Crear un nuevo elemento
    public CantonModel createCanton(CantonModel canton) {
        return cantonRepository.save(canton);
    }

    // Actualizar un elemento existente
    public CantonModel updateCanton(long id, CantonModel cantonDetails) {
        CantonModel canton = cantonRepository.findById(id).orElse(null);

        if (canton != null) {
            canton.setCantonId(cantonDetails.getCantonId());
            canton.setCantonId(cantonDetails.getCantonId());
            canton.setProvinciaId(cantonDetails.getProvinciaId());

            return cantonRepository.save(canton);
        } else {
            return null; // Manejo de error si no se encuentra el elemento
        }
    }

    // Eliminar un elemento existente
    public void deleteCanton(long id) {
        cantonRepository.deleteById(id);
    }
}

