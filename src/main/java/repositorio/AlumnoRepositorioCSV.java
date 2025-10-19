package repositorio;

import modelo.Alumno;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Encargado de leer y escribir en el fichero CSV.
 */
public class AlumnoRepositorioCSV {
    // Ruta fichero csv
    private  final String rutaFicherocsv = "/home/adrian/IdeaProjects/Unidad1FinalMVC/src/main/Datos/alumno.csv";

    // Añadir alumno.
    public void agregarAlumno(Alumno alumno) throws IOException {
        PrintWriter pwCsv = new PrintWriter(new FileWriter(rutaFicherocsv,true));
        pwCsv.println(alumno.getId()+","+alumno.getNombre()+","+alumno.getEmail());
        pwCsv.close();
    }


//    //Eliminar alumno por su id.
//    public void eliminarAlumnoPorId(int idAlumno, String rutaFichero) throws FileNotFoundException {
//        // 1. Ruta fichero.
//        rutaFichero=rutaFicherocsv;
//        // 2. Abrir fichero a leer.
//        FileReader leerCsv = new FileReader(rutaFichero);
//        // 3. Crear ArrayList que almacena el contenido del fichero csv leido.
//        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
//        // 4. leer con Scanner.
//        Scanner sc = new Scanner(leerCsv);
//        // 5. salta la cabecera.
//        if(sc.hasNextLine()){
//            sc.nextLine();
//        }
//    }

    // obtener todos los alumnos.
    public List<Alumno> obtenerTodosAlumos(String rutaFichero) throws FileNotFoundException {
        // 1. Ruta fichero.
        rutaFichero=rutaFicherocsv;
        // 2. Abrir fichero a leer.
        FileReader leerCsv = new FileReader(rutaFichero);
        // 3. Crear ArrayList que almacena el contenido del fichero csv leido.
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        // 4. leer con Scanner.
        Scanner sc = new Scanner(leerCsv);
        // 5. salta la cabecera.
        if(sc.hasNextLine()){
            sc.nextLine();
        }

        while (sc.hasNextLine()){
            // 1. Variable que almacena la linea leida
            String linea = sc.nextLine();

            // 2. Dividir por comas.
            String[] datos = linea.split(",");

            // 3. Crear objeto Alumno para almacenar en el arryList listaAlumnos.
            int id = Integer.parseInt(datos[0].trim());
            String nombre= datos[1].trim();
            String email = datos[2].trim();

            // 4. Guardar el objeto Alumno en el arrayList.
            Alumno alumno = new Alumno(id,nombre,email);
            listaAlumnos.add(alumno);


        }
        // 6.Cerrar Scanner.
        sc.close();
        // 7. Mostrar alummos

        for (Alumno a : listaAlumnos) {
            System.out.println(a);
        }
        return listaAlumnos;
    }


}
