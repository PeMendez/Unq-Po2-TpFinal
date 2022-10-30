package ar.edu.unq.po2.tpfinal.RestriccionTemporal;

import java.time.LocalDate;

public class DiasHabiles extends TipoDeRestriccion{

	@Override
	public boolean estaHabilitado(LocalDate fecha) {
		return fecha.getDayOfWeek().getValue() < 6;
	}

	@Override
	public void agregarRestriccion(TipoDeRestriccion restriccion) {
	}

	@Override
	public void borrarRestriccion(TipoDeRestriccion restriccion) {
	}
}
