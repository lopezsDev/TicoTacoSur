package com.TicoTaco.TicoTaco.dto;

import com.TicoTaco.TicoTaco.model.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * DTO for {@link FacturaModel}
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacturaDTO implements Serializable {
    private long facturaId;
    private Date fechaPedido;
    private double montoTotal;
    private List<DetallesFacturaDTO> detalles;
    private Long sucursalId;
    private Long pedidoClienteId;
    private Long monedaId;
}

