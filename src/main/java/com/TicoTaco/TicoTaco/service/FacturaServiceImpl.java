package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.FacturaRepository;
import com.TicoTaco.TicoTaco.model.FacturaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<FacturaModel> getAllFacturas() {
        return facturaRepository.findAll();
    }

    @Override
    @Transactional
    public FacturaModel createFactura(FacturaModel factura) {
        factura.getDetalles().forEach(detalle -> detalle.setFacturaId(factura));
        return facturaRepository.save(factura);
    }
}


