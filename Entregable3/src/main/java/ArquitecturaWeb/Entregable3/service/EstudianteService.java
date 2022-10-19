package ArquitecturaWeb.Entregable3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ArquitecturaWeb.Entregable3.models.Estudiante;
import ArquitecturaWeb.Entregable3.repository.EstudianteRepository;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;

    public Estudiante save(Estudiante e){
         return estudianteRepository.save(e);
    }

   public Estudiante findByLU(int libreta_universitaria){
        return estudianteRepository.findByLU(libreta_universitaria);
    }

    public List<Estudiante> findByGenero(String genero){
        return estudianteRepository.findByGenero(genero);
    }

    public List<Estudiante> findAll(){
        return estudianteRepository.findAll();
    }

    public List<Estudiante> findAllOrdenadoApellido(){
        return estudianteRepository.findAllOrdenadoApellido();
    }

    public List<Estudiante> findByCarreraYCiudad(int carrera, String ciudad){
        return estudianteRepository.findByCarreraYCiudad(carrera, ciudad);
    }
}
