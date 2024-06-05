package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.DistritoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistritoRepository extends JpaRepository<DistritoModel, Long> {
}
