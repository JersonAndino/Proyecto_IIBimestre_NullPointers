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
    protected int numVenta;
    protected Vendedor vendedor;    
    ArrayList<Computador> computadores = new ArrayList<>(); 
    
    public Venta(int numVenta, Vendedor vendedor, ArrayList<Computador> computadores){
        this.numVenta = numVenta;
        this.vendedor = vendedor;
        this.computadores = computadores;
    }
        
}
