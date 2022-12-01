package com.inscripciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivo {
    public LectorArchivo(){}

    public List<String> leer(String ruta) throws IOException{
        List<String> lineasArchivo = new ArrayList<String>();
        File lectorArchivo = new File(ruta);
        BufferedReader lectorBufer = new BufferedReader(new FileReader(lectorArchivo));

        String lineaArchivo;
        // Condition holds true till
        // there is character in a string
        while ((lineaArchivo = lectorBufer.readLine()) != null) {
            lineasArchivo.add(lineaArchivo);
        }

        return lineasArchivo;
    }
}
