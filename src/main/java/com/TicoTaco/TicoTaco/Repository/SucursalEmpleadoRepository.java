package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.serializable.SucursalEmpleadoId;
import com.TicoTaco.TicoTaco.model.SucursalEmpleadoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalEmpleadoRepository extends JpaRepository<SucursalEmpleadoModel, SucursalEmpleadoId> {
}