package repositorio;

import modelo.Alumno;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoRepositorioBinario {
    private  final String rutaFicheroBinario = "/home/adrian/IdeaProjects/Unidad1FinalMVC/src/main/Datos/alumno.bin";

    public void agregarAlumnoBinario(Alumno alumno) throws IOException {

        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        // 1. Si el fichero existe, lo leemos para no perder los alumnos anteriores
        File fichero = new File(rutaFicheroBinario);

        if (fichero.exists() && fichero.length() > 0) {

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
                listaAlumnos = (ArrayList<Alumno>) ois.readObject();

            } catch (ClassNotFoundException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
            }
        }

        // 2. Agregamos el nuevo alumno
        listaAlumnos.add(alumno);

        // 3. Guardamos toda la lista en el fichero binario
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))) {

            oos.writeObject(listaAlumnos);
        }

        System.out.println("Alumno agregado al fichero binario correctamente.");
    }

    public List<Alumno> obtenerTodosAlumosBinario(String rutaFichero) throws IOException, ClassNotFoundException {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        File fichero = new File(rutaFicheroBinario);

        if (!fichero.exists() || fichero.length() == 0) {
            return listaAlumnos; // fichero vacío, devolvemos lista vacía
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
            listaAlumnos = (ArrayList<Alumno>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer alumnos del fichero: " + e.getMessage());
        }

        return listaAlumnos;
    }

}
