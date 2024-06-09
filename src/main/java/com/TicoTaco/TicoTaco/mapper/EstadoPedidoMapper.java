package com.TicoTaco.TicoTaco.mapper;

import com.TicoTaco.TicoTaco.dto.EstadoPedidoDTO;
import com.TicoTaco.TicoTaco.model.EstadoPedidoModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EstadoPedidoMapper {

    public EstadoPedidoModel toEntity(EstadoPedidoDTO dto) {
        EstadoPedidoModel estadoPedido = new EstadoPedidoModel();
        estadoPedido.setEstadoId(dto.getEstadoId());
        estadoPedido.setEstado(dto.getEstado());
        return estadoPedido;
    }

    public EstadoPedidoDTO toDto(EstadoPedidoModel estadoPedido) {
        return new EstadoPedidoDTO(
                estadoPedido.getEstadoId(),
                estadoPedido.getEstado()
        );
    }

    public List<EstadoPedidoDTO> toDtoList(List<EstadoPedidoModel> estadosPedido) {
        return estadosPedido.stream().map(this::toDto).collect(Collectors.toList());
    }
}
