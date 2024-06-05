package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.DetallesFacturaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallesFacturaRepository extends JpaRepository<DetallesFacturaModel, Long> {
}