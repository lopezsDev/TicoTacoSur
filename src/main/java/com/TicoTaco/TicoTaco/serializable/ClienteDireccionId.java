package com.TicoTaco.TicoTaco.serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ClienteDireccionId implements Serializable {

    private Long clienteId;
    private Long direccionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteDireccionId that = (ClienteDireccionId) o;
        return clienteId == that.clienteId && direccionId == that.direccionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clienteId, direccionId);
    }
}
