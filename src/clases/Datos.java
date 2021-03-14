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
public class Datos {
    private Administrador admin;
    private ArrayList<Empleado> personas = new ArrayList<>();
    private ArrayList<Computador> equipos = new ArrayList<>();
    private ArrayList<Venta> ventas = new ArrayList<>();
    
    public Datos(Administrador admin, ArrayList<Empleado> personas, ArrayList<Computador> equipos){
        this.admin = admin;
        this.equipos = equipos;
        this.personas = personas;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public ArrayList<Empleado> getPersonas() {
        return personas;
    }

    public ArrayList<Computador> getEquipos() {
        return equipos;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setPersonas(ArrayList<Empleado> personas) {
        this.personas = personas;
    }

    public void setEquipos(ArrayList<Computador> equipos) {
        this.equipos = equipos;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    
    
}
