package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "EXPRESS")
public class ExpressModel {

    @Id
    @Column(name = "C_EXPRESS")
    private long expressId;

    @Column(name = "D_NOMBRE_ENCARGADO")
    private String nombreEncargado;

    @Column(name = "F_HORA_RETIRO")
    private Date horaRetiro;

    @Column(name = "F_HORA_ENTREGA")
    private Date horaEntrega;

    @Column(name = "C_EMPRESA_EXPRESS")
    private long empresaExpressId;

    @Column(name = "C_CONTACTO")
    private long contactoId;
}

