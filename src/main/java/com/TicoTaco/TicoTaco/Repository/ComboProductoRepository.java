package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.serializable.ComboProductoId;
import com.TicoTaco.TicoTaco.model.ComboProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComboProductoRepository extends JpaRepository<ComboProductoModel, ComboProductoId> {
}