package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.PedidoProveedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoProveedorRepository extends JpaRepository<PedidoProveedorModel, Long> {
}
