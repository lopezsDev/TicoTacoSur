package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.TipoEntregaRepository;
import com.TicoTaco.TicoTaco.model.TipoEntregaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoEntregaService {

    private final TipoEntregaRepository tipoEntregaRepository;

    @Autowired
    public TipoEntregaService(TipoEntregaRepository tipoEntregaRepository) {
        this.tipoEntregaRepository = tipoEntregaRepository;
    }

    public List<TipoEntregaModel> getAllTiposEntrega() {
        return tipoEntregaRepository.findAll();
    }

    public Optional<TipoEntregaModel> getTipoEntregaById(long id) {
        return tipoEntregaRepository.findById(id);
    }

    public TipoEntregaModel createTipoEntrega(TipoEntregaModel tipoEntrega) {
        return tipoEntregaRepository.save(tipoEntrega);
    }

    public TipoEntregaModel updateTipoEntrega(long id, TipoEntregaModel tipoEntregaDetails) {
        TipoEntregaModel tipoEntrega = tipoEntregaRepository.findById(id).orElse(null);

        if (tipoEntrega != null) {
            tipoEntrega.setEntrega(tipoEntregaDetails.getEntrega());

            return tipoEntregaRepository.save(tipoEntrega);
        } else {
            return null;
        }
    }

    public void deleteTipoEntrega(long id) {
        tipoEntregaRepository.deleteById(id);
    }
}
