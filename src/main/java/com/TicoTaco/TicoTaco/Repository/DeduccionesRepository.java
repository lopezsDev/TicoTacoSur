package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.DeduccionesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeduccionesRepository extends JpaRepository<DeduccionesModel, Long> {
}
