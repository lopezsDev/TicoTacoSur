package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
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

    @OneToMany
    @JoinColumn (name = "fpago")
    private CajasModel fpagoId;

}

