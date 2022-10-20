package ar.edu.unq.po2.tpfinal;

import java.util.List;

public class Usuario {

	private List<Muestra> muestras; 
	private List<Proyecto> proyectos; 
	private Perfil perfil; 
	
	public Usuario() {
		
	}
	
	public void suscribirse(Proyecto proyecto) {
		
		this.proyectos.add(proyecto); 
		proyecto.addParticipante(this);
	}
}
