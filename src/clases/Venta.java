/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Jerson Andino
 */
public class Venta {
    private int numVenta;
    private Cliente cliente;
    private Vendedor vendedor;    
    private ArrayList<DetalleVenta> detalles = new ArrayList<>();
    private double totalVenta;
        
    public Venta(int numVenta, Vendedor vendedor, ArrayList<DetalleVenta> detalles, Cliente cliente){
        this.cliente = cliente;
        this.numVenta = numVenta;
        this.vendedor = vendedor;
        this.detalles = detalles;
        double sum = 0;
        for(int i=0; i<this.detalles.size(); i++){
            sum += detalles.get(i).getPrecioTotal();
        }
        this.totalVenta = sum;
    }

    @Override
    public String toString() {
        return "Venta: NumVenta: " + numVenta + "\nCliente: " + cliente + "\nVendedor: " + vendedor + "\nDetalles: " + detalles + "\nTotalVenta: " + totalVenta + '}';
    }
    
        
}
