package com.TicoTaco.TicoTaco.serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.Objects;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class SucursalEmpleadoId implements Serializable {
    private Long empleadoId;
    private Long sucursalId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SucursalEmpleadoId that = (SucursalEmpleadoId) o;
        return empleadoId == that.empleadoId && sucursalId == that.sucursalId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empleadoId, sucursalId);
    }
}
