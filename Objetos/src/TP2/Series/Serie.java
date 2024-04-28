package TP2.Series;

public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private int cantTemporadas;
    private int cantEpisodios;
    private Temporada[] temporadas;
    private int cantEstandarTemp = 5;

    public Serie(String nombre) {
        titulo = nombre;
        temporadas = new Temporada[cantEstandarTemp];
        cantTemporadas = 0;
    }

    public void agregarTemporada(Temporada temp) {
        temporadas[cantTemporadas] = temp;
        cantTemporadas++;
    }

    public int episodiosVistosSerie(){
        int episodios = 0;
        for(int j = 0; j < cantTemporadas; j++){
            episodios = episodios + temporadas[j].episodiosVistos();
        }
        return episodios;
    }

    //Obtener el promedio de las calificaciones dadas por el usuario para una serie.
    public float promedioCalificacion(){
        float suma = 0;
        for (int i = 0; i < cantTemporadas; i++){
            suma = suma + temporadas[i].promedioCalificacion();
        }
        return (suma/cantTemporadas);
    }

    public int getCantEpisodios(){
        int episodios = 0;
        for (int i = 0; i < cantTemporadas; i++){
            episodios = episodios + temporadas[i].getCantEpisodios();
        }
        return episodios;
    }

    private int seenEpisodes(){
        int episodes = 0;
        for (int i = 0; i < cantTemporadas; i++){
            episodes = episodes + temporadas[i].episodiosVistos();
        }
        return episodes;
    }

    //Determinar si el usuario ya vio todos los episodios de la serie.
    public boolean sawAllEpisodes(){
        return(this.getCantEpisodios() == this.seenEpisodes());
    }

}
