package com.TicoTaco.TicoTaco.Repository;

import com.TicoTaco.TicoTaco.serializable.ProductoProveedorId;
import com.TicoTaco.TicoTaco.model.ProductoProveedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoProveedorRepository extends JpaRepository<ProductoProveedorModel, ProductoProveedorId> {
}