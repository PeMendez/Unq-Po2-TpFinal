package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.*;
import org.mockito.Mock;

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
	
	
	@Test
	void testEstaCompletoFalse() {
		//setup
		when(desafioU1.cantidadDeMuestrasValidas()).thenReturn(1);
		when(desafioU1.getDesafio()).thenReturn(desafio);
		when(desafioU1.getDesafio().getCantidadDeMuestras()).thenReturn(3);
		//exercise
		estadoEnCurso.estaCompleto(desafioU1);
		//verify
		assertFalse(estadoEnCurso.estaCompleto(desafioU1));
	}

	@Test
	void testPorcentajeDeCompletitud() {
		//setup
		when(desafioU1.cantidadDeMuestrasValidas()).thenReturn(2);
		when(desafioU1.getDesafio()).thenReturn(desafio);
		when(desafioU1.getDesafio().getCantidadDeMuestras()).thenReturn(4);
		//exercise
		estadoEnCurso.porcentajeDeCompletitud(desafioU1);
		//verify
		assertEquals(0.50, estadoEnCurso.porcentajeDeCompletitud(desafioU1));
	}
}
