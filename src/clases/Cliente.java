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
public class Cliente extends Persona{
   private String numeroTelefonico;
   private String Direccion;

    public Cliente(String numeroTelefonico, String Direccion, String nombre, String apellido, String cedula) {
        super(nombre, apellido, cedula);
        this.numeroTelefonico = numeroTelefonico;
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return super.toString() +  "\nNumeroTelefonico: " + numeroTelefonico + ", Direccion: " + Direccion;
    }

    

   
   
}
