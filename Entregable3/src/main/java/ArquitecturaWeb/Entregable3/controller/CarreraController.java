package ArquitecturaWeb.Entregable3.controller;

import ArquitecturaWeb.Entregable3.models.Carrera;
import ArquitecturaWeb.Entregable3.service.CarreraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarreraController {
    @Autowired
    private CarreraService carreraService;

    @RequestMapping("/carreras")
    public List<Carrera> getAllCarrerasInscriptosOrdenadas() {
        return carreraService.findAllCarrerasOrdenadas();
    }
}
