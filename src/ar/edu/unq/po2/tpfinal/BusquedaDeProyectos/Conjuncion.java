package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import ar.edu.unq.po2.tpfinal.*;

public class Conjuncion extends CompuestoBinario{
	
	@Override
	public boolean seCumple(Proyecto proyecto) {
		
		return this.getCondicion1().seCumple(proyecto) || this.getCondicion2().seCumple(proyecto);
	}
	

//	public List<CondicionDeBusqueda> getCondiciones() {
//		return condiciones;
//	}

//	public void setCondiciones(List<CondicionDeBusqueda> condiciones) {
//		this.condiciones = condiciones;
//	}
	
//	@Override
//	public boolean seCumple(Proyecto proyecto) {
//		return this.getCondiciones().stream().allMatch(condicion -> condicion.seCumple(proyecto));
//	}
//
//	@Override
//	public void agregarCondicion(CondicionDeBusqueda condicion) {
//		this.getCondiciones().add(condicion);
//	}
//
//	@Override
//	public void borrarCondicion(CondicionDeBusqueda condicion) {
//		this.getCondiciones().remove(condicion);
//	}

}