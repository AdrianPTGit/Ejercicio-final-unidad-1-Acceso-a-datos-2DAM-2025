package modelo;

import java.io.Serializable;

public class Alumno implements Serializable {
    private int idAlumno;
    private String nombre;
    private String email;

    public Alumno(int idAlumno, String nombre, String email) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return idAlumno;
    }

    public void setId(int id) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "idAlumno=" + idAlumno +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
