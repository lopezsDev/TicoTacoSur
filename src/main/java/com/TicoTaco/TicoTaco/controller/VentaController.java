package com.TicoTaco.TicoTaco.controller;

import com.TicoTaco.TicoTaco.model.FacturaModel;
import com.TicoTaco.TicoTaco.util.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {
    private final PedidoService pedidoService;

    public VentaController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity<FacturaModel> realizarVenta(@RequestParam Long idCliente, @RequestParam Long idCombo, @RequestParam Long idProducto) {
        FacturaModel factura = pedidoService.realizarVenta(idCliente, idCombo, idProducto);
        return ResponseEntity.status(HttpStatus.CREATED).body(factura);
    }
}