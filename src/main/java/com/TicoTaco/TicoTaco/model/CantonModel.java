package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CANTON")
public class CantonModel {

    @Id
    @Column(name = "C_CANTON")
    private Long cantonId;

    @Column(name = "D_CANTON")
    private String canton;

    @ManyToOne
    @JoinColumn(name = "C_PROVINCIA", nullable = false)
    private ProvinciaModel provinciaId;

    @OneToMany(mappedBy = "cantonId")
    private DistritoModel distritoId;


}

