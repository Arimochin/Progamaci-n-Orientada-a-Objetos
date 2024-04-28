package TP2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona(45295395);
        persona.setNombre("Arimo");
        persona.setApellido("Chin");
        persona.setEdad(20);
        persona.setFechaNacimiento(LocalDate.of(2003,11,4));
        persona.setPeso(50.3);
        persona.setAltura(63);
        System.out.println(persona);

        if (persona.esCoherenteEdad()){
            System.out.println("La edad es coherente");
        }

    }
}
