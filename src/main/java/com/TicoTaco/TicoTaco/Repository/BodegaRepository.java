package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.BodegaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodegaRepository extends JpaRepository<BodegaModel, Integer> {
}