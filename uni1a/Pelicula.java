package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public void mostrarDetalles() {
        System.out.println("Película: " + getTitulo() + " | ID: " + getId());
        System.out.println("Género: " + getGenero() + " | Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Estudio: " + estudio);
        System.out.println("Actores:");
        for (Actor a : actores) {
            a.mostrarInformacion();
        }
        System.out.println();
    }
}