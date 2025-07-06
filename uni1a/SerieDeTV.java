package uni1a;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private List<Temporada> listaTemporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        listaTemporadas.add(temporada);
        temporadas = listaTemporadas.size();
    }

    public void mostrarDetalles() {
        System.out.println("Serie de TV: " + getTitulo() + " | ID: " + getId());
        System.out.println("Género: " + getGenero() + " | Duración estimada por episodio: " + getDuracionEnMinutos() + " min");
        System.out.println("Temporadas: " + temporadas);
        for (Temporada t : listaTemporadas) {
            t.mostrarInformacion();
        }
        System.out.println();
    }
}