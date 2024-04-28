package TP5.CentroDeComputo;

import java.util.Comparator;

public class ComparadorProceso implements Comparator<Proceso> {

    public int compare(Proceso proc1, Proceso proc2) {
        int rpta = 0;
        if (proc1.getMemoriaRequerida() > proc2.getMemoriaRequerida()) {
            rpta = 1;
        } else if(proc1.getMemoriaRequerida() < proc2.getMemoriaRequerida()) {
            rpta = -1;
        } else {
            rpta = 0;
        }
        return rpta;
    }

}
