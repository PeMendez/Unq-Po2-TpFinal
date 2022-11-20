package ar.edu.unq.po2.tpfinal.StateDesafios;

import java.time.LocalDate;

public class EstadoEnCurso extends EstadoDesafio {

	@Override
	public boolean estaCompleto(DesafioUsuario desafio) {
		boolean estaCompletoElDesafio = this.porcentajeDeCompletitud(desafio) == 100;
		if (estaCompletoElDesafio) {
			desafio.setEstado(new EstadoCompleto());  
			desafio.setFechaCompletado(LocalDate.now());
		}
		
		return estaCompletoElDesafio;
	}

	@Override
	public int porcentajeDeCompletitud(DesafioUsuario desafio) {
		
		return (desafio.cantidadDeMuestrasValidas() * 100) / desafio.getDesafio().getCantidadDeMuestras();
	}

	@Override
	public void serAceptado(DesafioUsuario desafio) throws Exception {
		
		throw new Exception("El desafio ya fue aceptado");
		
	}
}
