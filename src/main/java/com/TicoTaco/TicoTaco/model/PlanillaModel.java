package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "PLANILLA")
public class PlanillaModel {

    @Id
    @Column(name = "C_PLANILLA")
    private long planillaId;

    @Column(name = "C_HORAS_EXTRAS")
    private int horasextras;

    @Column(name = "M_SALARIO_TOTAL")
    private int salariototal;

    @Column(name = "M_SALARIO_BASE")
    private int salariobase;

    @Column(name = "F_FECHA_PAGO")
    private Date fechapago;

    @Column(name = "C_DEDUCCION")
    private int deduccion;

    @Column(name = "C_BONIFICACION")
    private long bonificacion;
}
