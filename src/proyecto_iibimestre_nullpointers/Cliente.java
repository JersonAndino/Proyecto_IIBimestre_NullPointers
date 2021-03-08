/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_iibimestre_nullpointers;

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

    

   
   
}
