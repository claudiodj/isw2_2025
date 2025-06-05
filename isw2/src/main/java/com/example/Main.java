package com.example;

import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        cliente cli1 = new cliente("Juan", "Lizarraga", 35666777, "5491199667711");
        cliente cli2 = new cliente("Diego", "Ojeda", 35666111, "5491199660055");

        // Obtener fecha y hora actual
        System.out.println("antes de la llamada" + LocalDateTime.now());
        LocalDateTime ahora = LocalDateTime.now();

        // Formatear en una forma legible
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // Mostrar por consola
        System.out.println("Fecha y hora actual: " + ahora.format(formato));
        
        System.out.println("Llamada a getTelefono ");
        System.out.println(cli1.getTelefono());

        System.out.println("Despues de la llamada " + new Date());

        sucursal suc1 = new sucursal(1, "Santa Fe", 1254, "AB1645CD");
        sucursal suc2 = new sucursal(1, "Lavalle", 528, "AC1675BB");
        compra com1 = new compra(cli1, suc1, new Date(), 10000, 0);
        compra com2 = new compra(cli1, suc2, new Date(), 20000, 1000);
        compra com3 = new compra(cli2, suc1, new Date(), 18000, 500);
        compra com4 = new compra(cli2, suc2, new Date(), 15000, 1500);

        System.out.println("Compra 1 : " + com1.toString());
        System.out.println("Compra 2 : " + com2.toString());

        System.out.println("Compra 3 : " + com3.toString());
        System.out.println("Compra 4 : " + com4.toString());

    }
}