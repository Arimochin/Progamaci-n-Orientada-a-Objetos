package TP5.PuertoDeCereales;

public class Barco {
    private double capacidad;
    private String nombreBarco;

    public Barco(String nombreBarco, double capacidad) {
        this.nombreBarco = nombreBarco;
        this.capacidad = capacidad;
    }

    public boolean compare (Barco barco) {
        //true si la capacidad de este objeto es menor de la del que comparo
        //para max-heap
        return (this.capacidad < barco.capacidad);
    }

}
