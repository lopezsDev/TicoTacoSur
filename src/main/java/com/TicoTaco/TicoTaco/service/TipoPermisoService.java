package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.TipoPermisoRepository;
import com.TicoTaco.TicoTaco.model.TipoPermisoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoPermisoService {
    private final TipoPermisoRepository tipoPermisoRepository;

    @Autowired
    public TipoPermisoService(TipoPermisoRepository tipoPermisoRepository) {
        this.tipoPermisoRepository = tipoPermisoRepository;
    }

    public List<TipoPermisoModel> getAllTipoPermiso() {
        return tipoPermisoRepository.findAll();
    }

    public Optional<TipoPermisoModel> getTipoPermisoById(long id) {
        return tipoPermisoRepository.findById(id);
    }

    public TipoPermisoModel createTipoPermiso(TipoPermisoModel tipoPermiso) {
        return tipoPermisoRepository.save(tipoPermiso);
    }

    public TipoPermisoModel updateTipoPermiso(long id, TipoPermisoModel tipoPermisoDetails) {
        TipoPermisoModel tipoPermiso = tipoPermisoRepository.findById(id).orElse(null);
        if (tipoPermiso != null) {
            tipoPermiso.setTipoPermisoId(tipoPermisoDetails.getTipoPermisoId());
            tipoPermiso.setNombrePermiso(tipoPermisoDetails.getNombrePermiso());
            return tipoPermisoRepository.save(tipoPermiso);
        } else {
            return null;
        }
    }

    public void deleteTipoPermiso(long id) {
        tipoPermisoRepository.deleteById(id);
    }
}