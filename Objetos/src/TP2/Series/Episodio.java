package TP2.Series;

public class Episodio {
    private String nombre;
    private String descripcion;
    private boolean flag;
    private float calificacion;

    public Episodio(String nombre){
        this.nombre = nombre;
        flag = false;
        calificacion = -1;
    }

    public boolean setCalificacion(float calificacion){
        if (calificacion > 0 && calificacion <= 5){
            this.calificacion = calificacion;
            return true;
        }
        return false;
    }

    public float getCalificacion(){
        return calificacion;
    }

    public boolean episodioVisto(){
        return flag;
    }

    public void verEpisodio(){
        this.flag = true;
    }

}
