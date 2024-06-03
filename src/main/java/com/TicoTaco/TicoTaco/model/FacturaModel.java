package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
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

    @ManyToOne
    @JoinColumn(name = "C_PEDIDO_CLIENTE")
    private PedidoClienteModel pedidoClienteId;

    @Column(name = "C_MONEDA")
    private long monedaId;
}
