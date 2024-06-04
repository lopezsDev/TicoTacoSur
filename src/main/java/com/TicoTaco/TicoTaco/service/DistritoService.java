package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.DistritoRepository;
import com.TicoTaco.TicoTaco.model.DistritoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DistritoService {

    private final DistritoRepository distritoRepository;

    @Autowired
    public DistritoService(DistritoRepository distritoRepository) {
        this.distritoRepository = distritoRepository;
    }

    public List<DistritoModel> getAllDistritos() {
        return distritoRepository.findAll();
    }

    public Optional<DistritoModel> getDistritoById(long id) {
        return distritoRepository.findById(id);
    }

    public DistritoModel createDistrito(DistritoModel distrito) {
        return distritoRepository.save(distrito);
    }

    public DistritoModel updateDistrito(long id, DistritoModel distritoDetails) {
        DistritoModel distrito = distritoRepository.findById(id).orElse(null);

        if (distrito != null) {
            distrito.setDistritoId(distritoDetails.getDistritoId());
            distrito.setDistritoNombre(distritoDetails.getDistritoNombre());
            distrito.setCantonId(distritoDetails.getCantonId());

            return distritoRepository.save(distrito);
        } else {
            return null;
        }
    }

    public void deleteDistrito(long id) {
        distritoRepository.deleteById(id);
    }
}
