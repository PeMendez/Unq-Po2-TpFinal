package ar.edu.unq.po2.tpfinal.RestriccionTemporal;

import java.time.LocalDate;
import java.util.List;

public class RestriccionMixta extends TipoDeRestriccion{
	//comentario para pushear
	
	private List<TipoDeRestriccion> restricciones;
	
	public RestriccionMixta(List<TipoDeRestriccion> restricciones) {
		this.setRestricciones(restricciones);
	}

	public List<TipoDeRestriccion> getRestricciones() {
		return this.restricciones;
	}

	public void setRestricciones(List<TipoDeRestriccion> restricciones) {
		this.restricciones = restricciones;
	}

	@Override
	public boolean estaHabilitado(LocalDate fecha) {
		return this.getRestricciones().stream().allMatch(restriccion -> restriccion.estaHabilitado(fecha));
	}

	@Override
	public void agregarRestriccion(TipoDeRestriccion restriccion) {
		this.getRestricciones().add(restriccion);
	}

	@Override
	public void borrarRestriccion(TipoDeRestriccion restriccion) {
		this.getRestricciones().remove(restriccion);
	}
}
