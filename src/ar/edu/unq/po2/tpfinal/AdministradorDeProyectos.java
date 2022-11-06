package ar.edu.unq.po2.tpfinal;

import java.util.ArrayList;
import java.util.List;

public class AdministradorDeProyectos {

	private List<Proyecto> proyDisponibles;
	
	public AdministradorDeProyectos() {
		
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
	
}
