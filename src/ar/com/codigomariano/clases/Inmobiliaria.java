package ar.com.codigomariano.clases;

import java.util.ArrayList;
import java.util.List;

public class Inmobiliaria {
	private List<Inmueble> inmuebles;
	
	
	public Inmobiliaria() {
		this.inmuebles = new ArrayList<Inmueble>();
	}
	
	
	public void agregarInmueble(Inmueble inmueble) {
		this.inmuebles.add(inmueble);
	}
	

	public int cantidadDeCasas() {
		int contador = 0;
		
		for (Inmueble inmueble : inmuebles) {
			if(inmueble instanceof Casa) contador++;
		}
		
		return contador;
	}
	
	
	public void ingresarAPropiedad() {
		for (Inmueble inmueble : inmuebles) {
			if(inmueble instanceof ViviendaMultiple v) {
				v.mostrarBienvenida();
			}
		}
	}
}
