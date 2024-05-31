package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.FormaPagoRepository;
import com.TicoTaco.TicoTaco.model.FormaPagoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormaPagoService {

    private final FormaPagoRepository formaPagoRepository;

    @Autowired
    public FormaPagoService(FormaPagoRepository formaPagoRepository) {
        this.formaPagoRepository = formaPagoRepository;
    }

    public List<FormaPagoModel> getAllFormasPago() {
        return formaPagoRepository.findAll();
    }

    public Optional<FormaPagoModel> getFormaPagoById(long id) {
        return formaPagoRepository.findById(id);
    }

    public FormaPagoModel createFormaPago(FormaPagoModel formaPago) {
        return formaPagoRepository.save(formaPago);
    }

    public FormaPagoModel updateFormaPago(long id, FormaPagoModel formaPagoDetails) {
        FormaPagoModel formaPago = formaPagoRepository.findById(id).orElse(null);

        if (formaPago != null) {
            formaPago.setTipoPago(formaPagoDetails.getTipoPago());

            return formaPagoRepository.save(formaPago);
        } else {
            return null;
        }
    }

    public void deleteFormaPago(long id) {
        formaPagoRepository.deleteById(id);
    }
}
