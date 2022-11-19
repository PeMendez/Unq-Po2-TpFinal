package ar.edu.unq.po2.tpfinal.RestriccionTemporal;

import java.time.LocalDate;

public class FinDeSemana extends Restriccion {
	
	@Override
	public boolean estaHabilitado(LocalDate fecha) {
		return fecha.getDayOfWeek().getValue() > 5;
	}

	@Override
	public void agregarRestriccion(Restriccion restriccion) {
	}

	@Override
	public void borrarRestriccion(Restriccion restriccion) {
	}

}
