package TP5.CentroDeComputo;

import java.util.Comparator;

public class ComparadorComputadora implements Comparator<Computadora> {

    public int compare(Computadora comp1, Computadora comp2) {
        int rpta = 0;
        if (comp1.getVelocidad() > comp2.getVelocidad()) {
            rpta = 1;
        } else if (comp1.getVelocidad() < comp2.getVelocidad()) {
            rpta = -1;
        } else {
            rpta = 0;
        }
        return rpta;
    }



}
