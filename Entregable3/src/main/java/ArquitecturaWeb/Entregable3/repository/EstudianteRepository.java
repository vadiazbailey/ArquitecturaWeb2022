package ArquitecturaWeb.Entregable3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ArquitecturaWeb.Entregable3.models.Carrera;
import ArquitecturaWeb.Entregable3.models.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    @Query("SELECT e FROM Estudiante e WHERE e.libretaUniversitaria = ?1")
    Estudiante findByLU(int libreta_universitaria);

    @Query("SELECT e FROM Estudiante e WHERE e.genero = ?1")
    List<Estudiante> findByGenero(String genero);

    @Query("SELECT e FROM Estudiante e ORDER BY apellido ASC")
    List<Estudiante> findAllOrdenadoApellido();

    /* @Query("SELECT c FROM Carrera c WHERE c.idCarrera = ?1 AND c.nombre = ?2")
    List<Carrera> findByCarrera(int carrera, String nombre); */
    
    /* @Query("SELECT e FROM Inscripcion i "+
    "INNER JOIN Carrera c ON c.idCarrera = i.idC "+
    "INNER JOIN Estudiante e ON e.inscripcionId = i.libretaUniversitaria "+
    "WHERE c.idCarrera = ?1 AND e.ciudadResidencia = ?2")
    List<Estudiante> findByCarreraYCiudad(int carrera, String ciudad); */

    @Query("SELECT e FROM Inscripcion i " +
    "INNER JOIN Carrera c ON c.idCarrera = i.idC " +
    "INNER JOIN Estudiante e ON e.libretaUniversitaria = i.libretaUniversitaria "+
    "WHERE c.idCarrera = ?1 AND e.ciudadResidencia = ?2")
    List<Estudiante> findByCarreraYCiudad(int carrera, String ciudad);
}
