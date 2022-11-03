package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.List;

import ar.edu.unq.po2.tpfinal.Proyecto;

public class BuscadorNot extends TipoDeBusqueda{

	private List<TipoDeBusqueda> busquedasNot;
	@Override
	public List<Proyecto> buscarEnProyectos(String loQueBusco) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregarTipoDeBusqueda(TipoDeBusqueda nuevoTipo) {
		this.getBusquedasNot().add(nuevoTipo);
	}

	@Override
	public void borrarTipoDeBusqueda(TipoDeBusqueda nuevoTipo) {
		this.getBusquedasNot().remove(nuevoTipo);
	}

	public List<TipoDeBusqueda> getBusquedasNot() {
		return busquedasNot;
	}

	public void setBusquedasNot(List<TipoDeBusqueda> busquedasNot) {
		this.busquedasNot = busquedasNot;
	}

	
}
