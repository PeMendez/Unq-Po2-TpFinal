package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import ar.edu.unq.po2.tpfinal.*;

public class Negacion extends CondicionDeBusqueda{
	
	private CondicionDeBusqueda condicion;
	
	public Negacion(CondicionDeBusqueda condicion) {
		
		this.setCondicion(condicion);
	}

	public CondicionDeBusqueda getCondicion() {
		return this.condicion;
	}

	public void setCondicion(CondicionDeBusqueda condicion) {
		this.condicion = condicion;
	}
	@Override
	public List<Proyecto> filtrarProyectos(Set<Proyecto> proyDisponibles) {
		
		List<Proyecto> filtro = this.getCondicion().filtrarProyectos(proyDisponibles); 
		
		proyDisponibles.removeAll(filtro); 
		
		List<Proyecto> filtroNOT = new ArrayList<>(); 
				proyDisponibles.stream().forEach(p -> filtroNOT.add(p));

		
		return filtroNOT;  
	}

}
