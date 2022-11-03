package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.mockito.Mock;

import ar.edu.unq.po2.tpfinal.StateDesafios.*;

public class EstadoPendienteTest {
	
	@Mock Desafio desafio; 
	@Mock Usuario usuario; 
	private DesafioUsuario du; 
	
	@BeforeEach 
	public void setUp() {
		
		du = new DesafioUsuario(usuario, desafio);
	}
	
	
	@Test
	void testDesafioEstaPendiente() {
		//setup
		
		//excercise
		
		//verify
		assertFalse(du.getEstado().estaCompleto(du));

	}
	
	

}
