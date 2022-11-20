package ar.edu.unq.po2.tpfinal.RestriccionTemporal;

import ar.edu.unq.po2.tpfinal.Muestra;

public class DiasHabiles extends RestriccionTemporal{

	@Override
	public boolean seCumple(Muestra muestra) {
		return muestra.getFecha().getDayOfWeek().getValue() < 6;
	}

	@Override
	public void agregarRestriccion(RestriccionTemporal restriccion) {
	}

	@Override
	public void borrarRestriccion(RestriccionTemporal restriccion) {
	}
}
