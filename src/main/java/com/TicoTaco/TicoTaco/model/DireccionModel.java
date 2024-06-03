package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;

import java.util.Set;

@Data
@Entity
@Table(name = "DIRECCION")
public class DireccionModel {

    @Id
    @Column(name = "C_DIRECCION")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long direccionId;

    @Column(name = "D_DIRECCION_ESPECIFICA")
    private String direccionEspecifica;

    @ManyToOne
    @JoinColumn(name = "C_DISTRITO", nullable = false)
    private DistritoModel distritoId;

    @OneToMany(mappedBy = "direccionId")
    private Set<ClienteDireccionModel> clienteDireccionId;

    @OneToOne(mappedBy = "direccionId")
    private Set<ProveedorModel> proveedorDireccion;

}
