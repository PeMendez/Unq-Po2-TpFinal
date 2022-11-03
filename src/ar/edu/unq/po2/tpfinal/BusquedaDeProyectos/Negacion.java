package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import ar.edu.unq.po2.tpfinal.*;

public class Negacion extends CondicionDeBusqueda{
	
	private CondicionDeBusqueda condicion;

	public CondicionDeBusqueda getCondicion() {
		return condicion;
	}

	public void setCondicion(CondicionDeBusqueda condicion) {
		this.condicion = condicion;
	}

	@Override
	public boolean seCumple(Proyecto proyecto) {
		return !this.getCondicion().seCumple(proyecto);
	}

//	@Override
//	public void agregarCondicion(CondicionDeBusqueda condicion) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void borrarCondicion(CondicionDeBusqueda condicion) {
//		// TODO Auto-generated method stub
//		
//	}
}
