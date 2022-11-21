package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ar.edu.unq.po2.tpfinal.*;

public class AND extends CompuestoBinario{
	
	public AND(CondicionDeBusqueda condicion1, CondicionDeBusqueda condicion2) {
		
		this.setCondicion1(condicion1);
		this.setCondicion2(condicion2);
	}

	@Override
	public List<Proyecto> filtrarProyectos(Set<Proyecto> proyDisponibles) {
		
		List<Proyecto> filtro = this.getCondicion1().filtrarProyectos(proyDisponibles); 
		
		Set<Proyecto> filtrado = new HashSet<>(); 
				filtro.stream().forEach(p -> filtrado.add(p));
		
		List<Proyecto> filtro2 = this.getCondicion2().filtrarProyectos(filtrado);  
		
		return filtro2;
	}

}
