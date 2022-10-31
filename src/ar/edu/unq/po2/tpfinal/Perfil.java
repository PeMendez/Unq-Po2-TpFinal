package ar.edu.unq.po2.tpfinal;

import ar.edu.unq.po2.tpfinal.StrategyRecomendacion.RecomendadorDesafios;

public class Perfil {
	
	private int cantMuestrasARecolectar; 
	private int dificultad; 
	private int recompensasPreferidas;
	private RecomendadorDesafios tipoDeRecomendacion;
	
	public Perfil(int cantMuestrasARecolectar, int dificultad, int recompensasPreferidas, RecomendadorDesafios tipoDeRecomendacion) {
		
		this.setCantMuestrasARecolectar(cantMuestrasARecolectar);
		this.setDificultad(dificultad);
		this.setRecompensasPreferidas(recompensasPreferidas);
		this.setTipoDeRecomendacion(tipoDeRecomendacion);
	}
	
	public int getCantMuestrasARecolectar() {
		return cantMuestrasARecolectar;
	}
	public void setCantMuestrasARecolectar(int cantMuestrasARecolectar) {
		this.cantMuestrasARecolectar = cantMuestrasARecolectar;
	}
	public int getDificultad() {
		return dificultad;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	public int getRecompensasPreferidas() {
		return recompensasPreferidas;
	}
	public void setRecompensasPreferidas(int recompensasPreferidas) {
		this.recompensasPreferidas = recompensasPreferidas;
	}
	public RecomendadorDesafios getTipoDeRecomendacion() {
		return tipoDeRecomendacion;
	}
	public void setTipoDeRecomendacion(RecomendadorDesafios tipoDeRecomendacion) {
		this.tipoDeRecomendacion = tipoDeRecomendacion;
	} 

}
