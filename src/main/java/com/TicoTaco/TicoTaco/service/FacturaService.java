package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.FacturaRepository;
import com.TicoTaco.TicoTaco.model.FacturaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {

    private final FacturaRepository facturaRepository;

    @Autowired
    public FacturaService(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    public List<FacturaModel> getAllFacturas() {
        return facturaRepository.findAll();
    }

    public Optional<FacturaModel> getFacturaById(long id) {
        return facturaRepository.findById(id);
    }

    public FacturaModel createFactura(FacturaModel factura) {
        return facturaRepository.save(factura);
    }

    public FacturaModel updateFactura(long id, FacturaModel facturaDetails) {
        FacturaModel factura = facturaRepository.findById(id).orElse(null);

        if (factura != null) {
            factura.setFacturaId(facturaDetails.getFacturaId());
            factura.setFechaPedido(facturaDetails.getFechaPedido());
            factura.setMontoTotal(facturaDetails.getMontoTotal());
            factura.setDetalleFacturaId(facturaDetails.getDetalleFacturaId());
            factura.setSucursalId(facturaDetails.getSucursalId());
            factura.setPedidoClienteId(facturaDetails.getPedidoClienteId());
            factura.setMonedaId(facturaDetails.getMonedaId());

            return facturaRepository.save(factura);
        } else {
            return null;
        }
    }

    public void deleteFactura(long id) {
        facturaRepository.deleteById(id);
    }
}
