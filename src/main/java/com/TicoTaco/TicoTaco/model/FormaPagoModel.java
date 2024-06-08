package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "FORMA_PAGO")
public class FormaPagoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_FORMA_PAGO")
    private Long formaPagoId;

    @Column(name = "T_TIPO_PAGO")
    private String tipoPago;

    @OneToMany(mappedBy = "formaPagoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CajasModel> cajas = new HashSet<>();
}


