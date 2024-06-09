package com.TicoTaco.TicoTaco.mapper;

import com.TicoTaco.TicoTaco.Repository.*;
import com.TicoTaco.TicoTaco.dto.PedidoClienteDTO;
import com.TicoTaco.TicoTaco.model.PedidoClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PedidoClienteMapper {

    @Autowired
    private EstadoPedidoRepository estadoPedidoRepository;

    @Autowired
    private ExpressRepository expressRepository;

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private MenuRepository menuRepository;

    public PedidoClienteModel toEntity(PedidoClienteDTO dto) {
        PedidoClienteModel pedidoCliente = new PedidoClienteModel();
        pedidoCliente.setMesaAsignada(dto.getMesaAsignada());
        pedidoCliente.setTiempoPreparacion(dto.getTiempoPreparacion());

        if (dto.getEstadoId() != null) {
            pedidoCliente.setEstadoId(estadoPedidoRepository.findById(dto.getEstadoId()).orElse(null));
        }

        if (dto.getExpressId() != null) {
            pedidoCliente.setExpressId(expressRepository.findById(dto.getExpressId()).orElse(null));
        }

        if (dto.getEmpleadoId() != null) {
            pedidoCliente.setEmpleadoId(empleadoRepository.findById(dto.getEmpleadoId()).orElse(null));
        }

        if (dto.getClienteId() != null) {
            pedidoCliente.setClienteId(clienteRepository.findById(dto.getClienteId()).orElse(null));
        }

        if (dto.getMenuId() != null) {
            pedidoCliente.setMenuId(menuRepository.findById(dto.getMenuId()).orElse(null));
        }

        return pedidoCliente;
    }

    public PedidoClienteDTO toDto(PedidoClienteModel pedidoCliente) {
        return new PedidoClienteDTO(
                pedidoCliente.getPedidoClienteId(),
                pedidoCliente.getMesaAsignada(),
                pedidoCliente.getTiempoPreparacion(),
                pedidoCliente.getEstadoId() != null ? pedidoCliente.getEstadoId().getEstadoId() : null,
                pedidoCliente.getExpressId() != null ? pedidoCliente.getExpressId().getExpressId() : null,
                pedidoCliente.getEmpleadoId() != null ? pedidoCliente.getEmpleadoId().getEmpleadoId() : null,
                pedidoCliente.getClienteId() != null ? pedidoCliente.getClienteId().getClienteId() : null,
                pedidoCliente.getMenuId() != null ? pedidoCliente.getMenuId().getMenuId() : null
        );
    }
}
