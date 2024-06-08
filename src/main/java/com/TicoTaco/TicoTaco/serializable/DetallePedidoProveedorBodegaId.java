package com.TicoTaco.TicoTaco.serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class DetallePedidoProveedorBodegaId implements Serializable {
    private Long bodegaId;
    private Long detallePedidoProveedorId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetallePedidoProveedorBodegaId that = (DetallePedidoProveedorBodegaId) o;
        return bodegaId == that.bodegaId && detallePedidoProveedorId == that.detallePedidoProveedorId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodegaId, detallePedidoProveedorId);
    }
}
