package ArquitecturaWeb.Entregable3.controller;
import ArquitecturaWeb.Entregable3.models.Estudiante;
import ArquitecturaWeb.Entregable3.service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    EstudianteService estudianteService;

    @GetMapping(value="/all", produces="application/json", consumes="application/json")
    public List<Estudiante> getAllPersonas() {
        return estudianteService.findAll();
    }

    /*@RequestMapping(value="/get", params = {"libretaUniversitaria"}, produces = "application/json")
    public Estudiante getEstudianteByLU(@RequestParam Long libretaUniversitaria) throws Exception {
        Optional<Estudiante> e = estudianteService.findById(libretaUniversitaria);
        System.out.println(e.get().getNombre());
        if (e.isEmpty()){
            throw new Exception("No existe el estudiante con LU: " + libretaUniversitaria);
        }
        else{
            return e.get();
        }
    }*/

    @PostMapping(value="/agregar", produces="application/json", consumes="application/json")
    public Estudiante addStudent(@RequestBody Estudiante e){
        return estudianteService.save(e);
    }

    @RequestMapping(value = "{lu}", method = RequestMethod.GET, produces = "application/json")
    public Estudiante getEstudianteByLU(@PathVariable Long lu){
        return estudianteService.findByLU(lu);
    }

    @RequestMapping(value = "genero/{genero}", method = RequestMethod.GET, produces = "application/json")
    public List<Estudiante> getEstudiantesbyGenero(@PathVariable String genero){
        return estudianteService.findByGenero(genero);
    }

    @RequestMapping(value = "apellido", method = RequestMethod.GET, produces = "application/json")
    public List<Estudiante> getEstudiantesbyApellido(){
        return estudianteService.findAllOrdenadoApellido();
    }

    @RequestMapping(params={"carrera","ciudad"}, method = RequestMethod.GET, produces = "application/json")
    public List<Estudiante> getEstudiantesbyCarreraYCiudad(@RequestParam Long carrera, @RequestParam String ciudad){
        return estudianteService.findByCarreraYCiudad(carrera, ciudad);
    }
}
