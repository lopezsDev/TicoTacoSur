package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.SucursalRepository;
import com.TicoTaco.TicoTaco.model.SucursalModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SucursalService {

    private final SucursalRepository sucursalRepository;

    @Autowired
    public SucursalService(SucursalRepository sucursalRepository) {
        this.sucursalRepository = sucursalRepository;
    }

    public List<SucursalModel> getAllSucursales() {
        return sucursalRepository.findAll();
    }

    public Optional<SucursalModel> getSucursalById(long id) {
        return sucursalRepository.findById(id);
    }

    public SucursalModel createSucursal(SucursalModel sucursal) {
        return sucursalRepository.save(sucursal);
    }

    public SucursalModel updateSucursal(long id, SucursalModel sucursalDetails) {
        SucursalModel sucursal = sucursalRepository.findById(id).orElse(null);

        if (sucursal != null) {
            sucursal.setSucursalId(sucursalDetails.getSucursalId());
            sucursal.setNombreSucursal(sucursalDetails.getNombreSucursal());
            sucursal.setDireccionId(sucursalDetails.getDireccionId());
            sucursal.setCajaId(sucursalDetails.getCajaId());
            sucursal.setContacto(sucursalDetails.getContacto());
            return sucursalRepository.save(sucursal);
        } else {
            return null;
        }
    }

    public void deleteSucursal(long id) {
        sucursalRepository.deleteById(id);
    }
}

