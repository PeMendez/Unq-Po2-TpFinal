package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.*;
import org.mockito.Mock;

import ar.edu.unq.po2.clasesBasicas.Desafio;
import ar.edu.unq.po2.clasesBasicas.StateDesafios.DesafioUsuario;
import ar.edu.unq.po2.clasesBasicas.StateDesafios.EstadoEnCurso;
import ar.edu.unq.po2.tpfinal.StateDesafios.*;

public class EstadoEnCursoTest {
	
	private EstadoEnCurso estadoEnCurso;
	@Mock private DesafioUsuario desafioU1;
	@Mock private Desafio desafio;
	
	@BeforeEach 
	public void setUp() {
		estadoEnCurso = new EstadoEnCurso();
		desafioU1 = mock(DesafioUsuario.class);
		desafio = mock(Desafio.class);
	}
	
	
	@Test
	void testEstaCompletoTrue() {
		//setup
		when(desafioU1.cantidadDeMuestrasValidas()).thenReturn(1);
		when(desafioU1.getDesafio()).thenReturn(desafio);
		when(desafioU1.getDesafio().getCantidadDeMuestras()).thenReturn(1);
		//exercise
		estadoEnCurso.estaCompleto(desafioU1);
		//verify
		assertTrue(estadoEnCurso.estaCompleto(desafioU1));
	}
	
	

}