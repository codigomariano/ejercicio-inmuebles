package ar.com.codigomariano;

public class ViviendaMultiple extends Inmueble {
	private boolean acceso;
	
	
	public ViviendaMultiple(String direccion, float precio, int ambientes, boolean acceso) {
		super(direccion, precio, ambientes);
		this.acceso = acceso;
	}
	
}
