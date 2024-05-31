package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.CostosOperativosRepository;
import com.TicoTaco.TicoTaco.model.CostosOperativosModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CostosOperativosService {

    private final CostosOperativosRepository costosOperativosRepository;

    @Autowired
    public CostosOperativosService(CostosOperativosRepository costosOperativosRepository) {
        this.costosOperativosRepository = costosOperativosRepository;
    }

    public List<CostosOperativosModel> getAllCostosOperativos() {
        return costosOperativosRepository.findAll();
    }

    public Optional<CostosOperativosModel> getCostosOperativosById(Long id) {
        return costosOperativosRepository.findById(id);
    }

    public CostosOperativosModel createCostosOperativos(CostosOperativosModel costosOperativos) {
        return costosOperativosRepository.save(costosOperativos);
    }

    public CostosOperativosModel updateCostosOperativos(long id, CostosOperativosModel costosOperativosDetails) {
        CostosOperativosModel costosOperativos = costosOperativosRepository.findById(id).orElse(null);

        if (costosOperativos != null) {
            costosOperativos.setNombreCostosOperativos(costosOperativosDetails.getNombreCostosOperativos());

            return costosOperativosRepository.save(costosOperativos);
        } else {
            return null;
        }
    }

    public void deleteCostosOperativos(long id) {
        costosOperativosRepository.deleteById(id);
    }
}
