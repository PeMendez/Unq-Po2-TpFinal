package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.List;
import java.util.Set;

import ar.edu.unq.po2.tpfinal.*;

public class Negacion extends CondicionDeBusqueda{
	
	private CondicionDeBusqueda condicion;
	
	public Negacion(CondicionDeBusqueda condicion) {
		
		this.setCondicion(condicion);
	}

	public CondicionDeBusqueda getCondicion() {
		return condicion;
	}

	public void setCondicion(CondicionDeBusqueda condicion) {
		this.condicion = condicion;
	}

	@Override
	public boolean seCumple(Proyecto proyecto) {
		return !this.getCondicion().seCumple(proyecto);
	}

	@Override
	public List<Proyecto> filtrarProyectos(Set<Proyecto> proyDisponibles) {
		
		List<Proyecto> filtro = this.getCondicion().filtrarProyectos(proyDisponibles); 
		
		return proyDisponibles.stream().filter(p -> !filtro.contains(p)).toList();  
	}

}
