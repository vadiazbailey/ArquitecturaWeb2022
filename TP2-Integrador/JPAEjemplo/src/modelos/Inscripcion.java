package modelos;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Inscripcion implements Serializable{
    @Id
    @ManyToOne
    @JoinColumn(name = "idCarrera")
    private Carrera carrera;

    @Id
    @ManyToOne
    @JoinColumn(name = "libretaUniversitaria")
    private Estudiante estudiante;

    @Column
	private Timestamp fecha_ingreso;
	
	@Column(nullable = true)
	private Timestamp fecha_egreso;

    public Inscripcion(Carrera carrera, Estudiante estudiante, Timestamp fecha_ingreso, Timestamp fecha_egreso) {
        this.carrera = carrera;
        this.estudiante = estudiante;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_egreso = fecha_egreso;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
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

    @Override
    public String toString() {
        return "Inscripcion [carrera=" + carrera + ", estudiante=" + estudiante + ", fecha_ingreso=" + fecha_ingreso
                + ", fecha_egreso=" + fecha_egreso + "]";
    }

}
