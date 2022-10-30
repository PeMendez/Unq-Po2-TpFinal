package ar.edu.unq.po2.tpfinal;

import ar.edu.unq.po2.tpfinal.StrategyRecomendacion.RecomendadorDesafios;

public class Perfil {
	
	private int cantidadDeMuestras; 
	private int dificultad; 
	private int recompensa;
	private RecomendadorDesafios tipoDeRecomendacion;
	
	public Perfil(int cantidadDeMuestras, int dificultad, int recompensa, RecomendadorDesafios tipoDeRecomendacion) {
		
		this.setCantidadDeMuestras(cantidadDeMuestras);
		this.setDificultad(dificultad);
		this.setRecompensa(recompensa);
		this.setTipoDeRecomendacion(tipoDeRecomendacion);
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
	public RecomendadorDesafios getTipoDeRecomendacion() {
		return tipoDeRecomendacion;
	}
	public void setTipoDeRecomendacion(RecomendadorDesafios tipoDeRecomendacion) {
		this.tipoDeRecomendacion = tipoDeRecomendacion;
	} 

}
