package TP2.Electrodomesticos;

public class Electrodomestico {
    private String nombre;
    private float precioBase = 100;
    private String color = "Gris Plata";
    private int consumoEnergetico = 10;
    private float peso = 2;

    public Electrodomestico(String nombre) {
        this.nombre = nombre;
    }

    public Electrodomestico(String nombre, float precioBase, String color, int consumoEnergetico, float peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean esBajoConsumo(){
        return consumoEnergetico < 45;
    }

    public float getBalance(){
        return (precioBase/peso);
    }

    public boolean esAltaGama(){
        return (this.getBalance() > 3);
    }

}

