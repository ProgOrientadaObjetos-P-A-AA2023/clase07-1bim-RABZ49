/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    Ciudad ciudad;

    public Hospital(String nom, int num, double pre, Ciudad ciu) {
        nombre = nom;
        numeroCamas = num;
        presupuesto = pre;
        ciudad = ciu;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String x) {
        this.nombre = x;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public void establecerNumeroCamas(int x) {
        numeroCamas = x;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

    public void establecerPresupuesto(double x) {
        presupuesto = x;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Ciudad x) {
        ciudad = x;
    }
    
    
    
}