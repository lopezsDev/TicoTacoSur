package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.model.MonedaModel;
import java.util.List;

public interface MonedaService {
    List<MonedaModel> getAllMonedas();
    MonedaModel createMoneda(MonedaModel moneda);
}
