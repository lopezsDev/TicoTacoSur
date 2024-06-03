package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PROVINCIA")
public class ProvinciaModel {

    @Id
    @Column(name = "C_PROVINCIA")
    private long provinciaId;

    @Column(name = "D_PROVINCIA")
    private String provincia;

    @OneToMany(mappedBy = "provinciaId")
    private CantonModel cantonId;
}

