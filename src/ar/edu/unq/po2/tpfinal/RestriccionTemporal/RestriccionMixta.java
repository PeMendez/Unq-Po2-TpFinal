package ar.edu.unq.po2.tpfinal.RestriccionTemporal;

import java.util.List;

import ar.edu.unq.po2.tpfinal.Muestra;

public class RestriccionMixta extends RestriccionTemporal{
	
	private List<RestriccionTemporal> restricciones;
	
	public RestriccionMixta(List<RestriccionTemporal> restricciones) {
		this.setRestricciones(restricciones);
	}

	public List<RestriccionTemporal> getRestricciones() {
		return this.restricciones;
	}

	public void setRestricciones(List<RestriccionTemporal> restricciones) {
		this.restricciones = restricciones;
	}

	@Override
	public boolean seCumple(Muestra muestra) {
		return this.getRestricciones().stream().allMatch(restriccion -> restriccion.seCumple(muestra));
	}

	@Override
	public void agregarRestriccion(RestriccionTemporal restriccion) {
		this.getRestricciones().add(restriccion);
	}

	@Override
	public void borrarRestriccion(RestriccionTemporal restriccion) {
		this.getRestricciones().remove(restriccion);
	}
}
