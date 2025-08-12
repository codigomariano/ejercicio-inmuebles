package ar.com.codigomariano.clases;

public class Departamento extends ViviendaMultiple{
	private String edificio;
	private float expensas;
	
	
	public Departamento(String direccion, float precio, int ambientes) {
		super(direccion, precio, ambientes, true);
	}


	@Override
	public void mostrarBienvenida() {
		System.out.println("Bienvenido al departamento del edificio "+ this.edificio);
	}
	
}
