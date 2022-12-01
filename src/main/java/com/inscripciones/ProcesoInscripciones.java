package com.inscripciones;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;

public class ProcesoInscripciones {
    private HashMap<String, Estudiante> estudiantes;
    private LectorArchivo lector;

    public List<String> procesarArchivo(String ruta) throws IOException {
        List<String> lineasArchivo = this.lector.leer(ruta);

        for (String linea : lineasArchivo) {
            procesarLinea(linea);
        }

        List<String> materiasEstudiantes = new ArrayList<>();

        for(Estudiante estudiante: estudiantes.values()){
            materiasEstudiantes.add(estudiante.getNombre() + " " + estudiante.getCodigoMaterias().size() + "materias");
        }

        return lineasArchivo;
    }

    private void procesarLinea(String linea) {
        String[] arregloLinea = linea.split(",");

        if (arregloLinea.length != 4) {
            return;
        }

        String cedulaEstudiante = arregloLinea[0];
        String nombreEstudiante = arregloLinea[1];
        String materiaEstudiante = arregloLinea[2];

        Estudiante estudianteBuscado = buscarEstudiante(cedulaEstudiante);

        if (estudianteBuscado == null) {
            estudianteBuscado = new Estudiante(cedulaEstudiante, nombreEstudiante);
            estudiantes.put(cedulaEstudiante, estudianteBuscado);
        }

        estudianteBuscado.adicionarMateria(materiaEstudiante);


    }

    private Estudiante buscarEstudiante(String cedula) {
        return estudiantes.get(cedula);
    }
}
