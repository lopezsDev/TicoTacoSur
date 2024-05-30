package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.model.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository  extends JpaRepository<ProductoModel, Long> {
}
