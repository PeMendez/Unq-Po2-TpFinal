package ar.edu.unq.po2.tpfinal;

import ar.edu.unq.po2.tpfinal.RestriccionTemporal.Restriccion;

public class Desafio implements ElementoDeLudificacion{
		
	private RestriccionGeografica area; 
	private Restriccion restriccion; 
	private int cantidadDeMuestras; 
	private int dificultad; 
	private int recompensa; 
	
	public Desafio(RestriccionGeografica area, Restriccion restriccion, int cant, int dif, int recompensa) {
		
		this.setArea(area);
		this.setRestriccion(restriccion);
		this.setCantidadDeMuestras(cant);
		this.setDificultad(dif);
		this.setRecompensa(recompensa);
		
	}
	
	public RestriccionGeografica getArea() {
		return area;
	}
	public void setArea(RestriccionGeografica area) {
		this.area = area;
	}
	public int getCantidadDeMuestras() {
		return cantidadDeMuestras;
	}
	public void setCantidadDeMuestras(int cantidadDeMuestras) {
		this.cantidadDeMuestras = cantidadDeMuestras;
	}
	public int getDificultad() {
		return dificultad;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	public int getRecompensa() {
		return recompensa;
	}
	public void setRecompensa(int recompensa) {
		this.recompensa = recompensa;
	}

	public Restriccion getRestriccion() {
		return restriccion;
	}
	public void setRestriccion(Restriccion restriccion) {
		this.restriccion = restriccion;
	}
	
	public boolean esMuestraValida(Muestra muestra) {
	
		return this.getArea().contiene(muestra.getCoordenada()) && this.getRestriccion().estaHabilitado(muestra.getFecha());
	}
	
	
}
