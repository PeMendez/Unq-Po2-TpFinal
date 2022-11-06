package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.List;

import ar.edu.unq.po2.tpfinal.*;

public class IncluyeCategorias extends CondicionDeBusqueda{
	
	private List<Categoria> categorias; 

	public IncluyeCategorias(List<Categoria> categorias) {
		
		this.setCategorias(categorias);
	}
		
	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}


	@Override
	public boolean seCumple(Proyecto proyecto) {
		
		return this.getCategorias().stream().anyMatch(categoria -> proyecto.getCategorias().contains(categoria));
	}

}
