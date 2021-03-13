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
public class Vendedor extends Empleado{
    private double comision;

    public Vendedor(String codigo, double ventas, String nombre, String apellido, String cedula) {
        super(codigo, ventas, nombre, apellido, cedula);
    }
    
    public Vendedor(double comision, String codigo, double ventas, String nombre, String apellido, String cedula) {
        super(codigo, ventas, nombre, apellido, cedula);
        this.comision = comision;
    }

    @Override
    public double Sueldo(){
        return 450+(comision * ventas);
    }
}
