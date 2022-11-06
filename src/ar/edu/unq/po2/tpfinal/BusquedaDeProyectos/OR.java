package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import ar.edu.unq.po2.tpfinal.*;

public class OR extends CompuestoBinario{
	
	@Override
	public boolean seCumple(Proyecto proyecto) {
		
		return this.getCondicion1().seCumple(proyecto) || this.getCondicion2().seCumple(proyecto);
	}

//	@Override
//	public List<Proyecto> filtrarProyectos(List<Proyecto> proyectos) {
//		
//		List<Proyecto> filtrados1 = this.getCondicion1().filtrarProyectos(proyectos);
//		List<Proyecto> filtrados2 = this.getCondicion2().filtrarProyectos(proyectos);
//		List<Proyecto> filtradosOr = new ArrayList<Proyecto>(filtrados1); 
//		filtrados2.removeAll(filtrados1); 
//		filtradosOr.addAll(filtrados2); 
//		return filtradosOr;
//	}	
	
//	private List<CondicionDeBusqueda> condiciones;
//
//	public List<CondicionDeBusqueda> getCondiciones() {
//		return condiciones;
//	}
//
//	public void setCondiciones(List<CondicionDeBusqueda> condiciones) {
//		this.condiciones = condiciones;
//	}
//
//	@Override
//	public boolean seCumple(Proyecto proyecto) {
//		return this.getCondiciones().stream().anyMatch(condicion -> condicion.seCumple(proyecto));
//	}
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
