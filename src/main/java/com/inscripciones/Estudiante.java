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
        return this.codigoMaterias.add(codigoMateria);
    }

    public Set<String> getCodigoMaterias() {
        return codigoMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "El nombre es " + this.nombre + " y la cedula es " + this.cedula;
    }
}
