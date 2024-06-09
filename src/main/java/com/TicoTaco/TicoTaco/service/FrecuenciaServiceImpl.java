package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.FrecuenciaRepository;
import com.TicoTaco.TicoTaco.model.FrecuenciaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FrecuenciaServiceImpl implements FrecuenciaService {

    @Autowired
    private FrecuenciaRepository frecuenciaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<FrecuenciaModel> getAllFrecuencias() {
        return frecuenciaRepository.findAll();
    }

    @Override
    @Transactional
    public FrecuenciaModel createFrecuencia(FrecuenciaModel frecuencia) {
        return frecuenciaRepository.save(frecuencia);
    }
}
