package com.TicoTaco.TicoTaco.dto;

import com.TicoTaco.TicoTaco.model.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link FacturaModel}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacturaDTO implements Serializable {
    private long facturaId;
    private Date fechaPedido;
    private double montoTotal;
    private DetallesFacturaDTO detalleFacturaId;
    private SucursalDTO sucursalId;
    private PedidoClienteDTO pedidoClienteId;
    private MonedaDTO monedaId;
}


