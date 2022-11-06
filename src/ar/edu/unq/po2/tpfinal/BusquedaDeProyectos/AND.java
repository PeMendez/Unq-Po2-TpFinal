package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

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
//
//	@Override
//	public List<Proyecto> filtrarProyectos(List<Proyecto> proyectos) {
//		
//		List<Proyecto> filtro = this.getCondicion1().filtrarProyectos(proyectos); 
//		List<Proyecto> filtro2 = this.getCondicion2().filtrarProyectos(filtro); 
//		
//		return filtro2;
//	}
	

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
