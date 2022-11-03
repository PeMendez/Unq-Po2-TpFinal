package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.List;


import ar.edu.unq.po2.tpfinal.Proyecto;

public class BuscadorAndOr extends TipoDeBusqueda{

	private List<TipoDeBusqueda> busquedasAndOr;
	
	@Override
	public List<Proyecto> buscarEnProyectos(String loQueBusco) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregarTipoDeBusqueda(TipoDeBusqueda nuevoTipo) {
		this.getBusquedasAndOr().add(nuevoTipo);
	}

	@Override
	public void borrarTipoDeBusqueda(TipoDeBusqueda nuevoTipo) {
		this.getBusquedasAndOr().remove(nuevoTipo);
	}

	public List<TipoDeBusqueda> getBusquedasAndOr() {
		return busquedasAndOr;
	}

	public void setBusquedasAndOr(List<TipoDeBusqueda> busquedasAndOr) {
		this.busquedasAndOr = busquedasAndOr;
	}

	
}
