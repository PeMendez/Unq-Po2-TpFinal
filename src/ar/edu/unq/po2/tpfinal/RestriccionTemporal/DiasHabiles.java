package ar.edu.unq.po2.tpfinal.RestriccionTemporal;

import java.time.LocalDate;

public class DiasHabiles extends Restriccion{

	@Override
	public boolean estaHabilitado(LocalDate fecha) {
		return fecha.getDayOfWeek().getValue() < 6;
	}

	@Override
	public void agregarRestriccion(Restriccion restriccion) {
	}

	@Override
	public void borrarRestriccion(Restriccion restriccion) {
	}
}
