package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

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

    @OneToMany
    @JoinColumn(name = "C_DETALLE_FACTURA", nullable = false)
    private DetallesFacturaModel detalleFacturaId;

    @JoinColumn(name = "C_SUCURSAL")
    private long sucursalId;

    @OneToMany
    @JoinColumn(name = "C_MONEDA", nullable = false)
    private MonedaModel monedaId;

    @ManyToOne
    @JoinColumn(name = "C_PEDIDO_CLIENTE", nullable = false)
    private PedidoClienteModel pedidoCliente;


    @OneToMany(mappedBy = "facturaId")
    private Set<CajasModel> cajaId;


}

