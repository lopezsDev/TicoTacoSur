package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ROL")
public class RolModel {

    @Id
    @Column(name = "C_ROL")
    private long rolId;

    @Column(name = "D_ROL")
    private String rol;
}
