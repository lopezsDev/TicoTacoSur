package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "FORMA_PAGO")
public class FormaPagoModel {

    @Id
    @Column(name = "C_FORMA_PAGO")
    private long formaPagoId;

    @Column(name = "T_TIPO_PAGO")
    private String tipoPago;
}

