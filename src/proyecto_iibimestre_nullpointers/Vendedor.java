/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_iibimestre_nullpointers;

/**
 *
 * @author R O G
 */
public class Vendedor extends Empleado{
    private double comision;

    public Vendedor(double comision) {
        this.comision = comision;
    }
    @Override
    public double Sueldo(){
        return comision * ventas;
    }
}
