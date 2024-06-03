package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "FACTURA")
public class FacturaModel {

    @Id
    @Column(name = "C_FACTURA")
    private long facturaId;

    @Column(name = "F_FECHA_PEDIDO")
    private LocalDateTime fechaPedido;

    @Column(name = "M_MONTO_TOTAL")
    private double montoTotal;

    @Column(name = "C_DETALLE_FACTURA")
    private long detalleFacturaId;

    @Column(name = "C_SUCURSAL")
    private long sucursalId;

    @Column(name = "C_MONEDA")
    private long monedaId;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
    private List<PedidoClienteModel> pedidosClientes;

    @OneToOne(mappedBy = "factura", cascade = CascadeType.ALL)
    private CajasModel caja;

    @ManyToOne
    @JoinColumn(name = "C_SUCURSAL", nullable = false)
    private SucursalModel sucursal;

    @ManyToOne
    @JoinColumn(name = "C_PEDIDO_CLIENTE", nullable = false)
    private PedidoClienteModel pedidoCliente;
}

