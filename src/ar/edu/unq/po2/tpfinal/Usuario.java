package ar.edu.unq.po2.tpfinal;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tpfinal.StateDesafios.DesafioUsuario;

//import ar.edu.unq.po2.tpfinal.StateDesafios.DesafioUsuario;


public class Usuario {

	private List<Muestra> muestras; 
	private List<Proyecto> proyectos; 
	private Perfil perfil; 
	private List<DesafioUsuario> desafiosUsuarios; 
	
	public Usuario(Perfil perfil) {
		
		this.setPerfil(perfil);
		this.setMuestras(new ArrayList<Muestra>()); 
		this.proyectos = new ArrayList<Proyecto>();
		this.desafiosUsuarios =  new ArrayList<DesafioUsuario>();
	}
	
	public void suscribirse(Proyecto proyecto) {
		
		this.proyectos.add(proyecto); 
		proyecto.addParticipante(this);
	}
	
	public void aceptarDesafio(DesafioUsuario desafio) {
		
		desafio.serAceptado(); 
	}
	
	public List<Desafio> desafiosRecomendados(){
		
		List<Desafio> desafiosRecomendados = this.getPerfil().getTipoDeRecomendacion().desafiosRecomendados(this); 
		desafiosRecomendados.stream().forEach(desafio -> this.getDesafiosUsuario().add(new DesafioUsuario(this, desafio)));
		
		return desafiosRecomendados; 
	}

	public void valorarDesafio(DesafioUsuario desafio, Integer valoracion) {
	
		desafio.setValoracion(valoracion);
	}
	
	public Desafio desafioFavorito() {
		
		return this.getDesafiosUsuario()
				.stream()
				.max((d1, d2) -> (d1.getValoracion()).compareTo(d2.getValoracion()))
				.get()
				.getDesafio(); 
	}
	
	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	public List<Proyecto> getProyectos() {
		return this.proyectos;
	}

	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public List<Muestra> getMuestras() {
		return muestras;
	}

	public void setMuestras(List<Muestra> muestras) {
		this.muestras = muestras;
	}

	public List<DesafioUsuario> getDesafiosUsuario() {
		return this.desafiosUsuarios;
	}

	public void setDesafiosUsuario(List<DesafioUsuario> desafiosUsuario) {
		this.desafiosUsuarios = desafiosUsuario;
	}
}
