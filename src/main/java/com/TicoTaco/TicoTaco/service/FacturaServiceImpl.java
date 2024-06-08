package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.FacturaRepository;
import com.TicoTaco.TicoTaco.exceptions.ResourceNotFoundException;
import com.TicoTaco.TicoTaco.model.FacturaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public List<FacturaModel> getAllFacturas() {
        return facturaRepository.findAll();
    }

    @Override
    public FacturaModel getFacturaById(Long id) {
        Optional<FacturaModel> optionalFactura = facturaRepository.findById(id);
        if (optionalFactura.isPresent()) {
            return optionalFactura.get();
        } else {
            throw new ResourceNotFoundException("Factura not found with id: " + id);
        }
    }

    @Override
    public FacturaModel createFactura(FacturaModel factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public FacturaModel updateFactura(Long id, FacturaModel factura) {
        if (!facturaRepository.existsById(id)) {
            throw new ResourceNotFoundException("Factura not found with id: " + id);
        }
        factura.setFacturaId(id);
        return facturaRepository.save(factura);
    }

    @Override
    public boolean deleteFactura(Long id) {
        if (!facturaRepository.existsById(id)) {
            throw new ResourceNotFoundException("Factura not found with id: " + id);
        }
        facturaRepository.deleteById(id);
        return false;
    }
}


