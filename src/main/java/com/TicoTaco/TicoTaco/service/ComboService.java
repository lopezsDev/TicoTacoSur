package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.ComboRepository;
import com.TicoTaco.TicoTaco.model.ComboModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComboService {

    private final ComboRepository comboRepository;

    @Autowired
    public ComboService(ComboRepository comboRepository) {
        this.comboRepository = comboRepository;
    }

    public List<ComboModel> getAllCombos() {
        return comboRepository.findAll();
    }

    public Optional<ComboModel> getComboById(Long id) {
        return comboRepository.findById(id);
    }

    public ComboModel createCombo(ComboModel combo) {
        return comboRepository.save(combo);
    }

    public ComboModel updateCombo(long id, ComboModel comboDetails) {
        ComboModel combo = comboRepository.findById(id).orElse(null);

        if (combo != null) {
            combo.setComboId(comboDetails.getComboId());
            combo.setNombreCombo(comboDetails.getNombreCombo());
            combo.setDescripcion(comboDetails.getDescripcion());
            combo.setPrecio(comboDetails.getPrecio());

            return comboRepository.save(combo);
        } else {
            return null;
        }
    }

    public void deleteCombo(long id) {
        comboRepository.deleteById(id);
    }
}