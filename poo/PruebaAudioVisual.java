package poo;

import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        contenidos[0] = new Pelicula("Inception", 148, "Ciencia Ficción", "Warner Bros");
        contenidos[1] = new SerieDeTV("Breaking Bad", 47, "Drama", 5);
        contenidos[2] = new Documental("Nuestro Planeta", 60, "Naturaleza", "Ecosistemas globales");
        contenidos[3] = new Novela("Yo soy Betty, la fea", 45, "Comedia Romántica", "RCN", 335, "Colombia", true);
        contenidos[4] = new VideoDeCine("Avengers Trailer", 2, "Acción", "Tráiler", "IMAX", "Marvel Studios");

        for (ContenidoAudiovisual c : contenidos) {
            c.mostrarDetalles();
        }
    }
}