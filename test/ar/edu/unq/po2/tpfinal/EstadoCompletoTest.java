package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.*;
import org.mockito.Mock;

import ar.edu.unq.po2.tpfinal.StateDesafios.*;

public class EstadoCompletoTest {
	
	private EstadoCompleto estadoComp;
	@Mock private DesafioUsuario du2; 
	
	@BeforeEach 
	public void setUp() {
		estadoComp = new EstadoCompleto();
		du2 = mock(DesafioUsuario.class);
	}

	
	@Test
	void testEstaCompleto() {
		//setup
	
		//exercise
		
		//verify
		assertTrue(estadoComp.estaCompleto(du2));
	}
	
	@Test
	void testPorcentajeDeCompletitud() {
		//setup

		//exercise

		//verify
		assertEquals(1.00f, estadoComp.porcentajeDeCompletitud(du2));
	}
	
}