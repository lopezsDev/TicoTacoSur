package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "CANTON")
public class CantonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C_CANTON")
    private Long cantonId;

    @Column(name = "D_CANTON")
    private String nombreCanton;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C_PROVINCIA", insertable = false, updatable = false)
    private ProvinciaModel provinciaId;

    @OneToMany(mappedBy = "cantonId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DistritoModel> distritos = new HashSet<>();
}


