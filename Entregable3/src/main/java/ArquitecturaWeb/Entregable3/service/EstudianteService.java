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

    public Estudiante findByDni(Long id){
        return estudianteRepository.findByDni(id);
    }

    public List<Estudiante> findAll(){
        return estudianteRepository.findAll();
    }
}
