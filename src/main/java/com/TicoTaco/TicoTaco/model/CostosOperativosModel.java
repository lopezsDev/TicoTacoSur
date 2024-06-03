package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "COSTOS_OPERATIVOS")
public class CostosOperativosModel {

    @Id
    @Column(name = "C_COSTOS_OPERATIVOS")
    private Long costosOperativosId;

    @Column(name = "F_DIA_PAGO")
    private java.time.LocalDateTime diapago;

    @Column(name = "M_COSTE")
    private int costodia;

    @Column(name = "D_DESCRIPCION")
    private String descripcion;

    @Column(name = "C_TIPO_COSTO_OPERATIVO")
    private String tipocosto;

    @Column(name = "C_MONEDA")
    private int tmoneda;

}

