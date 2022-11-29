package ar.edu.unq.po2.tpfinal.StateDesafios;

public class EstadoCompleto implements EstadoDesafio{

	@Override
	public boolean estaCompleto(DesafioUsuario desafio) {
		
		return true;
	}

	@Override
	public int porcentajeDeCompletitud(DesafioUsuario desafio) {
		
		return 100;
	}

	@Override
	public void serAceptado(DesafioUsuario desafio) throws Exception {
		
		throw new Exception("El desafio esta completo");
	}

}
