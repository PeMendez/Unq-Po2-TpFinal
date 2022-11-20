package ar.edu.unq.po2.tpfinal.RestriccionTemporal;

import ar.edu.unq.po2.tpfinal.Muestra;

public class FinDeSemana extends RestriccionTemporal {
	
	@Override
	public boolean seCumple(Muestra muestra) {
		return muestra.getFecha().getDayOfWeek().getValue() > 5;
	}

	@Override
	public void agregarRestriccion(RestriccionTemporal restriccion) {
	}

	@Override
	public void borrarRestriccion(RestriccionTemporal restriccion) {
	}

}
