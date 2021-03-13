/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Eduardo
 */
public abstract class Empleado extends Persona {
   
    protected double ventas;
    public abstract double Sueldo();

    public Empleado( double ventas, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
      
        this.ventas = ventas;
    }
    
}
