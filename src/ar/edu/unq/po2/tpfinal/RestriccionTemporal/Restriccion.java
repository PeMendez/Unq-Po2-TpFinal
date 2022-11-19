package ar.edu.unq.po2.tpfinal.RestriccionTemporal;

import java.time.LocalDate;

public abstract class Restriccion {
	
	public abstract boolean estaHabilitado(LocalDate fecha);
	public abstract void agregarRestriccion(Restriccion restriccion);
	public abstract void borrarRestriccion(Restriccion restriccion);
}
