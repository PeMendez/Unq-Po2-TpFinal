package ar.edu.unq.po2.tpfinal.StateDesafios;

public class EstadoCompleto extends EstadoDesafio{

	@Override
	public boolean estaCompleto(DesafioUsuario desafio) {
		
		return true;
	}

	@Override
	public float porcentajeDeCompletitud(DesafioUsuario desafio) {
		
		return 1.00f;
	}

	@Override
	public void serAceptado(DesafioUsuario desafio) {
		
	}

}
