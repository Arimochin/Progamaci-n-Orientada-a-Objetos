package TP2;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private int DNI;
    private String sexo;
    private double peso;
    private double altura;



    public Persona() {
        fechaNacimiento = LocalDate.of(2000,1,1);
        DNI = 0;
        sexo = "Femenino";
        nombre = "N";
        apellido = "N";
        peso = 1;
        altura = 1;
    }

    public Persona(int DNI) {
        this.DNI = DNI;
        sexo = "Femenino";
        nombre = "N";
        apellido = "N";
        peso = 1;
        altura = 1;
    }

    public Persona(int DNI, String apellido, String nombre) {
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
        sexo = "Femenino";
        peso = 1;
        altura = 1;
    }

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
        sexo = "Femenino";
        peso = 1;
        altura = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDNI() {
        return DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getIndiceMasaCorporal() {
        return peso/(altura*altura);
    }

    public boolean estaEnForma() {
        return (getIndiceMasaCorporal() > 18.5 && getIndiceMasaCorporal() < 25);
    }

    public boolean estaCumpliendoAnios(){
        return ((LocalDate.now().getMonth() == this.fechaNacimiento.getMonth()) && (LocalDate.now().getDayOfMonth() == this.fechaNacimiento.getDayOfMonth()) );
    }

    public boolean esMayorDeEdad(){
        int edadMayor = 18;
        return (this.edad >= edadMayor);
    }

    public boolean puedeVotar(){
        int edadVotar = 16;
        return(this.edad >= edadVotar);
    }

    public boolean esCoherenteEdad() {
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento, hoy);
        return (periodo.getYears() == edad);
    }

    public String toString() {
        return "Persona con el nombre: " + this.getNombre() + " - Apellido: " + this.getApellido() + " - Edad: " +this.getEdad()+ " - Fecha de Nacimiento: " +this.getFechaNacimiento()+ " - DNI: " +this.getDNI()+ " - Sexo: " +this.getSexo()+ " - Peso: " +this.getPeso()+ " - Altura: " +this.getAltura() ;
    }

}


    
