package ar.com.codigomariano;

import ar.com.codigomariano.clases.Casa;
import ar.com.codigomariano.clases.Departamento;
import ar.com.codigomariano.clases.Inmobiliaria;

public class Main {

	
	public static void main(String[] arg) {
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		
		Casa c = new Casa("Libertador 4040", 1855222f, 5, false);
		Departamento d = new Departamento("Rivadavia 1400", 85555f, 5);
		
		inmobiliaria.agregarInmueble(c);
		inmobiliaria.agregarInmueble(d);
	}
}
