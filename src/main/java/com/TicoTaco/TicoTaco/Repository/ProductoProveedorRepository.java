package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.serializable.ProductoProveedorId;
import com.TicoTaco.TicoTaco.model.ProductoProveedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoProveedorRepository extends JpaRepository<ProductoProveedorModel, ProductoProveedorId> {
}