package com.TicoTaco.TicoTaco.service;

import java.util.List;
import com.TicoTaco.TicoTaco.model.FacturaModel;

import java.util.List;

public interface FacturaService {
    List<FacturaModel> getAllFacturas();
    FacturaModel createFactura(FacturaModel factura);
}

