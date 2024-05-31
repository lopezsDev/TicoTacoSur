package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.CategoriaRepository;
import com.TicoTaco.TicoTaco.model.CategoriaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    // Obtener todos los elementos
    public List<CategoriaModel> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    // Obtener un elemento por su ID
    public Optional<CategoriaModel> getCategoriaById(long id) {
        return categoriaRepository.findById(id);
    }

    // Crear un nuevo elemento
    public CategoriaModel createCategoria(CategoriaModel categoria) {
        return categoriaRepository.save(categoria);
    }

    // Actualizar un elemento existente
    public CategoriaModel updateCategoria(Long id, CategoriaModel categoriaDetails) {
        CategoriaModel categoria = categoriaRepository.findById(id).orElse(null);

        if (categoria != null) {
            categoria.setNombreCategoria(categoriaDetails.getNombreCategoria());
            categoria.setDescripcion(categoriaDetails.getDescripcion());

            return categoriaRepository.save(categoria);
        } else {
            return null; // Manejo de error si no se encuentra el elemento
        }
    }

    // Eliminar un elemento existente
    public void deleteCategoria(long id) {
        categoriaRepository.deleteById(id);
    }
}
