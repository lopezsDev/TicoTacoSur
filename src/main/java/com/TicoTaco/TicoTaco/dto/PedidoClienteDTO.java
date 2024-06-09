package com.TicoTaco.TicoTaco.dto;

import com.TicoTaco.TicoTaco.model.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoClienteDTO {
    private Long pedidoClienteId;
    private Integer mesaAsignada;
    private LocalDateTime tiempoPreparacion;
    private Long estadoId;
    private Long expressId;
    private Long empleadoId;
    private Long clienteId;
    private Long menuId;
}



