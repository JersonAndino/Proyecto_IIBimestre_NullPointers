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
public class ListaComputador {
    ArrayList<Computador> ListComputador = new ArrayList<>();
	public ListaComputador() {
		ListComputador=new ArrayList<Computador>();
	}
        public void AgregarComputador(Computador c1) {
		ListComputador.add(c1);
	}
	
	
}
