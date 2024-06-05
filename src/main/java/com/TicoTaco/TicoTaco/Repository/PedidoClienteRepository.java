package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.PedidoClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoClienteRepository extends JpaRepository<PedidoClienteModel, Long> {
}
