package Guia7;

import java.util.ArrayList;

public class Receta {
	
	private String nombre;
	private int numero;

	private ArrayList<String> ingredientes;
	public Receta(String nombre, int numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
		this.ingredientes = new ArrayList<String>();
	}
	
	
	public Receta() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public int getNumero() {
		return numero;
	}
	
	public ArrayList<String> getingredientes(){
		return null;
	}
	
	
	
	
	
	

}
