package ar.edu.unq.po2.tpfinal;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class RestriccionGeograficaTest {

	private RestriccionGeografica restriccion;
	@Mock
	private Coordenada coordenada1;
	@Mock
	private Coordenada coordenada2;

	@BeforeEach
	void setUp() throws Exception {
		coordenada1 = mock(Coordenada.class);
		coordenada2 = mock(Coordenada.class);
		restriccion = new RestriccionGeografica(5, 5, 5);
	}

	@Test
	void testContieneTrue() {
		// set up
		when(coordenada1.getX()).thenReturn(4);
		when(coordenada1.getY()).thenReturn(4);
		when(coordenada2.getX()).thenReturn(5);
		when(coordenada2.getY()).thenReturn(5);

		// verify
		assertTrue(restriccion.contiene(coordenada1));
		assertTrue(restriccion.contiene(coordenada2));
	}

	@Test
	void testContieneFalse() {
		// set up
		when(coordenada2.getX()).thenReturn(6);
		when(coordenada2.getY()).thenReturn(6);

		// verify
		assertFalse(restriccion.contiene(coordenada1));
	}

	@Test
	void testGetLatitud() {
		//setup
		//exercise
		//verify
		assertEquals(30,restriccionG.getLatitud());
	}

}
