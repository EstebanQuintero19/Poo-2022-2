package com.LeviathanBanco.Dominio;

public class Persona {
    public String nombre;
    public int cedula;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
}
