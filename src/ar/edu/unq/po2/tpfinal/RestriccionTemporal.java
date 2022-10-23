package ar.edu.unq.po2.tpfinal;

import java.time.LocalDate;

public class RestriccionTemporal {

	private String tipo = null;
	private LocalDate inicio = null;
	private LocalDate fin = null;

	public RestriccionTemporal(String tipo) {
		this.setTipo(tipo);
	}

	public RestriccionTemporal(LocalDate inicio, LocalDate fin) {
		this.setInicio(inicio);
		this.setFin(fin);
	}

	public RestriccionTemporal(String tipo, LocalDate inicio, LocalDate fin) {
		this.setTipo(tipo);
		this.setInicio(inicio);
		this.setFin(fin);
	}

	private String getTipo() {
		return tipo;
	}

	private void setTipo(String tipo) {
		this.tipo = tipo;
	}

	private LocalDate getInicio() {
		return inicio;
	}

	private void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	private LocalDate getFin() {
		return fin;
	}

	private void setFin(LocalDate fin) {
		this.fin = fin;
	}

	public boolean estaHabilitado(LocalDate fecha) {
		switch (this.getTipo()) {
		case "diasHabiles":
			return fecha.getDayOfWeek().getValue() < 6 && this.estaDentroDelPeriodo(fecha);
		case "finDeSemana":
			return fecha.getDayOfWeek().getValue() > 5 && this.estaDentroDelPeriodo(fecha);
		default:
			return this.estaDentroDelPeriodo(fecha);
		}
	}

	private boolean estaDentroDelPeriodo(LocalDate fecha) {
		return (this.getInicio() == null && this.getFin() == null)
				|| (fecha.isAfter(this.getInicio()) && fecha.isBefore(this.getFin()));
	}
}
