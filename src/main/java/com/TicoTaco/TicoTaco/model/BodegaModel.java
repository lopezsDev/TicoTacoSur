package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "BODEGA")
public class BodegaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_BODEGA")
    private Long bodegaId;

    @Column(name = "Q_STOCK")
    private BigDecimal stock;

    @Column(name = "Q_MINIMA")
    private BigDecimal minima;

    @Column(name = "F_INGRESO")
    private LocalDateTime ingreso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_PRODUCTO", insertable = false, updatable = false)
    private ProductoModel productoId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_SUCURSAL", insertable = false, updatable = false)
    private SucursalModel sucursalId;

    @OneToMany(mappedBy = "bodegaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DetallePedidoProveedorBodegaModel> detallePedidoProveedorBodega = new HashSet<>();
}

