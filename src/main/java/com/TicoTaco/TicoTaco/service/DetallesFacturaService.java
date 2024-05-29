package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.DetallesFacturaRepository;
import com.TicoTaco.TicoTaco.model.DetallesFacturaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallesFacturaService {

    private final DetallesFacturaRepository detallesFacturaRepository;

    @Autowired
    public DetallesFacturaService(DetallesFacturaRepository detallesFacturaRepository) {
        this.detallesFacturaRepository = detallesFacturaRepository;
    }

    public List<DetallesFacturaModel> getAllDetallesFactura() {
        return detallesFacturaRepository.findAll();
    }

    public Optional<DetallesFacturaModel> getDetallesFacturaById(Long id) {
        return detallesFacturaRepository.findById(id);
    }

    public DetallesFacturaModel createDetallesFactura(DetallesFacturaModel detallesFactura) {
        return detallesFacturaRepository.save(detallesFactura);
    }

    public DetallesFacturaModel updateDetallesFactura(long id, DetallesFacturaModel detallesFacturaDetails) {
        DetallesFacturaModel detallesFactura = detallesFacturaRepository.findById(id).orElse(null);

        if (detallesFactura != null) {
            detallesFactura.setCantidad(detallesFacturaDetails.getCantidad());
            detallesFactura.setPrecioLinea(detallesFacturaDetails.getPrecioLinea());
            detallesFactura.setObservaciones(detallesFacturaDetails.getObservaciones());
            detallesFactura.setProducto(detallesFacturaDetails.getProducto());

            return detallesFacturaRepository.save(detallesFactura);
        } else {
            return null;
        }
    }

    public void deleteDetallesFactura(Long id) {
        detallesFacturaRepository.deleteById(id);
    }
}
