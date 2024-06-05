package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.FrecuenciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrecuenciaRepository extends JpaRepository<FrecuenciaModel, Long> {
}
