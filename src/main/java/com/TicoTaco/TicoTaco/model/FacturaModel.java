package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "FACTURA")
public class FacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_FACTURA")
    private Long facturaId;

    @Column(name = "F_FECHA_PEDIDO")
    private Date fechaPedido;

    @Column(name = "M_MONTO_TOTAL")
    private double montoTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_DETALLE_FACTURA", insertable = false, updatable = false)
    private DetallesFacturaModel detalleFacturaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_SUCURSAL", insertable = false, updatable = false)
    private SucursalModel sucursalId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_PEDIDO_CLIENTE", insertable = false, updatable = false)
    private PedidoClienteModel pedidoClienteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_MONEDA", insertable = false, updatable = false)
    private MonedaModel monedaId;

    @OneToMany(mappedBy = "facturaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CajasModel> caja = new HashSet<>();
}
