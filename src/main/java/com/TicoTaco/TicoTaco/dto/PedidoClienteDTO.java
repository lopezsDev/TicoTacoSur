package com.TicoTaco.TicoTaco.dto;

import com.TicoTaco.TicoTaco.model.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;


import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoClienteDTO implements Serializable {
    private long pedidoClienteId;
    private Integer mesaAsignada;
    private LocalDateTime tiempoPreparacion;
    private EstadoPedidoModel estadoId;
    private ExpressModel expressId;
    private EmpleadoModel empleadoId;
    private ClienteModel clienteId;
    private MenuModel menuId;
}


