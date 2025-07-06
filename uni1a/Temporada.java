package uni1a;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private int numeroTemporada;
    private int numeroEpisodios;
    private int duracionPromedio;
    private String fechaEstreno;
    private String fechaFinalizacion;
    private List<String> episodios;

    public Temporada(int numeroTemporada, int numeroEpisodios, int duracionPromedio, String fechaEstreno, String fechaFinalizacion) {
        this.numeroTemporada = numeroTemporada;
        this.numeroEpisodios = numeroEpisodios;
        this.duracionPromedio = duracionPromedio;
        this.fechaEstreno = fechaEstreno;
        this.fechaFinalizacion = fechaFinalizacion;
        this.episodios = new ArrayList<>();
    }

    public void agregarEpisodio(String nombre) {
        episodios.add(nombre);
    }

    public void mostrarInformacion() {
        System.out.println("Temporada " + numeroTemporada + ": " + numeroEpisodios + " episodios, promedio " +
                           duracionPromedio + " min/episodio");
        for (int i = 0; i < episodios.size(); i++) {
            System.out.println("  - Episodio " + (i + 1) + ": " + episodios.get(i));
        }
    }
}