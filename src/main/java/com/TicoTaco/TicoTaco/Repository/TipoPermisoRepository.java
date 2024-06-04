package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.AdminRestauranteModel;
import com.TicoTaco.TicoTaco.model.TipoPermisoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoPermisoRepository  extends JpaRepository<TipoPermisoModel, Long> {
}
