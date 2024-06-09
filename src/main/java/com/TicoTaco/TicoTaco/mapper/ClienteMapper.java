package com.TicoTaco.TicoTaco.mapper;

import com.TicoTaco.TicoTaco.Repository.FrecuenciaRepository;
import com.TicoTaco.TicoTaco.dto.ClienteDTO;
import com.TicoTaco.TicoTaco.model.ClienteModel;
import com.TicoTaco.TicoTaco.model.FrecuenciaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClienteMapper {

    @Autowired
    private FrecuenciaRepository frecuenciaRepository;

    public ClienteModel toEntity(ClienteDTO dto) {
        ClienteModel cliente = new ClienteModel();
        cliente.setClienteId(dto.getClienteId());
        cliente.setNombreCliente(dto.getNombreCliente());
        cliente.setApellidoCliente(dto.getApellidoCliente());
        cliente.setNumeroCedula(dto.getNumeroCedula());

        if (dto.getFrecuenciaId() != null) {
            FrecuenciaModel frecuencia = frecuenciaRepository.findById(dto.getFrecuenciaId()).orElse(null);
            cliente.setFrecuenciaId(frecuencia);
        }
        return cliente;
    }

    public ClienteDTO toDto(ClienteModel cliente) {
        Long frecuenciaId = cliente.getFrecuenciaId() != null ? cliente.getFrecuenciaId().getFrecuenciaId() : null;

        return new ClienteDTO(
                cliente.getClienteId(),
                cliente.getNombreCliente(),
                cliente.getApellidoCliente(),
                cliente.getNumeroCedula(),
                frecuenciaId
        );
    }

    public List<ClienteDTO> toDtoList(List<ClienteModel> clientes) {
        return clientes.stream().map(this::toDto).collect(Collectors.toList());
    }
}

