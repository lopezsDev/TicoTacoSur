package com.TicoTaco.TicoTaco.service;

import java.util.List;
import com.TicoTaco.TicoTaco.model.FacturaModel;

public interface FacturaService {
    List<FacturaModel> getAllFacturas();
    FacturaModel getFacturaById(Long id);
    FacturaModel createFactura(FacturaModel factura);
    FacturaModel updateFactura(Long id, FacturaModel factura);
    boolean deleteFactura(Long id);
}
