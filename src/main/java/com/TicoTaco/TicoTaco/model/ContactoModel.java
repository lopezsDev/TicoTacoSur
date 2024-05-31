package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CONTACTO")
public class ContactoModel {

    @Id
    @Column(name = "C_CONTACTO")
    private Long contactoId;

    @Column(name = "D_TELEFONO")
    private String telefono;

    @Column(name = "D_EMAIL")
    private String email;
}
