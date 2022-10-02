package modelos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrera {
    @Id 
    private int idCarrera;

    @Column (name = "nombre")
    private String nombre;

    @OneToMany(mappedBy = "carrera", fetch = FetchType.LAZY)
    private List<Inscripcion> alumnos;

    public Carrera(int idCarrera, String nombre) {
        this.idCarrera = idCarrera;
        this.nombre = nombre;
    }

    public Carrera(int idCarrera, String nombre, List<Inscripcion> alumnos) {
        this.idCarrera = idCarrera;
        this.nombre = nombre;
        alumnos = new ArrayList<Inscripcion>();
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Inscripcion> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Inscripcion> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Carrera [idCarrera=" + idCarrera + ", nombre=" + nombre + ", alumnos=" + alumnos + "]";
    }
 
}
