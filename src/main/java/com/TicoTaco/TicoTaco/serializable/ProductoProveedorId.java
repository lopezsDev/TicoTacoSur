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
public class ProductoProveedorId implements Serializable {
    private Long proveedorId;
    private Long productoId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoProveedorId that = (ProductoProveedorId) o;
        return proveedorId == that.proveedorId && productoId == that.productoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(proveedorId, productoId);
    }
}
