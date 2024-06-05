package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.PuestoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuestoRepository extends JpaRepository<PuestoModel, Long> {
}
