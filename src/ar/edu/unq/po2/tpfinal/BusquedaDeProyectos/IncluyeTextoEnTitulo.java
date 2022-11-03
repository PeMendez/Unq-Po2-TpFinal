package ar.edu.unq.po2.tpfinal.BusquedaDeProyectos;

import ar.edu.unq.po2.tpfinal.*;

public class IncluyeTextoEnTitulo extends CondicionDeBusqueda {

	private String textoABuscar;

	public String getTextoABuscar() {
		return textoABuscar;
	}

	public void setTextoABuscar(String textoABuscar) {
		this.textoABuscar = textoABuscar;
	}

	@Override
	public boolean seCumple(Proyecto proyecto) {
		return proyecto.getTitulo().contains(textoABuscar);
	}

//	@Override
//	public void agregarCondicion(CondicionDeBusqueda condicion) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void borrarCondicion(CondicionDeBusqueda condicion) {
//		// TODO Auto-generated method stub
//		
//	}

}
