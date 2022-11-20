package ar.edu.unq.po2.tpfinal;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import ar.edu.unq.po2.tpfinal.RestriccionTemporal.*;

class RestriccionMixtaTest {

	private RestriccionMixta restriccionMixta;
	@Mock
	private RestriccionTemporal restriccion1;
	@Mock
	private RestriccionTemporal restriccion2;
	private List<RestriccionTemporal> restricciones;
	@Mock private Muestra muestra; 

	@BeforeEach
	void setUp() throws Exception {
		restriccion1 = mock(RestriccionTemporal.class);
		restriccion2 = mock(RestriccionTemporal.class);
		restricciones = new ArrayList<RestriccionTemporal>();
		restriccionMixta = new RestriccionMixta(restricciones);
		restriccionMixta.agregarRestriccion(restriccion1);
		restriccionMixta.agregarRestriccion(restriccion2);
		muestra = mock(Muestra.class); 
	}

	@Test
	void testEstaHabilitadoTrue() {
		when(restriccion1.seCumple(muestra)).thenReturn(true);
		when(restriccion2.seCumple(muestra)).thenReturn(true);
		assertTrue(restriccionMixta.seCumple(muestra));
	}

	@Test
	void testEstaHabilitadoFalse() {
		
		when(restriccion1.seCumple(muestra)).thenReturn(false);
		when(restriccion2.seCumple(muestra)).thenReturn(true);
		assertFalse(restriccionMixta.seCumple(muestra));
	}
	
	@Test 
	void testAddRestriccion() {
		
		assertEquals(restriccionMixta.getRestricciones().size(), 2); 
	}
	
	@Test 
	void testRemoveRestriccion() {
		
		restriccionMixta.borrarRestriccion(restriccion1);
		
		assertEquals(restriccionMixta.getRestricciones().size(), 1); 
	}

}
