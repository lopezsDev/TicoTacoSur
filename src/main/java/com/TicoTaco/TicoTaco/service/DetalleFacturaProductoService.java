package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.model.DetalleFacturaProductoModel;
import com.TicoTaco.TicoTaco.Repository.DetalleFacturaProductoRepository;
import com.TicoTaco.TicoTaco.serializable.DetalleFacturaProductoId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleFacturaProductoService {

    @Autowired
    private DetalleFacturaProductoRepository detalleFacturaProductoRepository;

    public List<DetalleFacturaProductoModel> findAll() {
        return detalleFacturaProductoRepository.findAll();
    }

    public Optional<DetalleFacturaProductoModel> findById(DetalleFacturaProductoId id) {
        return detalleFacturaProductoRepository.findById(id);
    }

    public DetalleFacturaProductoModel save(DetalleFacturaProductoModel detalleFacturaProducto) {
        return detalleFacturaProductoRepository.save(detalleFacturaProducto);
    }

    public DetalleFacturaProductoModel update(DetalleFacturaProductoId id, DetalleFacturaProductoModel DetalleFacturaProductoDetails) {
        Optional<DetalleFacturaProductoModel> optionalDetalleFacturaProducto = detalleFacturaProductoRepository.findById(id);

        if (optionalDetalleFacturaProducto.isPresent()) {
            DetalleFacturaProductoModel detalleFacturaProductoModel = optionalDetalleFacturaProducto.get();
            detalleFacturaProductoModel.setDetalleFacturaId(DetalleFacturaProductoDetails.getDetalleFacturaId());
            detalleFacturaProductoModel.setProductoId(DetalleFacturaProductoDetails.getProductoId());

            return detalleFacturaProductoRepository.save(detalleFacturaProductoModel);
        } else {
            throw new RuntimeException("DetalleFacturaProducto not found with id " + id);
        }
    }

    public void deleteById(DetalleFacturaProductoId id) {
        detalleFacturaProductoRepository.deleteById(id);
    }
}
