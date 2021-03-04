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
public class Tecnico extends Empleado{
    private double comision;

    public Tecnico(double comision) {
        this.comision = comision;
    }
    
    @Override
    public double Sueldo(){
        return comision * ventas;
    }
}
