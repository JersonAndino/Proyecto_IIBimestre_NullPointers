/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author R O G
 */
public class ListaEmpleados {
    ArrayList<Empleado>ListEmpleado=new ArrayList<>();
	public ListaEmpleados() {
		ListEmpleado =new ArrayList<Empleado>();
	}
        
        public void AgregarEmpleado(Empleado e1) {
		ListEmpleado.add(e1);
	}
	public void EliminarPersona(String vcedula) {
		for (Empleado e1:ListEmpleado) {
			if(e1 instanceof Vendedor ){
                            
                            if((e1.getCedula()).equals(vcedula))
				ListEmpleado.remove(e1);
                        
                        }
		}
	}
    
}
