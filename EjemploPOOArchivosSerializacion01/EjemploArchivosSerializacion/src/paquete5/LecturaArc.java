/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import paquete1.Calificacion;

/**
 *
 * @author SALAI
 */
public class LecturaArc {

    private ObjectInputStream entrada;
    private ArrayList<Hospital> hospitales;
    private String nombreArchivo;

    public LecturaArc(String n) {
        nombreArchivo = n;
        File f = new File(nombreArchivo);
        if (f.exists()) {
            try {
                entrada = new ObjectInputStream(
                        new FileInputStream(nombreArchivo));
            } catch (IOException ioException) {
                System.err.println("Error al abrir el archivo.");

            }
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerListaHospitales() {
        // 
        hospitales = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Hospital registro = (Hospital) entrada.readObject();
                    hospitales.add(registro);
                } catch (EOFException endOfFileException) {
                    return;

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {

                    break;
                }
            }
        }

    }

    public ArrayList<Hospital> obtenerListaHospitales() {
        return hospitales;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "\nLista de Hospitales:\n\n";
        for (int i = 0; i < obtenerListaHospitales().size(); i++) {
            Hospital h = obtenerListaHospitales().get(i);
            cadena = String.format("%s%s\nnumero de camas: %d\n"
                    + "Presupuesto: %.2f\n"
                    + "Ciudad:%s"
                    + "Habitantes: %d\n\n\n", cadena,
                    h.nombre, h.numeroCamas, h.presupuesto,
                    h.obtenerCiudad().obtenerNombre(),
                    h.obtenerCiudad().obtenerHabitantes());
        }

        return cadena;
    }

    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        }
    }
}
