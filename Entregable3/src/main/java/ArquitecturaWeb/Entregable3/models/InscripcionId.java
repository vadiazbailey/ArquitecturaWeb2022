package ArquitecturaWeb.Entregable3.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class InscripcionId implements Serializable {

    @Column(name ="id_carrera")
    private int idCarrera;

    @Column(name = "libreta_universitaria")
    private int libretaUniversitaria;

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public int getLibretaUniversitaria() {
        return libretaUniversitaria;
    }

    public void setLibretaUniversitaria(int libretaUniversitaria) {
        this.libretaUniversitaria = libretaUniversitaria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InscripcionId that = (InscripcionId) o;

        if(idCarrera != that.idCarrera) return false;
        if(libretaUniversitaria != that.libretaUniversitaria) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(this.libretaUniversitaria ^ (this.libretaUniversitaria >>> 32));
        result = 31 * result + (int)(this.idCarrera ^ (this.idCarrera >>> 32));
        return result;
    }
}
