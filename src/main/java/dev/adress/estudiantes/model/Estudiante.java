package dev.adress.estudiantes.model;

import lombok.Getter;

@Getter
public class Estudiante extends Persona {
    private final String numeroEstudiante;
    private final double promedioNotas;

    public Estudiante(String nombre, String numeroCelular, String correoElectronico, Direccion direccion, String numeroEstudiante, double promedioNotas) {
        super(nombre, numeroCelular, correoElectronico, direccion);
        this.numeroEstudiante = numeroEstudiante;
        this.promedioNotas = promedioNotas;
    }

}