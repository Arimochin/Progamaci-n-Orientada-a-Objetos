package TP3.EstructurasDeDatos;

public class Coleccion {
    private Object[] elementos;
    private int tamaño;

    public Coleccion(int capacidadInicial) {
        elementos = new Object[capacidadInicial];
        tamaño = 0;
    }

    public int getTamaño(){
        return tamaño;
    }

    public void agregar(Object elemento){
        if(tamaño == elementos.length){
            aumentarTamaño();
        }
        elementos[tamaño] = elemento;
        tamaño++;
    }

    private void aumentarTamaño(){
        int nuevaCapacidad = elementos.length * 2;
        Object[] elementosNuevo = new Object[nuevaCapacidad];
        for(int i = 0; i < elementos.length; i++){
            elementosNuevo[i] = elementos[i];
        }
        elementos = elementosNuevo;
    }

    public Object obtener(int indice){
        if(indice < 0 || indice >= tamaño){
            return null;
        }
        return elementos[indice];
    }

    public boolean eliminar(Object elemento){
        for (int i = 0; i < tamaño; i++){
            if(elemento.equals(elementos[i])){
                for(int j = 0; j < tamaño-1; j++){
                    elementos[j] = elementos[j+1];
                }
                elementos[tamaño-1] = null;
                tamaño--;
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String ret = "{";
        for(int i = 0; i < tamaño; i++){
            ret = ret + i + ": " + elementos[i] + " ";
        }
        ret = ret + "}";
        return ret;
    }


}
