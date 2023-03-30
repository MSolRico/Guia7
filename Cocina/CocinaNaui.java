package Guia7;
import java.util.ArrayList;

public class Cocina {
	
	private ArrayList<Receta> recetas;
	private ArrayList<String> ingredientes;

	public Cocina() {
		this.recetas = new ArrayList<Receta>();
		this.ingredientes = new ArrayList<String>();
	}
	
	public void meterIngredientes(String ingredientes) {
		this.ingredientes.add(ingredientes);
	}
	
	
	
	
	
	
	public ArrayList<Receta> getRecetas(){
		ArrayList<Receta> lista = new ArrayList<Receta>();
		for(int i =0; i<this.ingredientes.size();i++) {
			for(int j=0; j<this.recetas.size();j++) {
				if(this.ingredientes.get(i).equals(this.recetas.get(j).getingredientes().get(i))) {
					lista.add(this.recetas.get(j));
				}
			}
		}
		return lista;
	}
	
	public void añadirReceta(Receta receta) {
		this.recetas.add(receta);
	}
	
	public Receta buscarReceta(String nombre) {
		Receta r = null;
		
		for(int i = 0 ; i<this.recetas.size();i++) {
			if(this.recetas.get(i).getNombre().equals(nombre)) {
				r = this.recetas.get(i);
			}
		}
		return r;
	}
	
	public static void main(String[]args) {
		Cocina cocina = new Cocina();
		Receta receta = new Receta("Hamburguesa",1);
		Receta receta2 = new Receta("Chorizo",2);
		
		cocina.añadirReceta(receta);
		cocina.meterIngredientes("Tomate");
		cocina.meterIngredientes("Salsa");
		cocina.buscarReceta("Chorizo");
	}

}
