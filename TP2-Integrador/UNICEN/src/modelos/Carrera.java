package modelos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * Posee los datos de una carrera, su identificador, nombre y un listado de alumnos.
 * @author vadiazbailey {@Link  https://github.com/vadiazbailey/ArquitecturaWeb2022/tree/main/TP2-Integrador}
 * @version 1.0
 */

@Entity
@NamedQueries({
    @NamedQuery(name = "Carrera.findAll", query = "SELECT c FROM Carrera c"),
    @NamedQuery(name = "Carrera.findConInscriptos", query = "SELECT c FROM Carrera c WHERE c.alumnos.size > 0 ORDER BY c.alumnos.size DESC"),
    @NamedQuery(name = "Carrera.findFechaIngreso", query = "SELECT YEAR(i.fecha_ingreso) from inscripcion i GROUP BY YEAR(i.fecha_ingreso) ORDER BY YEAR(i.fecha_ingreso) DESC"),
    @NamedQuery(name = "Carrera.findFechaEgreso",query = "SELECT YEAR(i.fecha_egreso) from inscripcion i where fecha_egreso IS NOT NULL GROUP BY YEAR(i.fecha_egreso) ORDER BY YEAR(i.fecha_egreso) DESC")
})
public class Carrera {
    /**
     * Identificador de la carrera
     */
    @Id 
    private int idCarrera;

    /**
     * Nombre de la carrera
     */
    @Column (name = "nombre", nullable = false)
    private String nombre;

    /**
     * Listado de alumnos que cursan la carrera
     */
    @OneToMany(mappedBy = "carrera", fetch = FetchType.LAZY)
    private List<Inscripcion> alumnos;

    /**
     * Constructor por defecto
     */
    public Carrera(int idCarrera, String nombre) {
        this.idCarrera = idCarrera;
        this.nombre = nombre;
    }

    /**
     * Constructor con listado de alumnos
     */
    public Carrera(int idCarrera, String nombre, List<Inscripcion> alumnos) {
        this.idCarrera = idCarrera;
        this.nombre = nombre;
        alumnos = new ArrayList<Inscripcion>();
    }

    /**
     * Obtiene el identificador de la carrera
     * @return the idCarrera
     */
    public int getIdCarrera() {
        return idCarrera;
    }

    /**
     * Establece el identificador de la carrera
     * @param idCarrera the idCarrera to set
     */
    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    /**
     * Obtiene el nombre de la carrera
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la carrera
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el listado de alumnos que cursan la carrera
     * @return the alumnos
     */
    public List<Inscripcion> getAlumnos() {
        return alumnos;
    }

    /**
     * Establece el listado de alumnos que cursan la carrera
     * @param alumnos the alumnos to set
     */
    public void setAlumnos(List<Inscripcion> alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * Genera un String con los datos de la carrera
     */
    @Override
    public String toString() {
        return "Carrera [idCarrera=" + idCarrera + ", nombre=" + nombre + ", alumnos=" + alumnos + "]";
    }
 
}
