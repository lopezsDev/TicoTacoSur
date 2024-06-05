package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.serializable.ComboProductoId;
import com.TicoTaco.TicoTaco.model.ComboProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComboProductoRepository extends JpaRepository<ComboProductoModel, ComboProductoId> {
}