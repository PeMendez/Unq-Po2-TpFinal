package ar.edu.unq.po2.tpfinal;

import ar.edu.unq.po2.tpfinal.RestriccionTemporal.TipoDeRestriccion;

public class Desafio implements ElementoDeLudificacion{
		
	private RestriccionGeografica area; 
	private TipoDeRestriccion restriccion; 
	private int cantidadDeMuestras; 
	private int dificultad; 
	private int recompensa; 
	
	public Desafio(RestriccionGeografica area, TipoDeRestriccion restriccion, int cant, int dif, int recompensa) {
		
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
//	public Integer coincidenciaCon(Usuario usuario) {
//	// esto no debería estar aca, pero por ahora sirve. 
//		
//		Integer difDificultad = Math.abs(this.getDificultad() - usuario.getPerfil().getDificultad()); 
//		Integer difMuestras = Math.abs(this.getCantidadDeMuestras() - usuario.getPerfil().getCantMuestrasARecolectar()); 
//		Integer difRecompensa = Math.abs(this.getRecompensa() - usuario.getPerfil().getRecompensasPreferidas()); 
//		
//		return difDificultad + difMuestras + difRecompensa;
//	}
	public TipoDeRestriccion getRestriccion() {
		return restriccion;
	}
	public void setRestriccion(TipoDeRestriccion restriccion) {
		this.restriccion = restriccion;
	}
	
	public boolean esMuestraValida(Muestra muestra) {
	
		return this.getArea().contiene(muestra.getCoordenada()) && this.getRestriccion().estaHabilitado(muestra.getFecha());
	}
	
	
}
