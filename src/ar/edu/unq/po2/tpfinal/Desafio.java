package ar.edu.unq.po2.tpfinal;

import ar.edu.unq.po2.tpfinal.RestriccionTemporal.RestriccionTemporal;

public class Desafio {
		
	private RestriccionGeografica area; 
	private RestriccionTemporal restriccion; 
	private int cantidadDeMuestras; 
	private int dificultad; 
	private int recompensa; 
	
	public Desafio(RestriccionGeografica area, RestriccionTemporal restriccion, int cant, int dif, int recompensa) {
		
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

	public RestriccionTemporal getRestriccion() {
		return restriccion;
	}
	public void setRestriccion(RestriccionTemporal restriccion) {
		this.restriccion = restriccion;
	}
	
	public boolean esMuestraValida(Muestra muestra) {
		
		return muestra.esMuestraValida(this.getArea()) && muestra.esMuestraValida(this.getRestriccion());
	
//		return this.getArea().seCumple(muestra.getCoordenada()) && this.getRestriccion().estaHabilitado(muestra.getFecha());
	}
	
	
}
