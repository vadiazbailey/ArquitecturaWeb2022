package ArquitecturaWeb.Entregable3.service;

import ArquitecturaWeb.Entregable3.models.Inscripcion;
import ArquitecturaWeb.Entregable3.models.Reporte;
import ArquitecturaWeb.Entregable3.repository.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InscripcionService {
    @Autowired
    InscripcionRepository inscripcionRepository;

    public Inscripcion saveInscripcion(Inscripcion i){
        return inscripcionRepository.save(i);
    }

    public List<String> getReporte(){
        return inscripcionRepository.getReporte();
    }
}
