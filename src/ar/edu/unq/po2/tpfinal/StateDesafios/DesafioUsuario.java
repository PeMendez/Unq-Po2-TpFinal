package ar.edu.unq.po2.tpfinal.StateDesafios;

import java.time.LocalDate;

import ar.edu.unq.po2.tpfinal.Desafio;
import ar.edu.unq.po2.tpfinal.Usuario;


public class DesafioUsuario {

	private Usuario usuario; 
	private Desafio desafio; 
	private EstadoDesafio estado; 
	private Integer valoracion; 
	private LocalDate fechaInicio; 
	private LocalDate fechaCompletado; 
	
	public DesafioUsuario(Usuario usuario, Desafio desafio) {
		
		this.setUsuario(usuario); 
		this.setDesafio(desafio);
		this.setEstado(new EstadoPendiente());

	}
	
	public int cantidadDeMuestrasValidas() {
		
		return this.getUsuario()
					.getMuestras()
					.stream().filter(muestra -> this.getDesafio().esMuestraValida(muestra))
					.toList()
					.size(); 
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Desafio getDesafio() {
		return desafio;
	}

	public void setDesafio(Desafio desafio) {
		this.desafio = desafio;
	}

	public EstadoDesafio getEstado() {
		return estado;
	}

	public void setEstado(EstadoDesafio estado) {
		this.estado = estado;
	}

	public Integer getValoracion() {
		return valoracion;
	}

	public void setValoracion(Integer valoracion) {
		this.valoracion = valoracion;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void serAceptado() throws Exception {
		
		this.getEstado().serAceptado(this); 
		
	}

	public LocalDate getFechaCompletado() {
		return fechaCompletado;
	}

	public void setFechaCompletado(LocalDate fechaCompletado) {
		this.fechaCompletado = fechaCompletado;
	}

	public int porcentajeDeCompletitud() {
		
		return this.getEstado().porcentajeDeCompletitud(this);
	}
	
	public boolean estaCompleto() {
		
		return this.getEstado().estaCompleto(this); 
	}
	
}
