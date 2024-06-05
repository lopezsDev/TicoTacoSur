package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.PermisoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermisoRepository extends JpaRepository<PermisoModel, Long> {
}
