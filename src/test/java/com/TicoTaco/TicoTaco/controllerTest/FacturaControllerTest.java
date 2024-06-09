package com.TicoTaco.TicoTaco.controllerTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class FacturaControllerTest {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    private void createFactura(String json) throws Exception {
        mockMvc.perform(post("/api/facturas")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isCreated());
    }

    @Test
    public void testVentaCombo() throws Exception {
        String json = "{ \"fechaPedido\": \"2024-06-08T00:00:00\", \"montoTotal\": 5000.00, \"detalles\": [{ \"cantidad\": 1, \"precioLinea\": 5000.00, \"observaciones\": \"Combo\" }], \"sucursalId\": 1, \"pedidoClienteId\": 1, \"monedaId\": 1 }";
        createFactura(json);
    }

    @Test
    public void testVentaRefresco() throws Exception {
        String json = "{ \"fechaPedido\": \"2024-06-08T00:00:00\", \"montoTotal\": 1500.00, \"detalles\": [{ \"cantidad\": 1, \"precioLinea\": 1500.00, \"observaciones\": \"Refresco\" }], \"sucursalId\": 1, \"pedidoClienteId\": 1, \"monedaId\": 1 }";
        createFactura(json);
    }

    @Test
    public void testVentaPizzaGrandeConFrescoYBreadSticks() throws Exception {
        String json = "{ \"fechaPedido\": \"2024-06-08T00:00:00\", \"montoTotal\": 8000.00, \"detalles\": [{ \"cantidad\": 1, \"precioLinea\": 6000.00, \"observaciones\": \"Pizza Grande\" }, { \"cantidad\": 1, \"precioLinea\": 1000.00, \"observaciones\": \"Fresco\" }, { \"cantidad\": 1, \"precioLinea\": 1000.00, \"observaciones\": \"Bread Sticks\" }], \"sucursalId\": 1, \"pedidoClienteId\": 1, \"monedaId\": 1 }";
        createFactura(json);
    }

    @Test
    public void testVentaCincoCafesDosPintosTresEmpanadasUnPostre() throws Exception {
        String json = "{ \"fechaPedido\": \"2024-06-08T00:00:00\", \"montoTotal\": 15000.00, \"detalles\": [{ \"cantidad\": 5, \"precioLinea\": 1000.00, \"observaciones\": \"Café\" }, { \"cantidad\": 2, \"precioLinea\": 2000.00, \"observaciones\": \"Pinto\" }, { \"cantidad\": 3, \"precioLinea\": 1500.00, \"observaciones\": \"Empanada\" }, { \"cantidad\": 1, \"precioLinea\": 2500.00, \"observaciones\": \"Postre\" }], \"sucursalId\": 1, \"pedidoClienteId\": 1, \"monedaId\": 1 }";
        createFactura(json);
    }

    @Test
    public void testVentaSandwichesYPapasFritas() throws Exception {
        String json = "{ \"fechaPedido\": \"2024-06-08T00:00:00\", \"montoTotal\": 12000.00, \"detalles\": [{ \"cantidad\": 1, \"precioLinea\": 4000.00, \"observaciones\": \"Sandwich Jamón\" }, { \"cantidad\": 1, \"precioLinea\": 4500.00, \"observaciones\": \"Sandwich Vegano\" }, { \"cantidad\": 1, \"precioLinea\": 2000.00, \"observaciones\": \"Papas Fritas\" }, { \"cantidad\": 3, \"precioLinea\": 500.00, \"observaciones\": \"Fresco\" }], \"sucursalId\": 1, \"pedidoClienteId\": 1, \"monedaId\": 1 }";
        createFactura(json);
    }

    @Test
    public void testVentaComboYRefresco() throws Exception {
        String json = "{ \"fechaPedido\": \"2024-06-08T00:00:00\", \"montoTotal\": 6500.00, \"detalles\": [{ \"cantidad\": 1, \"precioLinea\": 5000.00, \"observaciones\": \"Combo\" }, { \"cantidad\": 1, \"precioLinea\": 1500.00, \"observaciones\": \"Refresco\" }], \"sucursalId\": 1, \"pedidoClienteId\": 1, \"monedaId\": 1 }";
        createFactura(json);
    }

    @Test
    public void testVentaTacosYRefrescos() throws Exception {
        String json = "{ \"fechaPedido\": \"2024-06-08T00:00:00\", \"montoTotal\": 250000.00, \"detalles\": [{ \"cantidad\": 50, \"precioLinea\": 3000.00, \"observaciones\": \"Taco\" }, { \"cantidad\": 200, \"precioLinea\": 1000.00, \"observaciones\": \"Refresco\" }], \"sucursalId\": 1, \"pedidoClienteId\": 1, \"monedaId\": 1 }";
        createFactura(json);
    }

    @Test
    public void testVentaHamburguesasRefrescosPapasYCombo() throws Exception {
        String json = "{ \"fechaPedido\": \"2024-06-08T00:00:00\", \"montoTotal\": 30000.00, \"detalles\": [{ \"cantidad\": 5, \"precioLinea\": 4000.00, \"observaciones\": \"Hamburguesa\" }, { \"cantidad\": 5, \"precioLinea\": 1000.00, \"observaciones\": \"Refresco\" }, { \"cantidad\": 4, \"precioLinea\": 2000.00, \"observaciones\": \"Papas Fritas\" }, { \"cantidad\": 1, \"precioLinea\": 5000.00, \"observaciones\": \"Combo\" }], \"sucursalId\": 1, \"pedidoClienteId\": 1, \"monedaId\": 1 }";
        createFactura(json);
    }
}
