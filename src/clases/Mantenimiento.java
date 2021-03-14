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
public class Mantenimiento extends Cliente{
    protected String DetallesProblema;
    protected double Precio;
    protected String Fecha;
    protected String Duracion;

    public Mantenimiento(String DetallesProblema, double Precio, String Fecha, String Duracion, String numeroTelefonico, String Direccion, String nombre, String apellido, String cedula) {
        super(numeroTelefonico, Direccion, nombre, apellido, cedula);
        this.DetallesProblema = DetallesProblema;
        this.Precio = Precio;
        this.Fecha = Fecha;
        this.Duracion = Duracion;
    }
    
}
