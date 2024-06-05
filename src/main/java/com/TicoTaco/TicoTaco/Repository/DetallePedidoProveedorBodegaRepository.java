package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.serializable.DetallePedidoProveedorBodegaId;
import com.TicoTaco.TicoTaco.model.DetallePedidoProveedorBodegaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoProveedorBodegaRepository extends JpaRepository<DetallePedidoProveedorBodegaModel, DetallePedidoProveedorBodegaId> {
}