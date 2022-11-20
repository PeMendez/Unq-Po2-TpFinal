package ar.edu.unq.po2.tpfinal.RestriccionTemporal;

import java.time.LocalDate;

import ar.edu.unq.po2.tpfinal.Muestra;

public class RangoDeFechas extends RestriccionTemporal{
	
	private LocalDate inicio;
	private LocalDate fin;
	
	public RangoDeFechas(LocalDate inicio,LocalDate fin) {
		this.setInicio(inicio);
		this.setFin(fin);
	}
	
	private LocalDate getInicio() {
		return this.inicio;
	}

	private void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	private LocalDate getFin() {
		return this.fin;
	}

	private void setFin(LocalDate fin) {
		this.fin = fin;
	}


	@Override
	public boolean seCumple(Muestra muestra) {
		return muestra.getFecha().isAfter(this.getInicio().minusDays(1)) && muestra.getFecha().isBefore(this.getFin().plusDays(1));
	}

	@Override
	public void agregarRestriccion(RestriccionTemporal restriccion) {
	}

	@Override
	public void borrarRestriccion(RestriccionTemporal restriccion) {
	}


}
