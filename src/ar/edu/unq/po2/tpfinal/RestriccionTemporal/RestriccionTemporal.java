package ar.edu.unq.po2.tpfinal.RestriccionTemporal;

import ar.edu.unq.po2.tpfinal.IRestriccion;

public abstract class RestriccionTemporal implements IRestriccion{
	
	public abstract void agregarRestriccion(RestriccionTemporal restriccion);
	public abstract void borrarRestriccion(RestriccionTemporal restriccion);
}
