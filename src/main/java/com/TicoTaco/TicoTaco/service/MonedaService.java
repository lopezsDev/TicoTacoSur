package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.MonedaRepository;
import com.TicoTaco.TicoTaco.model.MonedaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonedaService {

    private final MonedaRepository monedaRepository;

    @Autowired
    public MonedaService(MonedaRepository monedaRepository) {
        this.monedaRepository = monedaRepository;
    }

    public List<MonedaModel> getAllMonedas() {
        return monedaRepository.findAll();
    }

    public Optional<MonedaModel> getMonedaById(long id) {
        return monedaRepository.findById(id);
    }

    public MonedaModel createMoneda(MonedaModel moneda) {
        return monedaRepository.save(moneda);
    }

    public MonedaModel updateMoneda(long id, MonedaModel monedaDetails) {
        MonedaModel moneda = monedaRepository.findById(id).orElse(null);

        if (moneda != null) {
            moneda.setNombreMoneda(monedaDetails.getNombreMoneda());
            moneda.setSimbolo(monedaDetails.getSimbolo());
            moneda.setTipoCambio(monedaDetails.getTipoCambio());

            return monedaRepository.save(moneda);
        } else {
            return null;
        }
    }

    public void deleteMoneda(long id) {
        monedaRepository.deleteById(id);
    }
}
