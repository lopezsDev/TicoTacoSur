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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_PEDIDO_PROVEEDOR")
    private Long pedidoProveedorId;

    @Column(name = "F_PEDIDO")
    private LocalDateTime fechaPedido;

    @Column(name = "M_MONTO_TOTAL")
    private BigDecimal montoTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_SUCURSAL", insertable = false, updatable = false)
    private SucursalModel sucursalId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_PROVEEDOR", insertable = false, updatable = false)
    private ProveedorModel proveedorId;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_DETALLE_PEDIDO_PROVEEDOR", insertable = false, updatable = false)
    private DetallePedidoProveedorModel detallePedidoProveedorId;

}

