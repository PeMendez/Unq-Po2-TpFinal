package ar.edu.unq.po2.tpfinal.StateDesafios;


public abstract interface EstadoDesafio {

	public abstract boolean estaCompleto(DesafioUsuario desafio); 
	public abstract int porcentajeDeCompletitud(DesafioUsuario desafio);
	public abstract void serAceptado(DesafioUsuario desafio) throws Exception;
}
