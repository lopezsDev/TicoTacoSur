package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "PEDIDO_PROVEEDOR")
public class PedidoProveedorModel {

    @Id
    @Column(name = "C_PEDIDO_PROVEEDOR")
    private long pedidoProveedorId;

    @Column(name = "F_PEDIDO")
    private Date fechaPedido;

    @Column(name = "M_MONTO_TOTAL")
    private BigDecimal montoTotal;

    @Column(name = "C_SUCURSAL")
    private long sucursalId;

    @Column(name = "C_PROVEEDOR")
    private long proveedorId;

    @Column(name = "C_DETALLE_PEDIDO_PROVEEDOR")
    private long detallePedidoProveedorId;
}
