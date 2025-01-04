package dev.adress.estudiantes.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import dev.adress.estudiantes.model.*;
import dev.adress.estudiantes.service.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final ServiceEstudiante serviceEstudiante;

    public EstudianteController() {
        RepositorioEstudiante repositorio = new RepositorioEstudiante();
        Direccion direccion1 = new Direccion("Calle 1", "Ciudad 1", "Estado 1", "0001", "Pais 1");
        Direccion direccion2 = new Direccion("Calle 2", "Ciudad 2", "Estado 2", "0002", "Pais 2");

        for (int i = 1; i <= 10; i++) {
            Estudiante estudiante = new Estudiante(
                "Estudiante " + i,
                "12345678" + i,
                "correo" + i + "@ejemplo.com",
                i % 2 == 0 ? direccion1 : direccion2,
                "E00" + i,
                60 + i
            );
            repositorio.agregarEstudiante(estudiante);
        }

        this.serviceEstudiante = new ServiceEstudiante(repositorio);
    }

    @GetMapping
    public List<Estudiante> listarEstudiantes() {
        return serviceEstudiante.listarEstudiantes();
    }

    @GetMapping("/filtrar/nombre")
    public List<Estudiante> filtrarPorNombre(@RequestParam String nombre) {
        return serviceEstudiante.filtrarPorNombre(nombre);
    }

    @GetMapping("/filtrar/celular")
    public List<Estudiante> filtrarPorNumeroCelular(@RequestParam String numeroCelular) {
        return serviceEstudiante.filtrarPorNumeroCelular(numeroCelular);
    }

    @GetMapping("/ordenar/promedio")
    public List<Estudiante> ordenarPorPromedioNotas() {
        return serviceEstudiante.ordenarPorPromedioNotas();
    }
}