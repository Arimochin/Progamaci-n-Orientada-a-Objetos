package TP5.PuertoDeCereales;

import java.util.Vector;

public class Puerto {
    Vector<Barco> barcos;
    Vector<Camion> camiones;

    public Puerto (){
        barcos = new Vector<>();
        camiones = new Vector<>();
    }

//    public void addBarco(Barco b){
//        int i = 0;
//        while((i < barcos.size()) && (this.compare(b, ((Barco)barcos.elementAt(i))))){
//            i++;
//        }
//        if (i < barcos.size())
//            barcos.insertElementAt(b, i);
//        else
//            barcos.add(b);
//    }






}
