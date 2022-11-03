package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.List;

import ar.edu.unq.po2.tpfinal.*;

public class IncluyeCategoriasB extends CondicionDeBusqueda{
	
	private List<Categoria> categorias;

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	@Override
	public boolean seCumple(Proyecto proyecto) {
		return this.getCategorias().stream().allMatch(categoria -> proyecto.getCategorias().contains(categoria));
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
