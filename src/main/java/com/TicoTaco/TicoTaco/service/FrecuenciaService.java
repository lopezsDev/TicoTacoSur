package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.FrecuenciaRepository;
import com.TicoTaco.TicoTaco.model.FrecuenciaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import java.util.List;

public interface FrecuenciaService {
    List<FrecuenciaModel> getAllFrecuencias();
    FrecuenciaModel createFrecuencia(FrecuenciaModel frecuencia);
}
