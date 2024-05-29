package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    @Column(name = "C_PROVINCIA")
    private int provincia;
}

