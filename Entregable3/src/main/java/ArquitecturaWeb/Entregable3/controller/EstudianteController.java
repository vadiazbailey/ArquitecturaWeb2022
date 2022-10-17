package ArquitecturaWeb.Entregable3.controller;

import ArquitecturaWeb.Entregable3.models.Estudiante;
import ArquitecturaWeb.Entregable3.service.EstudianteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/estudiantes")
    public List<Estudiante> getAllPersonas() {
        return estudianteService.findAll();
    }

    @GetMapping("/estudiantes/{dni}")
    public Estudiante getPersonaByDni(@PathVariable Long dni) {
        return estudianteService.findByDni(dni);
    }

    @GetMapping("/agregar")
    public Estudiante addStudent(@RequestBody Estudiante e){
        return estudianteService.save(e);
    }
}
