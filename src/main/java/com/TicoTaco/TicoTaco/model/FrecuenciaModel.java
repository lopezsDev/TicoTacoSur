package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "FRECUENCIA")
public class FrecuenciaModel {

    @Id
    @Column(name = "C_FRECUENCIA")
    private long frecuenciaId;

    @Column(name = "T_TIPO_CLIENTE")
    private int tipoCliente;
}
