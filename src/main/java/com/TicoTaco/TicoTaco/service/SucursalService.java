package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.dto.SucursalDTO;

import java.util.List;

public interface SucursalService {
    List<SucursalDTO> getAllSucursales();
    SucursalDTO getSucursalById(Long id);
    SucursalDTO createSucursal(SucursalDTO sucursalDTO);
    SucursalDTO updateSucursal(Long id, SucursalDTO sucursalDTO);
    void deleteSucursal(Long id);
}

