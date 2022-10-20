package ArquitecturaWeb.Entregable3.models;
import java.sql.Date;

public class Reporte {
    private String nombreCarrera;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private Date fechaInscripcionEstudiante;
    private String edadEstudiante;
    private Date fechaEgresoEstudiante;
    private String generoEstudiante;
    private String ciudadResidenciaEstudiante;
    private int dniEstudiante;

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public Date getFechaInscripcionEstudiante() {
        return fechaInscripcionEstudiante;
    }

    public void setFechaInscripcionEstudiante(Date fechaInscripcionEstudiante) {
        this.fechaInscripcionEstudiante = fechaInscripcionEstudiante;
    }

    public String getEdadEstudiante() {
        return edadEstudiante;
    }

    public void setEdadEstudiante(String edadEstudiante) {
        this.edadEstudiante = edadEstudiante;
    }

    public Date getFechaEgresoEstudiante() {
        return fechaEgresoEstudiante;
    }

    public void setFechaEgresoEstudiante(Date fechaEgresoEstudiante) {
        this.fechaEgresoEstudiante = fechaEgresoEstudiante;
    }

    public String getGeneroEstudiante() {
        return generoEstudiante;
    }

    public void setGeneroEstudiante(String generoEstudiante) {
        this.generoEstudiante = generoEstudiante;
    }

    public String getCiudadResidenciaEstudiante() {
        return ciudadResidenciaEstudiante;
    }

    public void setCiudadResidenciaEstudiante(String ciudadResidenciaEstudiante) {
        this.ciudadResidenciaEstudiante = ciudadResidenciaEstudiante;
    }

    public int getDniEstudiante() {
        return dniEstudiante;
    }

    public void setDniEstudiante(int dniEstudiante) {
        this.dniEstudiante = dniEstudiante;
    }

    public Reporte(String nombreCarrera, String nombreEstudiante, String apellidoEstudiante, Date fechaInscripcionEstudiante, String edadEstudiante, Date fechaEgresoEstudiante, String generoEstudiante, String ciudadResidenciaEstudiante, int dniEstudiante) {
        this.nombreCarrera = nombreCarrera;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.fechaInscripcionEstudiante = fechaInscripcionEstudiante;
        this.edadEstudiante = edadEstudiante;
        this.fechaEgresoEstudiante = fechaEgresoEstudiante;
        this.generoEstudiante = generoEstudiante;
        this.ciudadResidenciaEstudiante = ciudadResidenciaEstudiante;
        this.dniEstudiante = dniEstudiante;
    }

    @Override
    public String toString() {
        return "Reporte{" +
                "nombreCarrera='" + nombreCarrera + '\'' +
                ", nombreEstudiante='" + nombreEstudiante + '\'' +
                ", apellidoEstudiante='" + apellidoEstudiante + '\'' +
                ", fechaInscripcionEstudiante=" + fechaInscripcionEstudiante +
                ", edadEstudiante='" + edadEstudiante + '\'' +
                ", fechaEgresoEstudiante=" + fechaEgresoEstudiante +
                ", generoEstudiante='" + generoEstudiante + '\'' +
                ", ciudadResidenciaEstudiante='" + ciudadResidenciaEstudiante + '\'' +
                ", dniEstudiante=" + dniEstudiante +
                '}';
    }
}
