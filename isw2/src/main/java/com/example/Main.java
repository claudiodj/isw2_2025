package com.example;

public class Main {
    public static void main(String[] args) {

        cliente cli = new cliente("Juan", "Lizarraga", 35666777, "5491199667711");

        System.out.println("Llamada a getTelefono ");
        System.out.println(cli.getTelefono());
    }
}