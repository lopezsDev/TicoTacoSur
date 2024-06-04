package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.model.UnidadMedidaModel;
import com.TicoTaco.TicoTaco.Repository.UnidadMedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnidadMedidaService {

    @Autowired
    private UnidadMedidaRepository unidadMedidaRepository;

    public List<UnidadMedidaModel> findAll() {
        return unidadMedidaRepository.findAll();
    }

    public Optional<UnidadMedidaModel> findById(Long id) {
        return unidadMedidaRepository.findById(id);
    }

    public UnidadMedidaModel save(UnidadMedidaModel unidadMedida) {
        return unidadMedidaRepository.save(unidadMedida);
    }

    public UnidadMedidaModel update(Long id, UnidadMedidaModel UnidadMedidaDetails) {
        Optional<UnidadMedidaModel> optionalUnidadMedida = unidadMedidaRepository.findById(id);

        if (optionalUnidadMedida.isPresent()) {
            UnidadMedidaModel UnidadMedida = optionalUnidadMedida.get();
            UnidadMedida.setAbreviatura(UnidadMedidaDetails.getAbreviatura());

            return unidadMedidaRepository.save(UnidadMedida);
        } else {
            throw new RuntimeException("UnidadMedida not found with id " + id);
        }
    }

    public void deleteById(Long id) {
        unidadMedidaRepository.deleteById(id);
    }
}
