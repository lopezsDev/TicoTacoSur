package com.TicoTaco.TicoTaco.mapper;

import com.TicoTaco.TicoTaco.dto.MonedaDTO;
import com.TicoTaco.TicoTaco.model.MonedaModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MonedaMapper {

    public MonedaModel toEntity(MonedaDTO dto) {
        MonedaModel moneda = new MonedaModel();
        moneda.setMonedaId(dto.getMonedaId());
        moneda.setMoneda(dto.getMoneda());
        return moneda;
    }

    public MonedaDTO toDto(MonedaModel moneda) {
        return new MonedaDTO(
                moneda.getMonedaId(),
                moneda.getMoneda()
        );
    }

    public List<MonedaDTO> toDtoList(List<MonedaModel> monedas) {
        return monedas.stream().map(this::toDto).collect(Collectors.toList());
    }
}
