package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.ProductoModel;
import com.TicoTaco.TicoTaco.model.ProveedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepository extends JpaRepository<ProveedorModel, Long> {
}
