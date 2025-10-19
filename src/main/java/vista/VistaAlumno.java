package vista;

import controlador.AlumnoControladorCSV;
import repositorio.AlumnoRepositorioCSV;

import repositorio.AlumnoRepositorioBinario;
import controlador.AlumnoControladorBinario;


import java.util.Scanner;

public class VistaAlumno {

    public static void main(String[] args) {
        //ficchero CSV.
        AlumnoRepositorioCSV repositorio = new AlumnoRepositorioCSV();
        AlumnoControladorCSV controlador = new AlumnoControladorCSV(repositorio);

        // Fichero Binario.
        AlumnoRepositorioBinario repositorioBin = new AlumnoRepositorioBinario();
        AlumnoControladorBinario controladorBin = new AlumnoControladorBinario(repositorioBin);

        // Obtener opcion menu desde teclado.
        Scanner sc = new Scanner(System.in);
        int opcionMenu;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Fichero CSV");
            System.out.println("2. Fichero XML");
            System.out.println("3. Fichero Binario");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcionMenu = sc.nextInt();

            switch (opcionMenu) {
                case 1: // Fichero CSV
                    int opcionCSV;
                    System.out.println("---- Fichero CSV ----");
                    System.out.println("1. Mostrar lista alumnos");
                    System.out.println("2. Crear nuevo alumno");
                    System.out.print("Elige una opción: ");
                    opcionCSV = sc.nextInt();
                    switch (opcionCSV) {
                        case 1:
                            System.out.println("Mostrando lista de alumnos CSV...");
                            controlador.mostrarAlumnos();
                            break;
                        case 2:
                            System.out.println("Creando nuevo alumno CSV...");
                            System.out.print("Introduce ID: ");
                            int id = sc.nextInt();
                            sc.nextLine(); // limpiar buffer
                            System.out.print("Introduce nombre: ");
                            String nombre = sc.nextLine();
                            System.out.print("Introduce email: ");
                            String email = sc.nextLine();
                            controlador.agregarAlumno(id, nombre, email);
                            break;
                        default:
                            System.out.println("Opción CSV inválida.");
                    }
                    break;

                case 2: // Fichero XML
                    int opcionXML;
                    System.out.println("---- Fichero XML ----");
                    System.out.println("1. Mostrar alumnos");
                    System.out.println("2. Crear alumno");
                    System.out.print("Elige una opción: ");
                    opcionXML = sc.nextInt();
                    switch (opcionXML) {
                        case 1:
                            System.out.println("Mostrando alumnos XML...");
                            break;
                        case 2:
                            System.out.println("Creando alumno XML...");
                            break;
                        default:
                            System.out.println("Opción XML inválida.");
                    }
                    break;

                case 3: // Fichero Binario
                    int opcionBinario;
                    System.out.println("---- Fichero Binario ----");
                    System.out.println("1. Mostrar alumnos");
                    System.out.println("2. Crear alumno");
                    System.out.print("Elige una opción: ");
                    opcionBinario = sc.nextInt();
                    switch (opcionBinario) {

                        case 1:
                            System.out.println("Mostrando alumnos binario...");
                            controladorBin.mostrarAlumnosBinario();
                            break;
                        case 2:
                            System.out.println("Creando nuevo alumno Binario...");
                            System.out.print("Introduce ID: ");
                            int id = sc.nextInt();
                            sc.nextLine(); // limpiar buffer
                            System.out.print("Introduce nombre: ");
                            String nombre = sc.nextLine();
                            System.out.print("Introduce email: ");
                            String email = sc.nextLine();
                            controladorBin.agregarAlumnoBinario(id, nombre, email);
                            break;
                        default:
                            System.out.println("Opción binario inválida.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción de menú inválida.");
            }

            System.out.println(); // Espacio antes de volver a mostrar el menú
        } while (opcionMenu != 0);

        sc.close();
    }
}
