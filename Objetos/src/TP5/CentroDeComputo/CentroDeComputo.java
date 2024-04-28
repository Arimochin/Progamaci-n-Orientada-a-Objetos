package TP5.CentroDeComputo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CentroDeComputo {

    PriorityQueue<Proceso> procesos;
    PriorityQueue<Computadora> computadoras;

    public CentroDeComputo() {
        procesos = new PriorityQueue<Proceso>(new ComparadorProceso());
        computadoras = new PriorityQueue<Computadora>(new ComparadorComputadora());

    }

    public void addProceso(Proceso proceso){
        procesos.add(proceso);
    }

    public void addComputadora(Computadora computadora){
        computadoras.add(computadora);
    }




}
