package ArquitecturaWeb.Entregable3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ArquitecturaWeb.Entregable3.models.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

   /*  @Query("SELECT e FROM Estudiante e WHERE e.dni = ?1")
    public Estudiante findByDni(int dni); */

    @Query("SELECT e FROM Estudiante e WHERE e.libretaUniversitaria = ?1")
    Estudiante findByLU(int libreta_universitaria);

    @Query("SELECT e FROM Estudiante e WHERE e.genero = ?1")
    List<Estudiante> findByGenero(String genero);
    
}
