/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_iibimestre_nullpointers;

/**
 *
 * @author Usuario
 */
public class Administrador extends Persona {
    private int codigo;

    public Administrador(String nombre, String apellido,int codigo) {
        super(nombre, apellido);
        this.codigo=codigo;
    }

 
    
}
