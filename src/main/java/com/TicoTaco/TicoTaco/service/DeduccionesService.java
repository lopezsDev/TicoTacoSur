package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.DeduccionesRepository;
import com.TicoTaco.TicoTaco.model.DeduccionesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeduccionesService {

    private final DeduccionesRepository deduccionesRepository;

    @Autowired
    public DeduccionesService(DeduccionesRepository deduccionesRepository) {
        this.deduccionesRepository = deduccionesRepository;
    }

    public List<DeduccionesModel> getAllDeducciones() {
        return deduccionesRepository.findAll();
    }

    public Optional<DeduccionesModel> getDeduccionById(Long id) {
        return deduccionesRepository.findById(id);
    }

    public DeduccionesModel createDeduccion(DeduccionesModel deduccion) {
        return deduccionesRepository.save(deduccion);
    }

    public DeduccionesModel updateDeduccion(long id, DeduccionesModel deduccionDetails) {
        DeduccionesModel deduccion = deduccionesRepository.findById(id).orElse(null);

        if (deduccion != null) {
            deduccion.setNombreDeduccion(deduccionDetails.getNombreDeduccion());
            deduccion.setCantidadDeduccion(deduccionDetails.getCantidadDeduccion());
            deduccion.setPeriodoAplicacion(deduccionDetails.getPeriodoAplicacion());
            deduccion.setEstadoDeduccion(deduccionDetails.getEstadoDeduccion());

            return deduccionesRepository.save(deduccion);
        } else {
            return null;
        }
    }

    public void deleteDeduccion(Long id) {
        deduccionesRepository.deleteById(id);
    }
}
