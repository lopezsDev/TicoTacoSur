package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.serializable.DetalleFacturaProductoId;
import com.TicoTaco.TicoTaco.model.DetalleFacturaProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleFacturaProductoRepository extends JpaRepository<DetalleFacturaProductoModel, DetalleFacturaProductoId> {
}