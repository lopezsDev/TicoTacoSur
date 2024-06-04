package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.ProductoRepository;
import com.TicoTaco.TicoTaco.model.ProductoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<ProductoModel> getAllProductos() {
        return productoRepository.findAll();
    }

    public Optional<ProductoModel> getProductoById(long id) {
        return productoRepository.findById(id);
    }

    public ProductoModel createProducto(ProductoModel producto) {
        return productoRepository.save(producto);
    }

    public ProductoModel updateProducto(long id, ProductoModel productoDetails) {
        ProductoModel producto = productoRepository.findById(id).orElse(null);

        if (producto != null) {
            producto.setNombreProducto(productoDetails.getNombreProducto());
            producto.setDescripcion(productoDetails.getDescripcion());
            producto.setPrecio(productoDetails.getPrecio());
            producto.setVencimiento(productoDetails.getVencimiento());
            producto.setCategoriaId(productoDetails.getCategoriaId());
            producto.setMedidaId(productoDetails.getMedidaId());

            return productoRepository.save(producto);
        } else {
            return null;
        }
    }

    public void deleteProducto(long id) {
        productoRepository.deleteById(id);
    }
}
