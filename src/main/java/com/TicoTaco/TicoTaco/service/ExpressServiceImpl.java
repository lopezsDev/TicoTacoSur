package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.ExpressRepository;
import com.TicoTaco.TicoTaco.model.ExpressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ExpressServiceImpl implements ExpressService {

    @Autowired
    private ExpressRepository expressRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ExpressModel> getAllExpresses() {
        return expressRepository.findAll();
    }

    @Override
    @Transactional
    public ExpressModel createExpress(ExpressModel express) {
        return expressRepository.save(express);
    }
}
