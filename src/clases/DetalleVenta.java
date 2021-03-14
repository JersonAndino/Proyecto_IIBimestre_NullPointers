/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jerson Andino
 */
public class DetalleVenta {
    private Computador detalle;
    private double cantidad;
    private double precioTotal;
    
    public DetalleVenta(Computador detalle, double cantidad){
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precioTotal = detalle.getPrecio()*this.cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }
    
    
    
}
