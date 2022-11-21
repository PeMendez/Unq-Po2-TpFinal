package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.List;
import java.util.Set;

import ar.edu.unq.po2.tpfinal.*;

public class AND extends CompuestoBinario{
	
	public AND(CondicionDeBusqueda condicion1, CondicionDeBusqueda condicion2) {
		
		this.setCondicion1(condicion1);
		this.setCondicion2(condicion2);
	}

	@Override
	public boolean seCumple(Proyecto proyecto) {
		
		return this.getCondicion1().seCumple(proyecto) && this.getCondicion2().seCumple(proyecto);
	}

	@Override
	public List<Proyecto> filtrarProyectos(Set<Proyecto> proyDisponibles) {
		
		List<Proyecto> filtro = this.getCondicion1().filtrarProyectos(proyDisponibles); 
		List<Proyecto> filtro2 = this.getCondicion2().filtrarProyectos(proyDisponibles); 
		
		filtro.stream().filter(p -> filtro2.contains(p)); 
		
		return filtro;
	}

}
