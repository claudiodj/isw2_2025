package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class sucursalTest {

    // Instanciamos un objeto clase sucursal con valores que nos pueden servir para el test
    private sucursal suc = new sucursal(10, "Sargento Cabral", 1250, "AZ963JK");
    private sucursal suc2 = new sucursal();

    @Test
    void testGetAltura() {

    }

    @Test
    void testGetCalle() {
        assertEquals(suc.getCalle(), "Sargento Cabral");
        suc.setCalle("Avellaneda");
        sucursal suc1 = new sucursal();
        suc1.setCalle("Avellaneda");
        assertEquals(suc1.getCalle(), "Avellaneda");
        assertTrue(suc.getCalle().equals(suc1.getCalle()));
    }

    @Test
    void testGetCodPost() {

        String codpost = "AZ963JK";
    }

    @Test
    void testGetNumSuc() {

    }

    @Test
    void testSetAltura() {

    }

    @Test
    void testSetCalle() {

    }

    @Test
    void testSetCodPost() {

    }

    @Test
    void testSetNumSuc() {

    }

    @Test
    void testToString() {

    }
}
