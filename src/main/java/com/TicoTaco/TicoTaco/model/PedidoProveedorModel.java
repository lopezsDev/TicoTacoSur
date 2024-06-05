package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "PEDIDO_PROVEEDOR")
public class PedidoProveedorModel {

    @Id
    @Column(name = "C_PEDIDO_PROVEEDOR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pedidoProveedorId;

    @Column(name = "F_PEDIDO")
    private LocalDateTime fechaPedido;

    @Column(name = "M_MONTO_TOTAL")
    private BigDecimal montoTotal;

    @Column(name = "C_SUCURSAL")
    private long sucursalId;

    @Column(name = "C_PROVEEDOR")
    private long proveedorId;

    @Column(name = "C_DETALLE_PEDIDO_PROVEEDOR")
    private long detallePedidoProveedorId;
}
