package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.EmpresaExpressRepository;
import com.TicoTaco.TicoTaco.model.EmpresaExpressModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaExpressService {

    private final EmpresaExpressRepository empresaExpressRepository;

    @Autowired
    public EmpresaExpressService(EmpresaExpressRepository empresaExpressRepository) {
        this.empresaExpressRepository = empresaExpressRepository;
    }

    public List<EmpresaExpressModel> getAllEmpresasExpress() {
        return empresaExpressRepository.findAll();
    }

    public Optional<EmpresaExpressModel> getEmpresaExpressById(long id) {
        return empresaExpressRepository.findById(id);
    }

    public EmpresaExpressModel createEmpresaExpress(EmpresaExpressModel empresaExpress) {
        return empresaExpressRepository.save(empresaExpress);
    }

    public EmpresaExpressModel updateEmpresaExpress(long id, EmpresaExpressModel empresaExpressDetails) {
        EmpresaExpressModel empresaExpress = empresaExpressRepository.findById(id).orElse(null);

        if (empresaExpress != null) {
            empresaExpress.setEmpresaExpressId(empresaExpressDetails.getEmpresaExpressId());
            empresaExpress.setNombreEmpresa(empresaExpressDetails.getNombreEmpresa());
            empresaExpress.setContactoId(empresaExpressDetails.getContactoId());
            empresaExpress.setDireccionId(empresaExpressDetails.getDireccionId());

            return empresaExpressRepository.save(empresaExpress);
        } else {
            return null;
        }
    }

    public void deleteEmpresaExpress(long id) {
        empresaExpressRepository.deleteById(id);
    }
}
