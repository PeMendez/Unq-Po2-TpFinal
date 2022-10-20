package ar.edu.unq.po2.tpfinal;

import java.time.LocalDate;
import java.time.LocalTime;

public class Muestra {

	private Coordenada coordenada; 
	private Usuario usuario; 
	private LocalDate fecha; 
	private LocalTime hora;
	
	public Muestra(Coordenada coordenada, Usuario usuario, LocalDate fecha,LocalTime hora) {
		this.setCoordenada(coordenada);
		this.setUsuario(usuario);
		this.setFecha(fecha);
		this.setHora(hora);
	}

	//borrar si no lo terminamos usando
	private Coordenada getCoordenada() {
		return this.coordenada;
	}

	private void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	//borrar si no lo terminamos usando
	private Usuario getUsuario() {
		return this.usuario;
	}

	private void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	//borrar si no lo terminamos usando
	private LocalDate getFecha() {
		return this.fecha;
	}

	private void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	//borrar si no lo terminamos usando
	private LocalTime getHora() {
		return this.hora;
	}

	private void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
}
