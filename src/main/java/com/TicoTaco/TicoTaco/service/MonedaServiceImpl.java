package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.MonedaRepository;
import com.TicoTaco.TicoTaco.model.MonedaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MonedaServiceImpl implements MonedaService {

    @Autowired
    private MonedaRepository monedaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<MonedaModel> getAllMonedas() {
        return monedaRepository.findAll();
    }

    @Override
    @Transactional
    public MonedaModel createMoneda(MonedaModel moneda) {
        return monedaRepository.save(moneda);
    }
}
