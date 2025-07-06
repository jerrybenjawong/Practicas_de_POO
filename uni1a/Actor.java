package uni1a;

public class Actor {
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    private String especialidad;

    public Actor(String nombre, String apellido, int edad, String nacionalidad, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.especialidad = especialidad;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public void mostrarInformacion() {
        System.out.println("Actor: " + getNombreCompleto() +
                           " | Edad: " + edad +
                           " | Nacionalidad: " + nacionalidad +
                           " | Especialidad: " + especialidad);
    }
}