package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.FacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<FacturaModel, Long> {
}
