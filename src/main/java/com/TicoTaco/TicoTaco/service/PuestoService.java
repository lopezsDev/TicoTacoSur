package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.PuestoRepository;
import com.TicoTaco.TicoTaco.model.PuestoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PuestoService {

    private final PuestoRepository puestoRepository;

    @Autowired
    public PuestoService(PuestoRepository puestoRepository) {
        this.puestoRepository = puestoRepository;
    }

    public List<PuestoModel> getAllPuestos() {
        return puestoRepository.findAll();
    }

    public Optional<PuestoModel> getPuestoById(long id) {
        return puestoRepository.findById(id);
    }

    public PuestoModel createPuesto(PuestoModel puesto) {
        return puestoRepository.save(puesto);
    }

    public PuestoModel updatePuesto(long id, PuestoModel puestoDetails) {
        PuestoModel puesto = puestoRepository.findById(id).orElse(null);

        if (puesto != null) {
            puesto.setNombrePuesto(puestoDetails.getNombrePuesto());

            return puestoRepository.save(puesto);
        } else {
            return null;
        }
    }

    public void deletePuesto(long id) {
        puestoRepository.deleteById(id);
    }
}
