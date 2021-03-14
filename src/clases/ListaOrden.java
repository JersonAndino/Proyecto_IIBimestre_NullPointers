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
public class ListaOrden {
    ArrayList<Orden>ListOrden=new ArrayList<>();
	public ListaOrden() {
		ListOrden=new ArrayList<Orden>();
	}
	public void AgregarOrden(Orden o1) {
		ListOrden.add(o1);
	}
    
}
