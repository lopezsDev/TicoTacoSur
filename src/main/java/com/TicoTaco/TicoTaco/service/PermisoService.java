package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.PermisoRepository;
import com.TicoTaco.TicoTaco.model.PermisoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermisoService {

    private final PermisoRepository permisoRepository;

    @Autowired
    public PermisoService(PermisoRepository permisoRepository) {
        this.permisoRepository = permisoRepository;
    }

    public List<PermisoModel> getAllPermisos() {
        return permisoRepository.findAll();
    }

    public Optional<PermisoModel> getPermisoById(long id) {
        return permisoRepository.findById(id);
    }

    public PermisoModel createPermiso(PermisoModel permiso) {
        return permisoRepository.save(permiso);
    }

    public PermisoModel updatePermiso(long id, PermisoModel permisoDetails) {
        PermisoModel permiso = permisoRepository.findById(id).orElse(null);

        if (permiso != null) {
            permiso.setPermisoId(permisoDetails.getPermisoId());
            permiso.setTipoPermisoId(permisoDetails.getTipoPermisoId());
            permiso.setEstado(permisoDetails.getEstado());
            permiso.setMotivo(permisoDetails.getMotivo());
            permiso.setFechaInicio(permisoDetails.getFechaInicio());
            permiso.setFechaFinal(permisoDetails.getFechaFinal());

            return permisoRepository.save(permiso);
        } else {
            return null;
        }
    }

    public void deletePermiso(long id) {
        permisoRepository.deleteById(id);
    }
}
