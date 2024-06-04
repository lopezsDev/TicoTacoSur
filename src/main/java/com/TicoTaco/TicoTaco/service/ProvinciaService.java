package com.TicoTaco.TicoTaco.service;
import com.TicoTaco.TicoTaco.Repository.ProvinciaRepository;
import com.TicoTaco.TicoTaco.model.ProvinciaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinciaService {

    private final ProvinciaRepository provinciaRepository;

    @Autowired
    public ProvinciaService(ProvinciaRepository provinciaRepository) {
        this.provinciaRepository = provinciaRepository;
    }

    public List<ProvinciaModel> getAllProvincias() {
        return provinciaRepository.findAll();
    }

    public Optional<ProvinciaModel> getProvinciaById(long id) {
        return provinciaRepository.findById(id);
    }

    public ProvinciaModel createProvincia(ProvinciaModel provincia) {
        return provinciaRepository.save(provincia);
    }

    public ProvinciaModel updateProvincia(long id, ProvinciaModel provinciaDetails) {
        ProvinciaModel provincia = provinciaRepository.findById(id).orElse(null);

        if (provincia != null) {
            provincia.setProvinciaId(provinciaDetails.getProvinciaId());
            provincia.setProvincia(provinciaDetails.getProvincia());

            return provinciaRepository.save(provincia);
        } else {
            return null;
        }
    }

    public void deleteProvincia(long id) {
        provinciaRepository.deleteById(id);
    }
}
