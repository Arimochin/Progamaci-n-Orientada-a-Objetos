package TP2.Series;

import java.util.List;

public class Temporada {
    private String nombre;
    private int cantEpisodios;
    private Episodio[] episodios;
    private int nroEstandarEp = 24;
    private int epVistos = 0;

    public Temporada(String nombre) {
        this.nombre = nombre;
        episodios = new Episodio[nroEstandarEp];
        cantEpisodios = 0;
    }

    public void agregarEpisodio(Episodio ep){
        episodios[cantEpisodios] = ep;
        cantEpisodios++;
    }

    public int getCantEpisodios(){
        return cantEpisodios;
    }

    public int episodiosVistos(){
        int episodiosVistos = 0;
        if(epVistos==cantEpisodios){
            return epVistos;
        } else{
            for(int i=0; i<cantEpisodios; i++){
                if(episodios[i].episodioVisto())
                    episodiosVistos = episodiosVistos + 1;
            }
            epVistos = episodiosVistos;
            return episodiosVistos;
        }
    }

    //Obtener el promedio de las calificaciones dadas por el usuario para una
    //temporada particular.
    public float promedioCalificacion(){
        float suma = 0;
        for (int i = 0; i < cantEpisodios; i++){
            if (episodios[i].episodioVisto()) {
                suma = suma + episodios[i].getCalificacion();
            }
        }
        return (suma/cantEpisodios);
    }



}
