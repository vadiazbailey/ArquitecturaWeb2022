package modelos;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estudiante {
    /*Consideramos como identificador unico la libreta universitaria, ya que los dni a veces pueden coincidir */
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int libretaUniversitaria;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private int edad;

    @Column
    private String genero;

    @Column
    private int dni;

    @Column
    private String ciudadResidencia;

    @OneToMany (mappedBy = "estudiante", fetch = FetchType.LAZY)
    private List<Inscripcion> inscripciones;

     /**
     * Constructor por defecto
     */
    public Estudiante(int libretaUniversitaria, 
                      String nombre, 
                      String apellido, 
                      int edad, 
                      String genero, 
                      int dni,
                      String ciudadResidencia) {
        this.libretaUniversitaria = libretaUniversitaria;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.dni = dni;
        this.ciudadResidencia = ciudadResidencia;
    }

    public Estudiante(int libretaUniversitaria, 
                      String nombre, 
                      String apellido,
                      int edad,
                      String genero,
                      int dni,
                      String ciudadResidencia, 
                      List<Inscripcion> inscripciones) {
        this.libretaUniversitaria = libretaUniversitaria;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.dni = dni;
        this.ciudadResidencia = ciudadResidencia;
        inscripciones = new ArrayList<Inscripcion>();
    }

    public int getLibretaUniversitaria() {
        return libretaUniversitaria;
    }

    public void setLibretaUniversitaria(int libretaUniversitaria) {
        this.libretaUniversitaria = libretaUniversitaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }

    @Override
    public String toString() {
        return "Estudiante [libretaUniversitaria=" + libretaUniversitaria + ", nombre=" + nombre + ", apellido="
                + apellido + ", edad=" + edad + ", genero=" + genero + ", dni=" + dni + ", ciudadResidencia="
                + ciudadResidencia + ", inscripciones=" + inscripciones + "]";
    }

}
