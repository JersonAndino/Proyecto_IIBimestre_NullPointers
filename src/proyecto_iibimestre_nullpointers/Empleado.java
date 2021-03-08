/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_iibimestre_nullpointers;

/**
 *
 * @author Eduardo
 */
public abstract class Empleado extends Persona {
    protected String codigo;
    protected double ventas;
    public abstract double Sueldo();

    public Empleado(String codigo, double ventas, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.codigo = codigo;
        this.ventas = ventas;
    }
    
}
