package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.FrecuenciaRepository;
import com.TicoTaco.TicoTaco.model.FrecuenciaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FrecuenciaService {

    private final FrecuenciaRepository frecuenciaRepository;

    @Autowired
    public FrecuenciaService(FrecuenciaRepository frecuenciaRepository) {
        this.frecuenciaRepository = frecuenciaRepository;
    }

    public List<FrecuenciaModel> getAllFrecuencias() {
        return frecuenciaRepository.findAll();
    }

    public Optional<FrecuenciaModel> getFrecuenciaById(long id) {
        return frecuenciaRepository.findById(id);
    }

    public FrecuenciaModel createFrecuencia(FrecuenciaModel frecuencia) {
        return frecuenciaRepository.save(frecuencia);
    }

    public FrecuenciaModel updateFrecuencia(long id, FrecuenciaModel frecuenciaDetails) {
        FrecuenciaModel frecuencia = frecuenciaRepository.findById(id).orElse(null);

        if (frecuencia != null) {
            frecuencia.setFrecuenciaId(frecuenciaDetails.getFrecuenciaId());
            frecuencia.setTipoCliente(frecuenciaDetails.getTipoCliente());

            return frecuenciaRepository.save(frecuencia);
        } else {
            return null;
        }
    }

    public void deleteFrecuencia(long id) {
        frecuenciaRepository.deleteById(id);
    }
}
