package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "PROVINCIA")
public class ProvinciaModel {

    @Id
    @Column(name = "C_PROVINCIA")
    private Long provinciaId;

    @Column(name = "D_PROVINCIA")
    private String provincia;

    @OneToMany(mappedBy = "provinciaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<CantonModel> detalleFacturaProducto = new HashSet<>();
}

