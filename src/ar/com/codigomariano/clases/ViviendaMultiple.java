package ar.com.codigomariano.clases;

public abstract class ViviendaMultiple extends Inmueble {
	private boolean acceso;
	
	
	public ViviendaMultiple(String direccion, float precio, int ambientes, boolean acceso) {
		super(direccion, precio, ambientes);
		this.acceso = acceso;
	}
	
	
	public boolean accesoCompartido() {
		return this.acceso;
	}
	
	public abstract void mostrarBienvenida();
	
}
