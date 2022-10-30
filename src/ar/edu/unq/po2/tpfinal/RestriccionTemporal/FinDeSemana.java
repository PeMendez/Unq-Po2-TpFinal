package ar.edu.unq.po2.tpfinal;

import java.time.LocalDate;

public class FinDeSemana extends TipoDeRestriccion {
	
	@Override
	public boolean estaHabilitado(LocalDate fecha) {
		return fecha.getDayOfWeek().getValue() > 5;
	}

	@Override
	public void agregarRestriccion(TipoDeRestriccion restriccion) {
	}

	@Override
	public void borrarRestriccion(TipoDeRestriccion restriccion) {
	}

}
