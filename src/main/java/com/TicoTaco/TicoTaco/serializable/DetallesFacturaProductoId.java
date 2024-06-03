package com.TicoTaco.TicoTaco.serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class DetallesFacturaProductoId {

    private int detalleFactura;
    private int producto;
}
