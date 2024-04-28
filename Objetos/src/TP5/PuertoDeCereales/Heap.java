package TP5.PuertoDeCereales;

import java.util.Vector;

public abstract class Heap <Elemento extends Comparable <Elemento>> {

    //addHeap
    //emptyHeap
    //raizHeap
    //eliminarHeap

    private Vector<Elemento> elementos;

    public Heap(){
        elementos = new Vector<>();
    }

    public void add(Elemento elem){
        int i = 0;
        while((i < elementos.size()) && (this.compare(elem, (Elemento)elementos.elementAt(i)))){
            i++;
        }
        if(i < elementos.size()){
            elementos.insertElementAt(elem, i);
        } else {
            elementos.add(elem);
        }
    }

    public abstract boolean compare(Elemento elem1, Elemento elem2);

    public boolean emptyHeap(){
        return elementos.isEmpty();
    }

    public Elemento raizHeap(){
        if (this.emptyHeap())
            return null;
        else
            return elementos.elementAt(0);
    }

    public void eliminarHeap(){
        if(!this.emptyHeap()){
            elementos.removeElementAt(0);
        }
    }



}
