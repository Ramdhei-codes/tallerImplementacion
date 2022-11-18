package com.inscripciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProcesoInscripciones {
    private HashMap<String, Estudiante> estudiantes;
    private LectorArchivo lector;

    public List<String> procesarArchivo(String ruta) {
        List<String> mi_lista = new ArrayList<String>();
        return mi_lista;
    }

    private void procesarLinea(String linea) {

    }

    private Estudiante buscarEstudiante(String cedula) {
        return new Estudiante("", "");
    }
}
