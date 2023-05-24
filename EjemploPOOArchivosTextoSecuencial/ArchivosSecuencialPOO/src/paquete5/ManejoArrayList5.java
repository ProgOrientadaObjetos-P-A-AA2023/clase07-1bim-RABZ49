/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.util.ArrayList;
import java.util.Arrays;
import paquete1.Profesor2;

/**
 *
 * @author SALA H
 */
public class ManejoArrayList5 {

    public static void main(String[] args) {
        String[] lineas = {"Tara Hernandez|contratado|30",
            "Luis Andrade|Factura|35", "Ana Juarez|Nombramiento|40"};
        for (int i = 0; i < lineas.length; i++) {
            String cadena = lineas[i];

            ArrayList<String> lineasN = new ArrayList<>(
                    Arrays.asList(cadena.split("\\|")));
            String nombre = lineasN.get(0);
            String tipo = lineasN.get(1);
            String edad = lineasN.get(2);
            int edad2 = Integer.parseInt(edad);
            Profesor2 p2 = new Profesor2(nombre, tipo, edad2);
            System.out.println(p2);
        }

    }
}
