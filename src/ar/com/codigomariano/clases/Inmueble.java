package ar.com.codigomariano.clases;

public abstract class Inmueble {
	private String direccion;
	private float precio;
	private int cantAmbientes;
	
	
	public Inmueble(String direccion, float precio, int ambientes) {
		this.direccion = direccion;
		this.precio = precio;
		this.cantAmbientes = ambientes;
	}
}
