package dev.adress.estudiantes.service;

import dev.adress.estudiantes.model.Estudiante;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceEstudiante {
    private final RepositorioEstudiante repositorio;

    public ServiceEstudiante(RepositorioEstudiante repositorio) {
        this.repositorio = repositorio;
    }

    public List<Estudiante> listarEstudiantes() {
        return repositorio.getEstudiantes();
    }

    public List<Estudiante> filtrarPorNombre(String nombre) {
        return repositorio.getEstudiantes().stream()
            .filter(est -> est.getNombre().equalsIgnoreCase(nombre))
            .collect(Collectors.toList());
    }

    public List<Estudiante> filtrarPorNumeroCelular(String numeroCelular) {
        return repositorio.getEstudiantes().stream()
            .filter(est -> est.getNumeroCelular().equals(numeroCelular))
            .collect(Collectors.toList());
    }

    public List<Estudiante> ordenarPorPromedioNotas() {
        return repositorio.getEstudiantes().stream()
            .sorted(Comparator.comparingDouble(Estudiante::getPromedioNotas).reversed())
            .collect(Collectors.toList());
    }
}