package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import java.util.List;
import java.util.Set;

import ar.edu.unq.po2.tpfinal.*;

public class IncluyeTextoEnTitulo extends CondicionDeBusqueda {

	private String textoABuscar;
	
	public IncluyeTextoEnTitulo(String textoABuscar) {
		
		this.setTextoABuscar(textoABuscar);
		
	}

	public String getTextoABuscar() {
		return textoABuscar;
	}

	public void setTextoABuscar(String textoABuscar) {
		this.textoABuscar = textoABuscar;
	}

	@Override
	public boolean seCumple(Proyecto proyecto) {
		
		return proyecto.getNombre().contains(this.getTextoABuscar());
	}

	@Override
	public List<Proyecto> filtrarProyectos(Set<Proyecto> proyDisponibles) {
	
		return proyDisponibles.stream().filter(p -> p.getNombre().contains(textoABuscar)).toList();
	}

}
