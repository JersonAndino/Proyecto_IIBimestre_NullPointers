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
public class Empresa {
    private Administrador admin;
    private ArrayList<Persona> personas = new ArrayList<>();
    private ArrayList<Computador> equipos = new ArrayList<>();
    
    public Empresa(Administrador admin, ArrayList<Persona> personas, ArrayList<Computador> equipos){
        this.admin = admin;
        this.equipos = equipos;
        this.personas = personas;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public ArrayList<Computador> getEquipos() {
        return equipos;
    }
    
    
}
