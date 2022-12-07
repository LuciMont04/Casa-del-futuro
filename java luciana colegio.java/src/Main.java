public class Main {
    public static void main(String[] args) {
        Alumno nico= new Alumno("Nico","Olivera");
        Profe luca = new Profe("Lucas","Zarandón");

        luca.aniadirAlumno(new Alumno("Luciana","Montenegro"));
        nico.recibirNota(9);
        luca.buscarAlumno(0);
        nico.listarNotas();
        luca.cantidadAlumnos();
        nico.recibirNota(5);
        nico.calcularPromedio();
        luca.aniadirAlumno(new Alumno("nico","Olivara"));
        luca.listaralumnos();
        luca.cantidadAlumnos();
        luca.eliminarAlumno(0);
        luca.cantidadAlumnos();
        nico.cantidadDeNotas();


    }
}