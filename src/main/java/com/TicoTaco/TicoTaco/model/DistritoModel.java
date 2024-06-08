package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Data
@Entity
@Table(name = "DISTRITO")
public class DistritoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_DISTRITO")
    private Long distritoId;

    @Column(name = "D_DISTRITO")
    private String distritoNombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_CANTON", insertable = false, updatable = false)
    private CantonModel cantonId;

    @OneToMany(mappedBy = "distritoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DireccionModel> direcciones = new HashSet<>();
}

