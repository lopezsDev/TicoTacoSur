package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.BonificacionRepository;
import com.TicoTaco.TicoTaco.model.BonificacionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BonificacionService {

    private final BonificacionRepository bonificacionRepository;

    @Autowired
    public BonificacionService(BonificacionRepository bonificacionRepository) {
        this.bonificacionRepository = bonificacionRepository;
    }

    // Obtener todos los elementos
    public List<BonificacionModel> getAllBonificaciones() {
        return bonificacionRepository.findAll();
    }

    // Obtener un elemento por su ID
    public Optional<BonificacionModel> getBonificacionById(int id) {
        return bonificacionRepository.findById(id);
    }

    // Crear un nuevo elemento
    public BonificacionModel createBonificacion(BonificacionModel bonificacion) {
        return bonificacionRepository.save(bonificacion);
    }

    // Actualizar un elemento existente
    public BonificacionModel updateBonificacion(int id, BonificacionModel bonificacionDetails) {
        BonificacionModel bonificacion = bonificacionRepository.findById(id).orElse(null);

        if (bonificacion != null) {
            bonificacion.setNombreBonificacion(bonificacionDetails.getNombreBonificacion());

            return bonificacionRepository.save(bonificacion);
        } else {
            return null; // Manejo de error si no se encuentra el elemento
        }
    }

    // Eliminar un elemento existente
    public void deleteBonificacion(int id) {
        bonificacionRepository.deleteById(id);
    }
}
