package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.TipoPermisoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPermisoRepository extends JpaRepository<TipoPermisoModel, Long> {
}