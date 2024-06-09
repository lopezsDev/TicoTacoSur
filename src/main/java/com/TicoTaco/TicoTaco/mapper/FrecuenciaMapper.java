package com.TicoTaco.TicoTaco.mapper;

import com.TicoTaco.TicoTaco.dto.FrecuenciaDTO;
import com.TicoTaco.TicoTaco.model.FrecuenciaModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FrecuenciaMapper {

    public FrecuenciaModel toEntity(FrecuenciaDTO dto) {
        FrecuenciaModel frecuencia = new FrecuenciaModel();
        frecuencia.setFrecuenciaId(dto.getFrecuenciaId());
        frecuencia.setTipoCliente(dto.getTipoCliente());
        return frecuencia;
    }

    public FrecuenciaDTO toDto(FrecuenciaModel frecuencia) {
        return new FrecuenciaDTO(
                frecuencia.getFrecuenciaId(),
                frecuencia.getTipoCliente()
        );
    }

    public List<FrecuenciaDTO> toDtoList(List<FrecuenciaModel> frecuencias) {
        return frecuencias.stream().map(this::toDto).collect(Collectors.toList());
    }
}
