package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.List;
import java.util.Set;

import ar.edu.unq.po2.tpfinal.*;

public abstract class CondicionDeBusqueda {

	public abstract List<Proyecto> filtrarProyectos(Set<Proyecto> proyDisponibles);

}
