package dev.adress.estudiantes.model;

import lombok.Getter;

@Getter
public class Persona {
    private final String nombre;
    private final String numeroCelular;
    private final String correoElectronico;
    private final Direccion direccion;

    public Persona(String nombre, String numeroCelular, String correoElectronico, Direccion direccion) {
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
    }

}