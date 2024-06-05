package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.EmpleadoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<EmpleadoModel, Long> {
}
