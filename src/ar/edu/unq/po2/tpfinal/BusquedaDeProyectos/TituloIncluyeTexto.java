package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.List;

import ar.edu.unq.po2.tpfinal.AdministradorDeProyectos;
import ar.edu.unq.po2.tpfinal.Proyecto;

public class TituloIncluyeTexto extends TipoDeBusqueda {

	@Override
	public List<Proyecto> buscarEnProyectos(String loQueBusco) {
		AdministradorDeProyectos admP = null;
		List<Proyecto> proyectos = 
				admP.getProyDisponibles().stream()
				.filter(tituloProyect -> tituloProyect.getNombre().contains(loQueBusco))
				.toList();
		
		return proyectos;
	}

	@Override
	public void agregarTipoDeBusqueda(TipoDeBusqueda nuevoTipo) {}

	@Override
	public void borrarTipoDeBusqueda(TipoDeBusqueda nuevoTipo) {} 

}
