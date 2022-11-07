package ar.edu.unq.po2.tpfinal.StrategyRecomendacion;
import ar.edu.unq.po2.tpfinal.*;
import java.util.List;

public class Favorito extends RecomendadorDesafios {
	
	@Override
	public List<Desafio> desafiosRecomendados(Usuario usuario) {
		
		List<Desafio> desafiosRecomendados = 
			this.ordenarPorSimilitud(
				this.los20ConMayorCoincidencia(usuario), this.desafioFavoritoDe(usuario)).stream().limit(5).toList(); 
		
		this.agregarDesafiosRecomendados(usuario, desafiosRecomendados);
		
		return desafiosRecomendados;
	}
	
	public List<Desafio> ordenarPorSimilitud(List<Desafio> desafios, Desafio desafioFavorito) {
		List<Desafio> ordenar =
		desafios
		.stream()
		.sorted((desafio1, desafio2) -> this.similitudCon(desafio1, desafioFavorito).compareTo(this.similitudCon(desafio2, desafioFavorito))).toList(); 
		
		return ordenar; 
		
	}
	
	private Integer similitudCon(Desafio desafio, Desafio desafioFavorito) {
		
		Integer difDificultad = Math.abs(desafio.getDificultad() - desafioFavorito.getDificultad()); 
		Integer difMuestras = Math.abs(desafio.getCantidadDeMuestras() - desafioFavorito.getCantidadDeMuestras()); 
		Integer difRecompensa = Math.abs(desafio.getRecompensa() - desafioFavorito.getRecompensa()); 
		
		return (difDificultad + difMuestras + difRecompensa) / 3;
	}

	private List<Desafio> los20ConMayorCoincidencia(Usuario usuario) {
		
		return this.ordenarPorCoincidencia(this.desafiosARecomendar(usuario), usuario).stream().limit(20).toList(); 
	}

	public Desafio desafioFavoritoDe(Usuario usuario) {
		
		return usuario.getDesafiosUsuario()
				.stream()
				.max((d1, d2) -> (d1.getValoracion()).compareTo(d2.getValoracion()))
				.get()
				.getDesafio(); 
	}
}
