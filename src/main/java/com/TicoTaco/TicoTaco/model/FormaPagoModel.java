package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "FORMA_PAGO")
public class FormaPagoModel {

    @Id
    @Column(name = "C_FORMA_PAGO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long formaPagoId;

    @Column(name = "T_TIPO_PAGO")
    private String tipoPago;
}

