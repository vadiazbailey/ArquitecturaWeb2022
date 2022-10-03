package modelos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Posee los datos de un estudiante, sus datos, con su identificador (libreta universitaria), nombre, apellido, 
 * edad y un listado de inscripciones a las carreras.
 * @author vadiazbailey {@Link  https://github.com/vadiazbailey/ArquitecturaWeb2022/tree/main/TP2-Integrador}
 * @version 1.0
 */
@Entity
public class Estudiante {
    /**
     * Identificador del estudiante
     * Consideramos como identificador unico la libreta universitaria, ya que los dni a veces pueden coincidir
     */
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int libretaUniversitaria;

    /**
     * Nombre del estudiante
     */
    @Column (name = "nombre", nullable = false)
    private String nombre;

    /**
     * Apellido del estudiante
     */
    @Column (name = "apellido", nullable = false)
    private String apellido;

    /**
     * Edad del estudiante
     */
    @Column (name = "edad", nullable = false)
    private int edad;

    /**
     * Listado de inscripciones del estudiante
     */
    @Column (name = "genero", nullable = false)
    private String genero;

    /**
     * Listado de inscripciones del estudiante
     */
    @Column (name = "dni", nullable = false)
    private int dni;

    /**
     * Listado de inscripciones del estudiante
     */
    @Column (name = "direccion", nullable = false)
    private String ciudadResidencia;

    /**
     * Listado de inscripciones del estudiante
     */
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

    /**
     * Constructor con listado de inscripciones
     */
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

    /**
     * Obtiene el identificador del estudiante
     * @return identificador del estudiante
     */
    public int getLibretaUniversitaria() {
        return libretaUniversitaria;
    }

    /**
     * Establece el identificador del estudiante
     * @param libretaUniversitaria del estudiante
     */
    public void setLibretaUniversitaria(int libretaUniversitaria) {
        this.libretaUniversitaria = libretaUniversitaria;
    }

    /**
     * Obtiene el nombre del estudiante
     * @return nombre del estudiante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante
     * @param nombre del estudiante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del estudiante
     * @return apellido del estudiante
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del estudiante
     * @param apellido del estudiante
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la edad del estudiante
     * @return edad del estudiante
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del estudiante
     * @param edad del estudiante
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el genero del estudiante
     * @return genero del estudiante
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el genero del estudiante
     * @param genero del estudiante
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene el dni del estudiante
     * @return dni del estudiante
     */
    public int getDni() {
        return dni;
    }

    /**
     * Establece el dni del estudiante
     * @param dni del estudiante
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * Obtiene la ciudad de residencia del estudiante
     * @return ciudad de residencia del estudiante
     */
    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    /**
     * Establece la ciudad de residencia del estudiante
     * @param ciudadResidencia del estudiante
     */
    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    /**
     * Obtiene el listado de inscripciones del estudiante
     * @return listado de inscripciones del estudiante
     */
    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    /**
     * Establece el listado de inscripciones del estudiante
     * @param inscripciones del estudiante
     */
    public void setInscripciones(List<Inscripcion> inscripciones) {
        this.inscripciones = inscripciones;
    }

    /**
     * Imprime los datos del estudiante
     */
    @Override
    public String toString() {
        return "Estudiante [libretaUniversitaria=" + libretaUniversitaria + ", nombre=" + nombre + ", apellido="
                + apellido + ", edad=" + edad + ", genero=" + genero + ", dni=" + dni + ", ciudadResidencia="
                + ciudadResidencia + ", inscripciones=" + inscripciones + "]";
    }

}
