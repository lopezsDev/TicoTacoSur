package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.RolRepository;
import com.TicoTaco.TicoTaco.model.RolModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService {

    private final RolRepository rolRepository;

    @Autowired
    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    public List<RolModel> getAllRoles() {
        return rolRepository.findAll();
    }

    public Optional<RolModel> getRolById(long id) {
        return rolRepository.findById(id);
    }

    public RolModel createRol(RolModel rol) {
        return rolRepository.save(rol);
    }

    public RolModel updateRol(long id, RolModel rolDetails) {
        RolModel rol = rolRepository.findById(id).orElse(null);

        if (rol != null) {
            rol.setRol(rolDetails.getRol());

            return rolRepository.save(rol);
        } else {
            return null;
        }
    }

    public void deleteRol(long id) {
        rolRepository.deleteById(id);
    }
}
