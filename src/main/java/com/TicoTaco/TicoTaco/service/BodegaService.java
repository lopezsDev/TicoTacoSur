package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.BodegaRepository;
import com.TicoTaco.TicoTaco.model.BodegaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BodegaService {

    private final BodegaRepository bodegaRepository;

    @Autowired
    public BodegaService(BodegaRepository bodegaRepository) {
        this.bodegaRepository = bodegaRepository;
    }

    // Obtener todos los elementos
    public List<BodegaModel> getAllBodegas() {
        return bodegaRepository.findAll();
    }

    // Obtener un elemento por su ID
    public Optional<BodegaModel> getBodegaById(int id) {
        return bodegaRepository.findById(id);
    }

    // Crear un nuevo elemento
    public BodegaModel createBodega(BodegaModel bodega) {
        return bodegaRepository.save(bodega);
    }

    // Actualizar un elemento existente
    public BodegaModel updateBodega(int id, BodegaModel bodegaDetails) {
        BodegaModel bodega = bodegaRepository.findById(id).orElse(null);

        if (bodega != null) {
            bodega.setStock(bodegaDetails.getStock());
            bodega.setCantidadMinima(bodegaDetails.getCantidadMinima());
            bodega.setIngreso(bodegaDetails.getIngreso());
            bodega.setProducto(bodegaDetails.getProducto());
            bodega.setSucursal(bodegaDetails.getSucursal());

            return bodegaRepository.save(bodega);
        } else {
            return null; // Manejo de error si no se encuentra el elemento
        }
    }

    // Eliminar un elemento existente
    public void deleteBodega(int id) {
        bodegaRepository.deleteById(id);
    }
}
