package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.List;

import ar.edu.unq.po2.tpfinal.*;

public class IncluyeCategorias extends CondicionDeBusqueda{
	
	private List<Categoria> categorias; 
	private List<Proyecto> proyectos;

	public IncluyeCategorias(AdministradorDeProyectos proyectos, List<Categoria> categorias) {
		
		this.setProyectos(proyectos.getProyDisponibles());
		this.setCategorias(categorias);
	}
		
	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public List<Proyecto> getProyectos() {
	
		return proyectos;
	}
	
	public void setProyectos(List<Proyecto> proyectos) {
		
		this.proyectos = proyectos;
	}

	@Override
	public boolean seCumple(Proyecto proyecto) {
		
		return this.getCategorias().stream().allMatch(categoria -> proyecto.getCategorias().contains(categoria));
	}

}
