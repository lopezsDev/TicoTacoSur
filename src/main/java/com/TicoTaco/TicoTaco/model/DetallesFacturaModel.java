package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DETALLES_FACTURA")
public class DetallesFacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_DETALLE_FACTURA")
    private Long detalleFacturaId;

    @Column(name = "Q_CANTIDAD")
    private int cantidad;

    @Column(name = "M_PRECIO_LINEA")
    private double precioLinea;

    @Column(name = "D_OBSERVACIONES")
    private String observaciones;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_FACTURA")
    private FacturaModel facturaId;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DetallesFacturaModel that = (DetallesFacturaModel) obj;
        return Objects.equals(detalleFacturaId, that.detalleFacturaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detalleFacturaId);
    }
}


