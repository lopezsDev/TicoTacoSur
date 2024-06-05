package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.UnidadMedidaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadMedidaRepository extends JpaRepository<UnidadMedidaModel, Long> {
}