package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.Set;

@Data
@Entity
@Table(name = "FRECUENCIA")
public class FrecuenciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_FRECUENCIA")
    private long frecuenciaId;

    @Column(name = "T_TIPO_CLIENTE")
    private int tipoCliente;

    @OneToMany(mappedBy = "frecuenciaId")
    private Set<ClienteModel> clienteId;

}
