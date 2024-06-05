package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.DetallePedidoProveedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoProveedorRepository extends JpaRepository<DetallePedidoProveedorModel, Long> {
}
