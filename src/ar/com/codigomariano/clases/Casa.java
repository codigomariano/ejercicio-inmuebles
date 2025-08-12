package ar.com.codigomariano.clases;

public class Casa extends Inmueble {
	private boolean piscina; 
	
	
	public Casa(String direccion, float precio, int ambientes, boolean tienePiscina) {
		super(direccion, precio, ambientes);
		this.piscina = tienePiscina;
	}

}
