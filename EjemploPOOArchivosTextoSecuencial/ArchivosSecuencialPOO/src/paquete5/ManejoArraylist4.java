/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import java.util.Arrays;
import paquete1.Calificacion;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArraylist4 {

    public static void main(String[] args) {
        String linea = "Tara Hernandez;contratado";

        ArrayList<String> linea_partes = new ArrayList<>(
                Arrays.asList(linea.split(";")) // ["Tara Hernandez", "contratado"]
        );
        Profesor p = new Profesor(linea_partes.get(0), // Tara Hernandez
                linea_partes.get(1)); // contratado;

        System.out.println(p);
    }
}