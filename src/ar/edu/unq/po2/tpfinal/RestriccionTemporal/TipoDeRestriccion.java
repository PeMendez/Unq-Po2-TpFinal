package ar.edu.unq.po2.tpfinal.RestriccionTemporal;

import java.time.LocalDate;

public abstract class TipoDeRestriccion {
	
	public abstract boolean estaHabilitado(LocalDate fecha);
	public abstract void agregarRestriccion(TipoDeRestriccion restriccion);
	public abstract void borrarRestriccion(TipoDeRestriccion restriccion);
}
