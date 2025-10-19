package controlador;

import modelo.Alumno;
import repositorio.AlumnoRepositorioCSV;

import java.io.IOException;
import java.util.List;

/**
 * Gestiona la lógica entre la vista y el repositorio.
 */
public class AlumnoControladorCSV {
    private AlumnoRepositorioCSV repositorio;

    public AlumnoControladorCSV(AlumnoRepositorioCSV repositorio) {
        this.repositorio = new AlumnoRepositorioCSV();

    }

    public void agregarAlumno(int id, String nombre, String email){
        Alumno alumno = new Alumno(id, nombre, email);
        try {
            repositorio.agregarAlumno(alumno);
            System.out.println("Alumno agregado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al agregar alumno: " + e.getMessage());
        }
    }

    // Mostrar todos los alumnos
    public void mostrarAlumnos() {
        try {
            List<Alumno> lista = repositorio.obtenerTodosAlumos(null);
            if (lista.isEmpty()) {
                System.out.println("No hay alumnos registrados.");
            }
        } catch (Exception e) {
            System.out.println("Error al leer alumnos: " + e.getMessage());
        }
    }

//    // Buscar alumno por ID
//    public void buscarAlumno(int id) {
//        try {
//            List<Alumno> lista = repositorio.obtenerTodosAlumos(null);
//            boolean encontrado = false;
//            for (Alumno a : lista) {
//                if (a.getId() == id) {
//                    System.out.println("Alumno encontrado: " + a);
//                    encontrado = true;
//                    break;
//                }
//            }
//            if (!encontrado) {
//                System.out.println("Alumno con ID " + id + " no encontrado.");
//            }
//        } catch (Exception e) {
//            System.out.println("Error al buscar alumno: " + e.getMessage());
//        }
//    }
}
