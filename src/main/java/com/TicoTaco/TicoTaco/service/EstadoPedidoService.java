package com.TicoTaco.TicoTaco.service;

import com.TicoTaco.TicoTaco.Repository.EstadoPedidoRepository;
import com.TicoTaco.TicoTaco.model.EstadoPedidoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoPedidoService {

    private final EstadoPedidoRepository estadoPedidoRepository;

    @Autowired
    public EstadoPedidoService(EstadoPedidoRepository estadoPedidoRepository) {
        this.estadoPedidoRepository = estadoPedidoRepository;
    }

    public List<EstadoPedidoModel> getAllEstadosPedido() {
        return estadoPedidoRepository.findAll();
    }

    public Optional<EstadoPedidoModel> getEstadoPedidoById(long id) {
        return estadoPedidoRepository.findById(id);
    }

    public EstadoPedidoModel createEstadoPedido(EstadoPedidoModel estadoPedido) {
        return estadoPedidoRepository.save(estadoPedido);
    }

    public EstadoPedidoModel updateEstadoPedido(long id, EstadoPedidoModel estadoPedidoDetails) {
        EstadoPedidoModel estadoPedido = estadoPedidoRepository.findById(id).orElse(null);

        if (estadoPedido != null) {
            estadoPedido.setEstado(estadoPedidoDetails.getEstado());

            return estadoPedidoRepository.save(estadoPedido);
        } else {
            return null;
        }
    }

    public void deleteEstadoPedido(long id) {
        estadoPedidoRepository.deleteById(id);
    }
}
