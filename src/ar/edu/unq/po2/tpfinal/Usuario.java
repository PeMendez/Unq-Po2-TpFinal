package ar.edu.unq.po2.tpfinal;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.*;
import ar.edu.unq.po2.tpfinal.StateDesafios.*;

public class Usuario {

	private List<Muestra> muestras; 
	private Perfil perfil; 
	private List<DesafioUsuario> desafiosUsuarios; 
	
	public Usuario(Perfil perfil) {
		
		this.setPerfil(perfil);
		this.setMuestras(new ArrayList<Muestra>()); 
		this.desafiosUsuarios =  new ArrayList<DesafioUsuario>();
	}
	
	public void suscribirse(Proyecto proyecto) {
 
		proyecto.addParticipante(this);
	}
	
	public void desuscribirse(Proyecto proyecto) {
		
		proyecto.desuscribirParticipante(this); 
	}
	
	public void aceptarDesafio(DesafioUsuario desafio) throws Exception {
		
		desafio.serAceptado(); 
	}
	
	public void rechazarDesafio(DesafioUsuario desafio) {
	
		this.getDesafiosUsuario().remove(desafio); 
	}
	
	public List<Desafio> desafiosRecomendados(Sistema sistema){
		
		return this.getPerfil().getTipoDeRecomendacion().desafiosRecomendados(this, sistema); 
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

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
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
	
	public List<Proyecto> buscarProyectosPor(CondicionDeBusqueda condicion, Sistema sistema) {
		
		return condicion.filtrarProyectos(sistema.getProyDisponibles()); 
	}

	private int promedioDeCompletitudPorDesafio() {
		
		return this.getDesafiosUsuario().stream().mapToInt(d -> d.porcentajeDeCompletitud()).sum();
	}
	
	public Integer promedioDeCompletitudGeneral() {
		
		return this.promedioDeCompletitudPorDesafio() / this.getDesafiosUsuario().size();
	}
}
