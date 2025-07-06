package uni1a;

public class VideoDeCine extends ContenidoAudiovisual {
    private String tipoVideo;
    private String formato;
    private String productor;

    public VideoDeCine(String titulo, int duracionEnMinutos, String genero, String tipoVideo, String formato, String productor) {
        super(titulo, duracionEnMinutos, genero);
        this.tipoVideo = tipoVideo;
        this.formato = formato;
        this.productor = productor;
    }

    public void mostrarDetalles() {
        System.out.println("Video de Cine: " + getTitulo() + " | ID: " + getId());
        System.out.println("Tipo: " + tipoVideo + " | Formato: " + formato + " | Productor: " + productor);
        System.out.println("Duración: " + getDuracionEnMinutos() + " min | Género: " + getGenero());
        System.out.println();
    }
}