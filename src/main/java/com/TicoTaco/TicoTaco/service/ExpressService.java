package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.ExpressRepository;
import com.TicoTaco.TicoTaco.model.ExpressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpressService {

    private final ExpressRepository expressRepository;

    @Autowired
    public ExpressService(ExpressRepository expressRepository) {
        this.expressRepository = expressRepository;
    }

    public List<ExpressModel> getAllExpress() {
        return expressRepository.findAll();
    }

    public Optional<ExpressModel> getExpressById(long id) {
        return expressRepository.findById(id);
    }

    public ExpressModel createExpress(ExpressModel express) {
        return expressRepository.save(express);
    }

    public ExpressModel updateExpress(long id, ExpressModel expressDetails) {
        ExpressModel express = expressRepository.findById(id).orElse(null);

        if (express != null) {
            express.setNombreEncargado(expressDetails.getNombreEncargado());
            express.setHoraRetiro(expressDetails.getHoraRetiro());
            express.setHoraEntrega(expressDetails.getHoraEntrega());
            express.setEmpresaExpressId(expressDetails.getEmpresaExpressId());
            express.setContactoId(expressDetails.getContactoId());

            return expressRepository.save(express);
        } else {
            return null;
        }
    }

    public void deleteExpress(long id) {
        expressRepository.deleteById(id);
    }
}
