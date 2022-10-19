package ArquitecturaWeb.Entregable3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ArquitecturaWeb.Entregable3.models.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {

    @Query("SELECT DISTINCT c FROM Inscripcion i, Estudiante e, Carrera c "+
    "WHERE c.idCarrera = i.idC " +
    "AND e.libretaUniversitaria = i.libretaUniversitaria "+
    "ORDER BY i.idC DESC" )
    List<Carrera> findAllCarrerasOrdenadas();
}
