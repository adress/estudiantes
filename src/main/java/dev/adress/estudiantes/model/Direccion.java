package dev.adress.estudiantes.model;

import lombok.Getter;

@Getter
public class Direccion {
    private final String direccion;
    private final String ciudad;
    private final String estado;
    private final String codigoPostal;
    private final String pais;

    public Direccion(String direccion, String ciudad, String estado, String codigoPostal, String pais) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

}