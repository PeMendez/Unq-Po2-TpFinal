package ar.edu.unq.po2.tpfinal;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.TipoDeBusqueda;
import ar.edu.unq.po2.tpfinal.StateDesafios.DesafioUsuario;

//import ar.edu.unq.po2.tpfinal.StateDesafios.*;


public class Usuario {

	private List<Muestra> muestras; 
	private List<Proyecto> proyectos; 
	private Perfil perfil; 
	private List<DesafioUsuario> desafiosUsuarios;
	private TipoDeBusqueda modoDeBuscar;
	
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
	
	public void desuscribirse(Proyecto proyecto) {
		
		this.getProyectos().remove(proyecto); 
		proyecto.desuscribirParticipante(this); 
	}
	
	public void aceptarDesafio(DesafioUsuario desafio) {
		
		desafio.serAceptado(); 
	}
	
	public void rechazarDesafio(DesafioUsuario desafio) {
	
		this.getDesafiosUsuario().remove(desafio); 
	}
	
	public List<Desafio> desafiosRecomendados(){
		
		List<Desafio> desafiosRecomendados = this.getPerfil().getTipoDeRecomendacion().desafiosRecomendados(this); 
//		desafiosRecomendados.stream().forEach(desafio -> this.getDesafiosUsuario().add(new DesafioUsuario(this, desafio)));
		
		return desafiosRecomendados; 
	}

	public void valorarDesafio(DesafioUsuario desafio, Integer valoracion) {
	
		desafio.setValoracion(valoracion);
	}
	
	public void enviarMuestra(Muestra muestra, Proyecto proyecto) {
		
		proyecto.addMuestra(muestra);
	}
	
	public void recolectarMuestra(Muestra muestra) {
		
		this.getMuestras().add(muestra); 
	}
	
	public Perfil getPerfil() {
		return perfil;
	}

	private void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	public List<Proyecto> getProyectos() {
		return this.proyectos;
	}

	private void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

	public List<Muestra> getMuestras() {
		return muestras;
	}

	private void setMuestras(List<Muestra> muestras) {
		this.muestras = muestras;
	}

	public List<DesafioUsuario> getDesafiosUsuario() {
		return this.desafiosUsuarios;
	}

	private void setDesafiosUsuario(List<DesafioUsuario> desafiosUsuario) {
		this.desafiosUsuarios = desafiosUsuario;
	}
	
	public List<Proyecto> buscarProyectosPor(String catOTit) {
		
		return modoDeBuscar.buscarEnProyectos(catOTit);
	}
}
