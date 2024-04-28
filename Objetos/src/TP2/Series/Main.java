package TP2.Series;

public class Main {
    public static void main(String[] args) {
        Serie Jojos = new Serie("Jojo's Bizarre Adventure");

        Temporada Uno = new Temporada("Phantom Blood");
        Temporada Dos = new Temporada("Battle Tendency");
        Temporada Tres = new Temporada("Stardust Crusaders");
        Temporada Cuatro = new Temporada("Diamond is Unbreakable");
        Temporada Cinco = new Temporada("Golden Wind");
        Temporada Seis = new Temporada("Stone Ocean");
        Temporada Siete = new Temporada("Steel Ball Run");

        Episodio Uno1 = new Episodio("1");
        Episodio Uno2 = new Episodio("2");
        Episodio Uno3 = new Episodio("3");
        Episodio Dos1 = new Episodio("1");
        Episodio Dos2 = new Episodio("2");
        Episodio Tres1 = new Episodio("1");
        Episodio Tres2 = new Episodio("2");

        Uno.agregarEpisodio(Uno1);
        Uno.agregarEpisodio(Uno2);
        Uno.agregarEpisodio(Uno3);
        Dos.agregarEpisodio(Dos1);
        Dos.agregarEpisodio(Dos2);
        Tres.agregarEpisodio(Tres1);
        Tres.agregarEpisodio(Tres2);

        Jojos.agregarTemporada(Uno);
        Jojos.agregarTemporada(Dos);
        Jojos.agregarTemporada(Tres);

        Uno1.setCalificacion(4);
        Uno2.setCalificacion(3);
        Uno3.setCalificacion(5);
        Dos1.setCalificacion(4);
        Dos2.setCalificacion(3);
        Tres1.setCalificacion(4);
        Tres2.setCalificacion(5);

        Uno1.verEpisodio();
        Uno2.verEpisodio();
        Uno3.verEpisodio();
        Dos1.verEpisodio();
        Dos2.verEpisodio();
        Tres1.verEpisodio();
        Tres2.verEpisodio();

        System.out.println("Calificacion del capitulo: " + Uno1.getCalificacion());
        System.out.println("Episodios vistos de una temporada: " +Uno.episodiosVistos());
        System.out.println("Episodios vistos de una serie: " +Jojos.episodiosVistosSerie());
        System.out.println("Promedio capitulos temporada: " +Uno.promedioCalificacion());
        System.out.println("Promedio capitulos serie: " +Jojos.promedioCalificacion());
        if (Jojos.sawAllEpisodes()) {
            System.out.println("Vio todos los episodios");
        } else {
            System.out.println("No vio todos los episodios");
        }


    }
}
