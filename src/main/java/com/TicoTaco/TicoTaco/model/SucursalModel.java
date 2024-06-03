package com.TicoTaco.TicoTaco.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

import javax.naming.Name;
import java.util.Set;

@Data
@Entity
@Table(name = "SUCURSAL")
public class SucursalModel {

    @Id
    @Column(name = "C_SUCURSAL")
    private long sucursalId;

    @Column(name = "D_NOMBRE_SUCURSAL")
    private String nombreSucursal;

    @OneToOne
    @JoinColumn(name = "C_DIRECCION", nullable = false)
    private DireccionModel direccion;

    @Column(name = "C_CAJA")
    private long caja;

    @Column(name = "C_CONTACTO")
    private long contacto;

<<<<<<< HEAD
    @OneToMany(mappedBy = "bodegaId")
    private Set<BodegaModel> bodegaId;

=======
>>>>>>> b2ebd1f1be793cae8a039a1c8e5b11c8f90db833
    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<FacturaModel> facturas;
}

