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
    //static int contador=1;
    private String codigo;

    public Tecnico(double comision, double ventas, String nombre, String apellido, String cedula, String codigo) {
        super( ventas, nombre, apellido, cedula);
        this.comision = comision;
        this.codigo=codigo;
    }

    public String getCodigo() {
        return codigo;
    }
    
  
   
    
    @Override
    public double Sueldo(){
        return comision * ventas;
    }
}
