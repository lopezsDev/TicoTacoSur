package com.TicoTaco.TicoTaco.serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ComboProductoId implements Serializable {
    private Long comboId;
    private Long productoId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComboProductoId that = (ComboProductoId) o;
        return comboId == that.comboId && productoId == that.productoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(comboId, productoId);
    }
}

