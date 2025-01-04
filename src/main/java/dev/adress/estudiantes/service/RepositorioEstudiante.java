package dev.adress.estudiantes.service;

import dev.adress.estudiantes.model.Estudiante;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class RepositorioEstudiante {
    private final List<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

}