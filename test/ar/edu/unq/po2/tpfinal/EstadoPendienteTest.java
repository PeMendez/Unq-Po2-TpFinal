package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*; 

import org.junit.jupiter.api.*;
import org.mockito.Mock;

import ar.edu.unq.po2.tpfinal.StateDesafios.*;

public class EstadoPendienteTest {
	
	private EstadoPendiente estadoPend;
	@Mock private EstadoDesafio estadoEnCurso;
	@Mock Desafio desafio; 
	@Mock Usuario usuario; 
	private DesafioUsuario du; 
	@Mock private DesafioUsuario du2; 
	@Mock private EstadoEnCurso estdoEnCurso; 
	
	@BeforeEach 
	public void setUp() {
		estadoPend = new EstadoPendiente();
		estadoEnCurso = mock(EstadoDesafio.class);
		du2 = mock(DesafioUsuario.class);
		du = new DesafioUsuario(usuario, desafio);
		estadoEnCurso = mock(EstadoEnCurso.class); 
	}
	
	
	@Test
	void testDesafioEstaPendiente() {
		//setup
		
		//excercise
		
		//verify
		assertFalse(du.getEstado().estaCompleto(du));
	}
	
	@Test
	void testEstaCompleto() {
		//setup
	
		//exercise
		
		//verify
		assertFalse(estadoPend.estaCompleto(du2));
	}
	
	@Test
	void testPorcentajeDeCompletitud() {
		//setup

		//exercise

		//verify
		assertEquals(0.00f, estadoPend.porcentajeDeCompletitud(du));
	}
	
	
}
