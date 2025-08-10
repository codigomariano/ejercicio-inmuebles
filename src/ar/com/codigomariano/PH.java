package ar.com.codigomariano;

public class PH extends ViviendaMultiple {
	private int cantLotes;
	
	
	public PH(String direccion, float precio, int cantAmbientes, boolean accesoCompartido, int lotes) {
		super(direccion, precio, cantAmbientes, accesoCompartido);
		this.cantLotes = lotes;
	}
}
