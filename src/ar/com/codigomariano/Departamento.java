package ar.com.codigomariano;

public class Departamento extends ViviendaMultiple{
	private float expensas;
	
	
	public Departamento(String direccion, float precio, int ambientes) {
		super(direccion, precio, ambientes, true);
	}
	
}
