package ar.edu.unq.po2.tpfinal.StateDesafios;

public abstract class EstadoDesafio {

	public abstract boolean estaCompleto(DesafioUsuario desafio); 
	public abstract float porcentajeDeCompletitud(DesafioUsuario desafio);
	public abstract void serAceptado(DesafioUsuario desafio) throws Exception;
}
