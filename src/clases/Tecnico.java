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
public class Tecnico extends Empleado{
    private double comision;
    static int contador=1;
    private String codigo;

    public Tecnico(double comision, String codigo, double ventas, String nombre, String apellido, String cedula) {
        super( ventas, nombre, apellido, cedula);
        this.comision = comision;
        this.codigo="TEC"+contador;
        contador++;
    }

  
   
    
    @Override
    public double Sueldo(){
        return comision * ventas;
    }
}
