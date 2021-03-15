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
public class Orden {
    private String Componente;
    private int cantidad;
    private String distribuidor;

    public Orden(String Componente, int cantidad, String distribuidor) {
        this.Componente = Componente;
        this.cantidad = cantidad;
        this.distribuidor = distribuidor;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

  

    public String getComponente() {
        return Componente;
    }

    public void setComponente(String Componente) {
        this.Componente = Componente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Orden{" + "Componente=" + Componente + ", cantidad=" + cantidad + ", distribuidor=" + distribuidor + '}';
    }
    
    
}
