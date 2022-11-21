package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.edu.unq.po2.tpfinal.*;

public class OR extends CompuestoBinario{
	
	public OR(CondicionDeBusqueda condicion1, CondicionDeBusqueda condicion2) {
		
		this.setCondicion1(condicion1);
		this.setCondicion2(condicion2);
	}
	
	@Override
	public boolean seCumple(Proyecto proyecto) {
		
		return this.getCondicion1().seCumple(proyecto) || this.getCondicion2().seCumple(proyecto);
	}

	@Override
	public List<Proyecto> filtrarProyectos(Set<Proyecto> proyDisponibles) {
		
		List<Proyecto> filtro = this.getCondicion1().filtrarProyectos(proyDisponibles); 
		List<Proyecto> filtro2 = this.getCondicion2().filtrarProyectos(proyDisponibles); 
		
		Set<Proyecto> or = new HashSet<Proyecto>(filtro); 
		
		or.addAll(filtro2); 
		
		List<Proyecto> proyFiltrados = new ArrayList<Proyecto>(); 
		
		or.stream().forEach(p -> proyFiltrados.add(p));
		
		return proyFiltrados;
	}

}
