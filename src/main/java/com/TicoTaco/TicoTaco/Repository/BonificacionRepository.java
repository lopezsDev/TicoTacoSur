package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.BonificacionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BonificacionRepository extends JpaRepository<BonificacionModel, Integer> {
}