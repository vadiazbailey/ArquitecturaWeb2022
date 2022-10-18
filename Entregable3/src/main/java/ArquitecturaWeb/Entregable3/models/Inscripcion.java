package ArquitecturaWeb.Entregable3.models;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Posee los datos de una inscripcion, fecha de inscripcion, carrera y estudiante.
 * @author vadiazbailey {@Link  https://github.com/vadiazbailey/ArquitecturaWeb2022/tree/main/TP2-Integrador}
 * @version 1.0
 */
@Entity
@Table(name = "inscripcion")
public class Inscripcion {
    @EmbeddedId
    private InscripcionId id;

    @ManyToOne
    @MapsId("libretaUniversitaria")
    @JoinColumn(name = "libreta_universitaria", nullable = false)
    private Estudiante libretaUniversitaria;

    @ManyToOne
    @MapsId("idCarrera")
    @JoinColumn(name = "id_carrera", nullable = false)
    private Carrera idC;

    /**
     * Fecha de ingreso a la carrera
     */
    @Column(name = "fecha_inscripcion", nullable = false)
    private Timestamp fecha_ingreso;

    /**
     * Fecha de egreso de la carrera
     */
    @Column(name = "fecha_egreso", nullable = true)
    private Timestamp fecha_egreso;

    public InscripcionId getId() {
        return id;
    }

    public void setId(InscripcionId id) {
        this.id = id;
    }

    public Estudiante getLibretaUniversitaria() {
        return libretaUniversitaria;
    }

    public void setLibretaUniversitaria(Estudiante libretaUniversitaria) {
        this.libretaUniversitaria = libretaUniversitaria;
    }

    public Carrera getIdCarrera() {
        return idC;
    }

    public void setIdCarrera(Carrera idC) {
        this.idC= idC;
    }

    public Timestamp getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Timestamp fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Timestamp getFecha_egreso() {
        return fecha_egreso;
    }

    public void setFecha_egreso(Timestamp fecha_egreso) {
        this.fecha_egreso = fecha_egreso;
    }
}




