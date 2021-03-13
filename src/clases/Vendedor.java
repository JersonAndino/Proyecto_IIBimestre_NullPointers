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
    static int contador=1;
    private String codigo;
   
    
    public Vendedor(double comision, String codigo, double ventas, String nombre, String apellido, String cedula) {
        super( ventas, nombre, apellido, cedula);
        this.codigo="VNT"+contador;
        this.comision = comision;
        contador++;
    }

    @Override
    public double Sueldo(){
        return 450+(comision * ventas);
    }
}
