package ar.edu.unq.po2.tpfinal.StrategyRecomendacion;
import ar.edu.unq.po2.tpfinal.*;

import java.util.List;


public class PreferenciaDeJuego extends RecomendadorDesafios {


	@Override
	public List<Desafio> desafiosRecomendados(Usuario usuario) {
	
		return this.ordenarPorCoincidencia(this.desafiosARecomendar(usuario), usuario).subList(0, 4);

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Override
//	public List<Desafio> desafiosRecomendados(Usuario usuario) {
//		
//		List<Desafio> desafios = new ArrayList<Desafio>(); 
//		
//		usuario
//    	.getProyectos()
//		.stream()
//		.forEach(proyecto -> desafios.addAll(proyecto.getDesafios()));
//		
//		desafios.removeAll(dasafiosYaTomados(usuario)); 
//		
//		desafios
//		.stream()
//		.sorted((desafio1, desafio2) -> this.coincidenciaCon(usuario, desafio1).compareTo(this.coincidenciaCon(usuario, desafio2)))
//		.toList(); 
//		
//		return  desafios.subList(0, 4);
//	}
//
//	private List<Desafio> dasafiosYaTomados(Usuario usuario) {
//		
//		return usuario.getDesafiosUsuario().stream().map(desafioUsuario -> desafioUsuario.getDesafio()).toList();
//	}	



}
