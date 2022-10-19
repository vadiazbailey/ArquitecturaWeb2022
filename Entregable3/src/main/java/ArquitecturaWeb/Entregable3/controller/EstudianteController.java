package ArquitecturaWeb.Entregable3.controller;

import ArquitecturaWeb.Entregable3.models.Carrera;
import ArquitecturaWeb.Entregable3.models.Estudiante;
import ArquitecturaWeb.Entregable3.service.EstudianteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @RequestMapping("/estudiantes")
    public List<Estudiante> getAllPersonas() {
        return estudianteService.findAll();
    }
    
   /*  @RequestMapping(value = "/estudiantes/{dni}", method = RequestMethod.GET, produces = "application/json")
    public Estudiante getPersonaByDni(@PathVariable int dni) {
        return estudianteService.findByDni(dni);
    } */


    @RequestMapping(value = "estudiantes/{lu}", method = RequestMethod.GET, produces = "application/json")
    public Estudiante getEstudianteByLU(@PathVariable int lu){
        return estudianteService.findByLU(lu);
    }

    @RequestMapping(value = "estudiantes/genero/{genero}", method = RequestMethod.GET, produces = "application/json")
    public List<Estudiante> getEstudiantesbyGenero(@PathVariable String genero){
        return estudianteService.findByGenero(genero);
    }

    @RequestMapping(value = "estudiantes/apellido", method = RequestMethod.GET, produces = "application/json")
    public List<Estudiante> getEstudiantesbyApellido(){
        return estudianteService.findAllOrdenadoApellido();
    }

    @RequestMapping("/agregar")
    public Estudiante addStudent(@RequestBody Estudiante e){
        return estudianteService.save(e);
    }

    /* @RequestMapping(value = "estudiantes", params={"carrera","nombre"}, method = RequestMethod.GET, produces = "application/json")
    public List<Carrera> getEstudiantesbyCarrera(@RequestParam int carrera, @RequestParam String nombre){
        return estudianteService.findByCarrera(carrera, nombre);
    } */

    @RequestMapping(value = "estudiantes", params={"carrera","ciudad"}, method = RequestMethod.GET, produces = "application/json")
    public List<Estudiante> getEstudiantesbyCarreraYCiudad(@RequestParam int carrera, @RequestParam String ciudad){
        return estudianteService.findByCarreraYCiudad(carrera, ciudad);
    }

   
}
