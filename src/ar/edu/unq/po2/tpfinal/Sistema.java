package ar.edu.unq.po2.tpfinal;

import java.util.HashSet;
import java.util.Set;

public class Sistema{

	private Set<Proyecto> proyDisponibles;
	private Set<Usuario> usuarios; 
	private Set<Categoria> categoriasDisponibles; 
	
	public Sistema() {
		
		this.proyDisponibles = new HashSet<Proyecto>(); 
		this.usuarios = new HashSet<Usuario>(); 
		this.categoriasDisponibles = new HashSet<Categoria>(); 
	}
	
	public void addProyecto(Proyecto proyecto) {
		
		this.getProyDisponibles().add(proyecto);
	}

	public void addUsuario(Usuario usuario) {
		
		this.getUsuarios().add(usuario); 
	}
	
	public void addCategoria(Categoria cat) {
		
		this.getCategoriasDisponibles().add(cat); 
	}
	
	public void removeProyecto(Proyecto proyecto) {
		
		this.getProyDisponibles().remove(proyecto); 
	}
	
	public void removeUsuario(Usuario usuario) {
		
		this.getUsuarios().remove(usuario); 
	}
	
	public void removeCategoria(Categoria cat) {
		
		this.getCategoriasDisponibles().remove(cat); 
	}
	
	public Set<Proyecto> getProyDisponibles() {
		return proyDisponibles;
	}

	public void setProyDisponibles(Set<Proyecto> proyDisponibles) {
		this.proyDisponibles = proyDisponibles;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Set<Categoria> getCategoriasDisponibles() {
		return categoriasDisponibles;
	}

	public void setCategoriasDisponibles(Set<Categoria> categoriasDisponibles) {
		this.categoriasDisponibles = categoriasDisponibles;
	}
	
}
