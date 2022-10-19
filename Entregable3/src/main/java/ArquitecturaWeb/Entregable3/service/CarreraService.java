package ArquitecturaWeb.Entregable3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ArquitecturaWeb.Entregable3.models.Carrera;
import ArquitecturaWeb.Entregable3.repository.CarreraRepository;

@Service
public class CarreraService {
    @Autowired
    CarreraRepository carreraRepository;

    public Carrera save(Carrera c){
         return carreraRepository.save(c);
    }

    public List<Carrera> findAllCarrerasOrdenadas(){
        return carreraRepository.findAllCarrerasOrdenadas();
    }

}
