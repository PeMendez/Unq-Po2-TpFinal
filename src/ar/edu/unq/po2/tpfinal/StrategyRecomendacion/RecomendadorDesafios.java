package ar.edu.unq.po2.tpfinal.StrategyRecomendacion;
import ar.edu.unq.po2.tpfinal.*;
import ar.edu.unq.po2.tpfinal.StateDesafios.DesafioUsuario;

import java.util.ArrayList;
import java.util.List;

public abstract class RecomendadorDesafios {

	public List<Desafio> desafiosARecomendar(Usuario usuario){
			
			List<Desafio> desafios = desafiosSegunUsuario(usuario); 
			
			
			desafios.removeAll(dasafiosYaTomados(usuario)); 
			
			return desafios;  
	}
	
	public List<Desafio> desafiosSegunUsuario(Usuario usuario){
		
		List<Desafio> desafios = new ArrayList<Desafio>();
		
		usuario
		    .getProyectos()
			.stream()
			.forEach(proyecto -> desafios.addAll(proyecto.getDesafios()));
		
		return desafios; 
	}

	private List<Desafio> dasafiosYaTomados(Usuario usuario) {
			
			return usuario.getDesafiosUsuario().stream().map(desafioUsuario -> desafioUsuario.getDesafio()).toList();
	}
	
	public List<Desafio> ordenarPorCoincidencia(List<Desafio> desafios, Usuario usuario){
		
		List<Desafio> desafiosOrd = 
		desafios
		.stream()
		.sorted((desafio1, desafio2) -> this.coincidenciaCon(usuario.getPerfil(), desafio1).compareTo(this.coincidenciaCon(usuario.getPerfil(), desafio2)))
		.toList(); 
		
		return desafiosOrd; 
	}
	
	public Integer coincidenciaCon(Perfil perfilUsuario, Desafio desafio) {
		
		Integer difDificultad = Math.abs(desafio.getDificultad() - perfilUsuario.getDificultad()); 
		Integer difMuestras = Math.abs(desafio.getCantidadDeMuestras() - perfilUsuario.getCantMuestrasARecolectar()); 
		Integer difRecompensa = Math.abs(desafio.getRecompensa() - perfilUsuario.getRecompensasPreferidas()); 
		
		return difDificultad + difMuestras + difRecompensa;
	}


	public void agregarDesafiosRecomendados(Usuario usuario, List<Desafio> desafiosRecomendados) {
		
		desafiosRecomendados.stream().forEach(desafio -> usuario.getDesafiosUsuario().add(new DesafioUsuario(usuario, desafio)));
	}
	
	public abstract List<Desafio> desafiosRecomendados(Usuario usuario);
	
}