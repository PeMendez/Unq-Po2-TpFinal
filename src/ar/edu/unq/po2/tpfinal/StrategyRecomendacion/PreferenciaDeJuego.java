package ar.edu.unq.po2.tpfinal.StrategyRecomendacion;
import ar.edu.unq.po2.tpfinal.*;

import java.util.List;


public class PreferenciaDeJuego extends RecomendadorDesafios {


	@Override
	public List<Desafio> desafiosRecomendados(Usuario usuario) {
	
		return this.ordenarPorCoincidencia(this.desafiosARecomendar(usuario), usuario).subList(0, 4);

	}


}