package com.TicoTaco.TicoTaco.service;
import com.TicoTaco.TicoTaco.Repository.PlanillaRepository;
import com.TicoTaco.TicoTaco.model.PlanillaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlanillaService {

    private final PlanillaRepository planillaRepository;

    @Autowired
    public PlanillaService(PlanillaRepository planillaRepository) {
        this.planillaRepository = planillaRepository;
    }

    public List<PlanillaModel> getAllPlanillas() {
        return planillaRepository.findAll();
    }

    public Optional<PlanillaModel> getPlanillaById(long id) {
        return planillaRepository.findById(id);
    }

    public PlanillaModel createPlanilla(PlanillaModel planilla) {
        return planillaRepository.save(planilla);
    }

    public PlanillaModel updatePlanilla(long id, PlanillaModel planillaDetails) {
        PlanillaModel planilla = planillaRepository.findById(id).orElse(null);

        if (planilla != null) {
            planilla.setPlanillaId(planilla.getPlanillaId());
            planilla.setHorasExtraId(planillaDetails.getHorasExtraId());
            planilla.setSalarioTotal(planillaDetails.getSalarioTotal());
            planilla.setPuestoId(planillaDetails.getPuestoId());
            planilla.setFechaPago(planillaDetails.getFechaPago());
            planilla.setDeduccionId(planillaDetails.getDeduccionId());
            planilla.setBonificacionId(planillaDetails.getBonificacionId());
            return planillaRepository.save(planilla);
        } else {
            return null;
        }
    }

    public void deletePlanilla(long id) {
        planillaRepository.deleteById(id);
    }
}
