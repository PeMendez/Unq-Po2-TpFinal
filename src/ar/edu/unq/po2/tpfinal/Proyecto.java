package ar.edu.unq.po2.tpfinal;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {

	private String nombre; 
	private String descripcion; 
	private List<Categoria> categorias;
	private List<Usuario> participantes; 
	private List<Muestra> muestrasRecolectadas; 
	private List<Desafio> desafios; 
	
	public Proyecto(String nombre, String descripcion, List<Categoria> categorias) {
		
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		this.setCategorias(categorias);
		this.participantes = new ArrayList<Usuario>(); 
		this.muestrasRecolectadas = new ArrayList<Muestra>(); 
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre; 
	}
	
	public void setDescripcion(String descripcion) {
		
		this.descripcion = descripcion; 
	}
	
	public void setCategorias(List<Categoria> categorias) {
		
		this.categorias = categorias; 
	}
	
	public List<Muestra> getMuestrasRecolectadas() {
		
		return this.muestrasRecolectadas;
	}
	
	public List<Usuario> getParticipantes() {
		
		return this.participantes;
	}
	
	public void addMuestra(Muestra muestra) {
		
		this.getMuestrasRecolectadas().add(muestra);
	}
	
	public void addParticipante(Usuario participante) {
		
		this.getParticipantes().add(participante); 
	}

	public void removeParticipante(Usuario participante) {
		
		this.getParticipantes().remove(participante);
	}
	
	public List<Desafio> getDesafios() {
		return this.desafios;
	}

	public void setProyectos(List<Desafio> desafios) {
		this.desafios = desafios;
	}

	public String getNombre() {
		return this.nombre;
	}

	public List<Categoria> getCategorias() {
		return this.categorias;
	}

	public void desuscribirParticipante(Usuario usuario) {
		
		this.getParticipantes().remove(usuario); 
	}

}
