package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.ProveedorRepository;
import com.TicoTaco.TicoTaco.model.ProveedorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService {

    private final ProveedorRepository proveedorRepository;

    @Autowired
    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public List<ProveedorModel> getAllProveedores() {
        return proveedorRepository.findAll();
    }

    public Optional<ProveedorModel> getProveedorById(long id) {
        return proveedorRepository.findById(id);
    }

    public ProveedorModel createProveedor(ProveedorModel proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public ProveedorModel updateProveedor(long id, ProveedorModel proveedorDetails) {
        ProveedorModel proveedor = proveedorRepository.findById(id).orElse(null);

        if (proveedor != null) {
            proveedor.setProveedorId(proveedorDetails.getProveedorId());
            proveedor.setNombreProveedor(proveedorDetails.getNombreProveedor());
            proveedor.setDiasentrega(proveedorDetails.getDiasentrega());
           proveedor.setDireccionId(proveedorDetails.getDireccionId());
            proveedor.setContactoId(proveedorDetails.getContactoId());

            return proveedorRepository.save(proveedor);
        } else {
            return null;
        }
    }

    public void deleteProveedor(long id) {
        proveedorRepository.deleteById(id);
    }
}
