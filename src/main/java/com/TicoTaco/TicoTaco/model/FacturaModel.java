package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.Date;
@Data
@Entity
@Table(name = "FACTURA")
public class FacturaModel {

    @Id
    @Column(name = "C_FACTURA")
    private long facturaId;

    @Column(name = "F_FECHA_PEDIDO")
    private Date fechaPedido;

    @Column(name = "M_MONTO_TOTAL")
    private double montoTotal;

    @Column(name = "C_DETALLE_FACTURA")
    private long detalleFacturaId;

    @Column(name = "C_SUCURSAL")
    private long sucursalId;

    @Column(name = "C_PEDIDO_CLIENTE")
    private long pedidoClienteId;

    @Column(name = "C_MONEDA")
    private long monedaId;
}
