/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author R O G
 */
public class Computador {
    protected String Modelo;
    protected double precio;
    protected String nombre;

    public Computador(String Modelo, double precio, String nombre) {
        this.Modelo = Modelo;
        this.precio = precio;
        this.nombre = nombre;
    }
    
}
