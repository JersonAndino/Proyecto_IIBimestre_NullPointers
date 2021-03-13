/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Usuario
 */
public class Administrador extends Persona{
    private String codigo;

    public Administrador(String codigo, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    

   

    
    
    

 
    
}
