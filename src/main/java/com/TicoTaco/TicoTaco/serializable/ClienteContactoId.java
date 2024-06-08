package com.TicoTaco.TicoTaco.serializable;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import java.io.Serializable;
import java.util.Objects;

import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ClienteContactoId implements Serializable {
    private Long contacto;
    private Long cliente;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteContactoId that = (ClienteContactoId) o;
        return contacto == that.contacto && cliente == that.cliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(contacto, cliente);
    }
}


