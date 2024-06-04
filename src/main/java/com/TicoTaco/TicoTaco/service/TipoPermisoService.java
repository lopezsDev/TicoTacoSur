package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.TipoPermisoRepository;
import com.TicoTaco.TicoTaco.model.TipoPermisoModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TipoPermisoService {
    private final TipoPermisoRepository tipoPermisoRepository;

    @Autowired
    public TipoPermisoService(TipoPermisoRepository tipoPermisoRepository) {
        this.tipoPermisoRepository = tipoPermisoRepository;
    }

    public List<TipoPermisoModel>getAllTipoPermiso(){
        return tipoPermisoRepository.findAll();
    }

    /*public Optional<TipoPermisoModel> getTipoPermisoById(long id){return TipoPermisoRepository.findById(id);
    }*/

    public TipoPermisoModel createTipoPermiso(TipoPermisoModel tipoPermiso){
        return tipoPermisoRepository.save(tipoPermiso);
    }

    public TipoPermisoRepository updateTipoPermisoRepository(long id, TipoPermisoModel tipoPermisoDetails) {
        TipoPermisoModel tipopermiso = tipoPermisoRepository.findById(id).orElse(null);
        if (tipopermiso != null) {
            tipopermiso.setTipopermiso(tipoPermisoDetails.getTipopermiso());
            tipopermiso.setNompermiso(tipoPermisoDetails.getNompermiso());
            return (TipoPermisoRepository) tipoPermisoRepository.save(tipopermiso);
        }else {

            return null;
        }


    }

    public void deleteTipoPermiso(long id) {
        tipoPermisoRepository.deleteById(id);
    }
}

