package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.PlanillaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanillaRepository extends JpaRepository<PlanillaModel, Long> {
}
