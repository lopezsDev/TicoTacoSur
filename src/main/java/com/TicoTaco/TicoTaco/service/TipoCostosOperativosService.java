package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.TipoCostosOperativosRepository;
import com.TicoTaco.TicoTaco.model.TipoCostosOperativosModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoCostosOperativosService {

    private final TipoCostosOperativosRepository tipoCostosOperativosRepository;

    @Autowired
    public TipoCostosOperativosService(TipoCostosOperativosRepository tipoCostosOperativosRepository) {
        this.tipoCostosOperativosRepository = tipoCostosOperativosRepository;
    }

    public List<TipoCostosOperativosModel> getAllTiposCostosOperativos() {
        return tipoCostosOperativosRepository.findAll();
    }

    public Optional<TipoCostosOperativosModel> getTipoCostosOperativosById(long id) {
        return tipoCostosOperativosRepository.findById(id);
    }

    public TipoCostosOperativosModel createTipoCostosOperativos(TipoCostosOperativosModel tipoCostosOperativos) {
        return tipoCostosOperativosRepository.save(tipoCostosOperativos);
    }

    public TipoCostosOperativosModel updateTipoCostosOperativos(long id, TipoCostosOperativosModel tipoCostosOperativosDetails) {
        TipoCostosOperativosModel tipoCostosOperativos = tipoCostosOperativosRepository.findById(id).orElse(null);

        if (tipoCostosOperativos != null) {
            tipoCostosOperativos.setNombreTipoCostosOperativos(tipoCostosOperativosDetails.getNombreTipoCostosOperativos());
            return tipoCostosOperativosRepository.save(tipoCostosOperativos);
        } else {
            return null;
        }
    }

    public void deleteTipoCostosOperativos(long id) {

        tipoCostosOperativosRepository.deleteById(id);
    }
}
