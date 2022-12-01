package com.inscripciones;

import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class VentanaInscripciones
{
    public static void main( String[] args )
    {
        ProcesoInscripciones proceso = new ProcesoInscripciones();

        try {
            List<String> materiasEstudiantes = proceso.procesarArchivo("proceso.txt");

            for (String infoMaterias : materiasEstudiantes) {
                System.out.println(infoMaterias);
            }
        } catch (IOException e) {
            System.out.println("error");
        }

        

        
    }
}
