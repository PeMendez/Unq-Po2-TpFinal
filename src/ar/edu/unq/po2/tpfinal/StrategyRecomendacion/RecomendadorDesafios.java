package ar.edu.unq.po2.tpfinal.StrategyRecomendacion;
import ar.edu.unq.po2.tpfinal.*;
import java.util.ArrayList;
import java.util.List;

public abstract class RecomendadorDesafios {

	public List<Desafio> desafiosARecomendar(Usuario usuario){
			
			List<Desafio> desafios = desafiosSegunUsuario(usuario); 
			
			
			desafios.removeAll(dasafiosYaTomados(usuario)); 
			
			return desafios;  
	}
	
	private List<Desafio> desafiosSegunUsuario(Usuario usuario){
		
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
		.sorted((desafio1, desafio2) -> this.coincidenciaCon(usuario, desafio1).compareTo(this.coincidenciaCon(usuario, desafio2)))
		.toList(); 
		
		return desafiosOrd; 
	}
	
	public Integer coincidenciaCon(Usuario usuario, Desafio desafio) {
		
		Integer difDificultad = Math.abs(desafio.getDificultad() - usuario.getPerfil().getDificultad()); 
		Integer difMuestras = Math.abs(desafio.getCantidadDeMuestras() - usuario.getPerfil().getCantMuestrasARecolectar()); 
		Integer difRecompensa = Math.abs(desafio.getRecompensa() - usuario.getPerfil().getRecompensasPreferidas()); 
		
		return difDificultad + difMuestras + difRecompensa;
	}

	
	public abstract List<Desafio> desafiosRecomendados(Usuario usuario);

	
//	public Integer calcularDiferenciaEntre(Integer x, Integer y) {
//		
//		return Math.abs(x-y); 
//	}
	
}
