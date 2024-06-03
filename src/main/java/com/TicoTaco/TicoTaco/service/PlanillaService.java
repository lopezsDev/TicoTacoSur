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
            planilla.setHorasextras(planillaDetails.getHorasextras());
            planilla.setSalariototal(planillaDetails.getSalariototal());
            planilla.setSalariobase(planillaDetails.getSalariobase());
            planilla.setFechapago(planillaDetails.getFechapago());
            planilla.setDeduccion(planillaDetails.getDeduccion());
            planilla.setBonificacion(planillaDetails.getBonificacion());
            return planillaRepository.save(planilla);
        } else {
            return null;
        }
    }

    public void deletePlanilla(long id) {
        planillaRepository.deleteById(id);
    }
}
