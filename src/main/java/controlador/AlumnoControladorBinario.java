package controlador;

import modelo.Alumno;
import repositorio.AlumnoRepositorioBinario;

import java.io.IOException;
import java.util.List;

public class AlumnoControladorBinario {
    private AlumnoRepositorioBinario repositorio;

    public AlumnoControladorBinario(AlumnoRepositorioBinario repositorio){
        this.repositorio = repositorio; // Usar el repositorio recibido
    }

    // Agregar alumno
    public void agregarAlumnoBinario(int id, String nombre, String email){
        Alumno alumno = new Alumno(id, nombre, email);
        try {
            repositorio.agregarAlumnoBinario(alumno); // Llamamos al método correcto
            System.out.println("Alumno agregado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al agregar alumno: " + e.getMessage());
        }
    }

    // Mostrar todos los alumnos
    public void mostrarAlumnosBinario() {
        try {
            List<Alumno> lista = repositorio.obtenerTodosAlumosBinario(null);
            if (lista.isEmpty()) {
                System.out.println("No hay alumnos registrados.");
            } else {
                for (Alumno a : lista) {
                    System.out.println(a);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer alumnos: " + e.getMessage());
        }
    }
}