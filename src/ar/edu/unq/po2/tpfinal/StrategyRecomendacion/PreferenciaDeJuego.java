package ar.edu.unq.po2.tpfinal.StrategyRecomendacion;
import ar.edu.unq.po2.tpfinal.*;

import java.util.List;


public class PreferenciaDeJuego extends RecomendadorDesafios {


	@Override
	public List<Desafio> desafiosRecomendados(Usuario usuario, Sistema sistema) {
		
		List<Desafio> desafiosRecomendados = 
				this.ordenarPorCoincidencia(this.desafiosARecomendar(usuario, sistema), usuario).stream().limit(5).toList();
		
		this.agregarDesafiosRecomendados(usuario, desafiosRecomendados);
	
		return desafiosRecomendados;

	}

}