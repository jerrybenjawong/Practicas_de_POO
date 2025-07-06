package uni1a;

public class Novela extends ContenidoAudiovisual {
    private String canalEmision;
    private int numeroCapitulos;
    private String paisOrigen;
    private boolean esInternacional;

    public Novela(String titulo, int duracionEnMinutos, String genero, String canalEmision, int numeroCapitulos, String paisOrigen, boolean esInternacional) {
        super(titulo, duracionEnMinutos, genero);
        this.canalEmision = canalEmision;
        this.numeroCapitulos = numeroCapitulos;
        this.paisOrigen = paisOrigen;
        this.esInternacional = esInternacional;
    }

    public void mostrarDetalles() {
        System.out.println("Novela: " + getTitulo() + " | ID: " + getId());
        System.out.println("Género: " + getGenero() + " | Canal: " + canalEmision + " | País: " + paisOrigen);
        System.out.println("Capítulos: " + numeroCapitulos + " | Duración promedio: " + getDuracionEnMinutos() + " min");
        System.out.println("Distribución internacional: " + (esInternacional ? "Sí" : "No"));
        System.out.println();
    }
}