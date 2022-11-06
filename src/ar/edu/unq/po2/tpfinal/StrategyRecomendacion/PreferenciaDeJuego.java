package ar.edu.unq.po2.tpfinal.StrategyRecomendacion;
import ar.edu.unq.po2.tpfinal.*;
import ar.edu.unq.po2.tpfinal.StateDesafios.DesafioUsuario;

import java.util.List;


public class PreferenciaDeJuego extends RecomendadorDesafios {


	@Override
	public List<Desafio> desafiosRecomendados(Usuario usuario) {
		
		List<Desafio> desafiosRecomendados = this.ordenarPorCoincidencia(this.desafiosARecomendar(usuario), usuario).subList(0, 4);
		
		this.agregarDesafiosRecomendados(usuario, desafiosRecomendados);
	
		return desafiosRecomendados;

	}

}