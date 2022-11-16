public class Examen {
    private String asignatura;
    private String curso;
    private String nombreApellido;
    private Hora hora;
    private Fecha fecha;

    public Examen(String asignatura, String curso, String nombreApellido, Hora hora, Fecha fecha) {
        this.asignatura = asignatura;
        this.curso = curso;
        this.nombreApellido = nombreApellido;
        this.hora = hora;
        this.fecha = fecha;
    }
}
