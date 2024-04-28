package TP5.PuertoDeCereales;

import java.time.LocalDate;

public class Camion {
    private LocalDate fecha_de_carga;
    private int id;

    public Camion(int id, LocalDate fecha_de_carga) {
        this.id = id;
        this.fecha_de_carga = fecha_de_carga;
    }


}
