package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.model.ComboProductoModel;
import com.TicoTaco.TicoTaco.Repository.ComboProductoRepository;
import com.TicoTaco.TicoTaco.serializable.ComboProductoId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComboProductoService {

    @Autowired
    private ComboProductoRepository comboProductoRepository;

    public List<ComboProductoModel> findAll() {
        return comboProductoRepository.findAll();
    }

    public Optional<ComboProductoModel> findById(ComboProductoId id) {
        return comboProductoRepository.findById(id);
    }

    public ComboProductoModel save(ComboProductoModel comboProducto) {
        return comboProductoRepository.save(comboProducto);
    }

    public ComboProductoModel update(ComboProductoId id, ComboProductoModel ComboProductoDetails) {
        Optional<ComboProductoModel> optionalComboProducto = comboProductoRepository.findById(id);

        if (optionalComboProducto.isPresent()) {
            ComboProductoModel ComboProducto = optionalComboProducto.get();
            ComboProducto.setComboId(ComboProductoDetails.getComboId());
            ComboProducto.setProductoId(ComboProductoDetails.getProductoId());

            return comboProductoRepository.save(ComboProducto);
        } else {
            throw new RuntimeException("ComboProducto not found with id " + id);
        }
    }

    public void deleteById(ComboProductoId id) {
        comboProductoRepository.deleteById(id);
    }
}
