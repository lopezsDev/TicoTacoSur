package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

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

    @OneToMany (mappedBy = "contactoId")
    private Set<ClienteContactoModel>clientecontactoId;
}
