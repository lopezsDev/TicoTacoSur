package com.TicoTaco.TicoTaco.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpressDTO implements Serializable {
    private Long expressId;
    private String nombreEncargado;
    private LocalDateTime horaRetiro;
    private LocalDateTime horaEntrega;
    private Long empresaExpressId;
    private Long contactoId;
}

