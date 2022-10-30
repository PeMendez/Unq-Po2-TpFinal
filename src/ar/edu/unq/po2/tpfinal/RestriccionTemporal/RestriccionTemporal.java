package ar.edu.unq.po2.tpfinal;

import java.time.LocalDate;

public class RestriccionTemporal {

	private Periodo periodo = null;
	private LocalDate inicio = null;
	private LocalDate fin = null;

	public RestriccionTemporal(Periodo periodo) {
		this.setPeriodo(periodo);
	}

	public RestriccionTemporal(LocalDate inicio, LocalDate fin) {
		this.setInicio(inicio);
		this.setFin(fin);
	}

	public RestriccionTemporal(Periodo periodo, LocalDate inicio, LocalDate fin) {
		this.setPeriodo(periodo);
		this.setInicio(inicio);
		this.setFin(fin);
	}

	private Periodo getPeriodo() {
		return periodo;
	}

	private void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
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
		switch (this.getPeriodo()) {
		case DIAS_HABILES:
			return fecha.getDayOfWeek().getValue() < 6 && this.estaDentroDelPeriodo(fecha);
		case FIN_DE_SEMANA:
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
