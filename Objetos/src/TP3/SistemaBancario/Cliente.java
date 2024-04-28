package TP3.SistemaBancario;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int DNI;
    //private static int id;
    private ArrayList<CajaDeAhorro> cajasDeAhorro;

    public Cliente(String nombre, int DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        cajasDeAhorro = new ArrayList<CajaDeAhorro>();
    }





}
