package com.TicoTaco.TicoTaco.serializable;

import jakarta.persistence.Embeddable;
import lombok.*;
import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class DetalleFacturaProductoId implements Serializable {
    private Long detalleFacturaId;
    private Long productoId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetalleFacturaProductoId that = (DetalleFacturaProductoId) o;
        return detalleFacturaId == that.detalleFacturaId && productoId == that.productoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(detalleFacturaId, productoId);
    }
}

