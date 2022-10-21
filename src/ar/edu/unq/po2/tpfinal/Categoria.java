package ar.edu.unq.po2.tpfinal;

public class Categoria {

	private String nombre; 
	
	public Categoria(String nombre) {
		this.setNombre(nombre); 
	}

	public String getNombre() {
		return this.nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
