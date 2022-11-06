package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.List;

import ar.edu.unq.po2.tpfinal.*;

public abstract class CondicionDeBusqueda {
	
	public List<Proyecto> filtrarProyectos(AdministradorDeProyectos sistema) {
		
		return sistema.getProyDisponibles().stream().filter(proyecto -> this.seCumple(proyecto)).toList();
	}
	
	public abstract boolean seCumple(Proyecto proyecto);
	
//	public abstract void agregarCondicion(CondicionDeBusqueda condicion);
//	public abstract void borrarCondicion(CondicionDeBusqueda condicion);
}
