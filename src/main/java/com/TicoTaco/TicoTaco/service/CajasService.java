package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.CajasRepository;
import com.TicoTaco.TicoTaco.model.CajasModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CajasService {

    private final CajasRepository cajasRepository;

    @Autowired
    public CajasService(CajasRepository cajasRepository) {
        this.cajasRepository = cajasRepository;
    }

    // Obtener todos los elementos
    public List<CajasModel> getAllCajas() {
        return cajasRepository.findAll();
    }

    // Obtener un elemento por su ID
    public Optional<CajasModel> getCajasById(int id) {
        return cajasRepository.findById(id);
    }

    // Crear un nuevo elemento
    public CajasModel createCajas(CajasModel cajas) {
        return cajasRepository.save(cajas);
    }

    // Actualizar un elemento existente
    public CajasModel updateCajas(int id, CajasModel cajasDetails) {
        CajasModel cajas = cajasRepository.findById(id).orElse(null);

        if (cajas != null) {
            cajas.setCajasId(cajasDetails.getCajasId());
            cajas.setApertura(cajasDetails.getApertura());
            cajas.setCierre(cajasDetails.getCierre());
            cajas.setInicial(cajasDetails.getInicial());
            cajas.setFinalMonto(cajasDetails.getFinalMonto());
            cajas.setFormaPagoId(cajasDetails.getFormaPagoId());
            cajas.setFacturaId(cajasDetails.getFacturaId());

            return cajasRepository.save(cajas);
        } else {
            return null; // Manejo de error si no se encuentra el elemento
        }
    }

    // Eliminar un elemento existente
    public void deleteCajas(int id) {
        cajasRepository.deleteById(id);
    }
}

