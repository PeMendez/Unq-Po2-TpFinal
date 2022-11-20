package ar.edu.unq.po2.tpfinal;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.CondicionDeBusqueda;

public class Sistema{

	private List<Proyecto> proyDisponibles;
	
	public Sistema() {
		
		this.proyDisponibles = new ArrayList<Proyecto>(); 
	}
	
	public void addProyecto(Proyecto proyecto) {
		
		this.getProyDisponibles().add(proyecto);
	}

	public List<Proyecto> getProyDisponibles() {
		return proyDisponibles;
	}

	public void setProyDisponibles(List<Proyecto> proyDisponibles) {
		this.proyDisponibles = proyDisponibles;
	}
	
	public List<Proyecto> filtrarProyectos(CondicionDeBusqueda condicion) {
		
		return this.getProyDisponibles().stream().filter(proyecto -> condicion.seCumple(proyecto)).toList();
	}
	
}
