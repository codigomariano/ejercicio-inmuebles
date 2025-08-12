package ar.com.codigomariano.clases;

public class PH extends ViviendaMultiple {
	private int cantLotes;
	
	
	public PH(String direccion, float precio, int cantAmbientes, boolean accesoCompartido, int lotes) {
		super(direccion, precio, cantAmbientes, accesoCompartido);
		this.cantLotes = lotes;
	}


	@Override
	public void mostrarBienvenida() {
		if(accesoCompartido()) System.out.println("Hola visitante!");
	}
}
