package com.inscripciones;

import java.util.Set;

public class Estudiante {
    private String cedula;
    private String nombre;
    private Set<String> codigoMaterias;

    public Estudiante(String cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public boolean adicionarMateria(String codigoMateria){
        return false;
    }

    @Override
    public String toString() {
        return "El nombre es " + this.nombre + " y la cedula es " + this.cedula;
    }
}
