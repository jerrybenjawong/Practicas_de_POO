package uni1a;

public class Investigador {
    private String nombre;
    private String apellido;
    private String especialidad;
    private String institucion;
    private int anosExperiencia;
    private String tituloAcademico;

    public Investigador(String nombre, String apellido, String especialidad, String institucion, int anosExperiencia, String tituloAcademico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.institucion = institucion;
        this.anosExperiencia = anosExperiencia;
        this.tituloAcademico = tituloAcademico;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public void mostrarInformacion() {
        System.out.println("Investigador: " + getNombreCompleto() +
                           " | Especialidad: " + especialidad +
                           " | Institución: " + institucion +
                           " | Experiencia: " + anosExperiencia + " años" +
                           " | Título: " + tituloAcademico);
    }
}