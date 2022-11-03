package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.List;

import ar.edu.unq.po2.tpfinal.Proyecto;


public abstract class TipoDeBusqueda {
	
	public abstract List<Proyecto> buscarEnProyectos(String loQueBusco);
	public abstract void agregarTipoDeBusqueda(TipoDeBusqueda nuevoTipo);
	public abstract void borrarTipoDeBusqueda(TipoDeBusqueda nuevoTipo);

}
