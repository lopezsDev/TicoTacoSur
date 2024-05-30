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

    @Column(name = "F_FECHA_PLANILLA")
    private Date fechaPlanilla;

    @Column(name = "C_SUCURSAL")
    private long sucursalId;

    @Column(name = "C_EMPLEADO")
    private long empleadoId;

    @Column(name = "C_TIPO_PLANILLA")
    private long tipoPlanillaId;
}
