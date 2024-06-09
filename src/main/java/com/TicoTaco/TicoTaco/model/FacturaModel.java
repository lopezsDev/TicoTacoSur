package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    @OneToMany(mappedBy = "facturaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DetallesFacturaModel> detalles = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_SUCURSAL")
    private SucursalModel sucursalId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_PEDIDO_CLIENTE")
    private PedidoClienteModel pedidoClienteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_MONEDA")
    private MonedaModel monedaId;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FacturaModel that = (FacturaModel) obj;
        return Objects.equals(facturaId, that.facturaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facturaId);
    }
}
