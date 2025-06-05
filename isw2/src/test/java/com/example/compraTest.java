package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class compraTest {

    // Instanciamos un objeto clase cliente con valores que nos pueden servir para el test
    private cliente cli = new cliente("Juan", "Lizarraga", 35666777, "5491199667711");
    
    // Instanciamos un objeto clase sucursal con valores que nos pueden servir para el test
    private sucursal suc = new sucursal(10, "Sargento Cabral", 1250, "AZ963JK");

    // Instanciamos un objeto clase compra con valores que nos pueden servir para el test
    private compra com = new compra(cli, suc, new Date(), 20000, 1000);

    @Test
    void testGetClienteCompra() {
        assertNotNull(cli);
        assertEquals(cli.getNombre(), "Juan");
    }

    @Test
    void testGetFechaCompra() {

    }

    @Test
    void testGetImporteCompra() {

    }

    @Test
    void testGetImporteDescuento() {
        assertTrue(com.getImporteDescuento() < com.getImporteCompra());
    }

    @Test
    void testGetSucursalVenta() {

    }

    @Test
    void testSetClienteCompra() {

    }

    @Test
    void testSetFechaCompra() {

    }

    @Test
    void testSetImporteCompra() {

    }

    @Test
    void testSetImporteDescuento() {

    }

    @Test
    void testSetSucursalVenta() {

    }
}
