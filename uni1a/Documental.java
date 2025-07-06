package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private List<Investigador> investigadores;

    public Documental(String titulo, int duracion, String genero, String tema) {
        super(titulo, duracion, genero);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }

    public void agregarInvestigador(Investigador i) {
        investigadores.add(i);
    }

    public void mostrarDetalles() {
        System.out.println("Documental: " + getTitulo() + " | ID: " + getId());
        System.out.println("Tema: " + tema + " | Género: " + getGenero() + " | Duración: " + getDuracionEnMinutos() + " min");
        System.out.println("Investigadores:");
        for (Investigador inv : investigadores) {
            inv.mostrarInformacion();
        }
        System.out.println();
    }
}