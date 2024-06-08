package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "FRECUENCIA")
public class FrecuenciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_FRECUENCIA")
    private Long frecuenciaId;

    @Column(name = "T_TIPO_CLIENTE")
    private int tipoCliente;

    @OneToMany(mappedBy = "frecuenciaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ClienteModel> clientes = new HashSet<>();
}
