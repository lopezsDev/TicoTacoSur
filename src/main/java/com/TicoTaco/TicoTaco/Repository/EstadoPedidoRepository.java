package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.EstadoPedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoPedidoRepository extends JpaRepository<EstadoPedidoModel, Long> {
}
