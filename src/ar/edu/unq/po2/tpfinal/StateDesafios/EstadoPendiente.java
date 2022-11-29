package ar.edu.unq.po2.tpfinal.StateDesafios;

import java.time.LocalDate;

public class EstadoPendiente implements EstadoDesafio {

	@Override
	public boolean estaCompleto(DesafioUsuario desafio) {
		
		return false;
	}

	@Override
	public int porcentajeDeCompletitud(DesafioUsuario desafio) {
 
		return 0; 
	}

	@Override
	public void serAceptado(DesafioUsuario desafio) throws Exception {
		
		desafio.setEstado(new EstadoEnCurso());
		desafio.setFechaInicio(LocalDate.now());
		
	}
}
