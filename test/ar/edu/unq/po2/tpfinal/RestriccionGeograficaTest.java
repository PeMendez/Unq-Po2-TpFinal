package ar.edu.unq.po2.tpfinal;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
	private RestriccionGeografica restriccionG;
	private int latitud;
	private int longitud;
	private int radio;

	@BeforeEach
	void setUp() throws Exception {
		coordenada1 = mock(Coordenada.class);
		coordenada2 = mock(Coordenada.class);
		restriccion = new RestriccionGeografica(5, 5, 5);
		latitud = 30;
		longitud = 10;
		radio = 4;
		restriccionG = new RestriccionGeografica(latitud, longitud, radio);
	}

	@Test
	void testContieneTrue1() {
		// set up
		when(coordenada1.getLatitud()).thenReturn(4);
		when(coordenada1.getLongitud()).thenReturn(4);
		when(coordenada2.getLatitud()).thenReturn(5);
		when(coordenada2.getLongitud()).thenReturn(5);

		// verify
		assertTrue(restriccion.seCumple(coordenada1));
		assertTrue(restriccion.seCumple(coordenada2));
	}

	@Test
	void testContieneFalse1() {
		// set up
		when(coordenada2.getLatitud()).thenReturn(6);
		when(coordenada2.getLongitud()).thenReturn(6);

		// verify
		assertFalse(restriccion.seCumple(coordenada1));
	}

	@Test
	void testGetLatitud() {
		//setup
		//exercise
		//verify
		assertEquals(30,restriccionG.getLatitud());
	}
	
	
	@Test
	void testGetLongitud() {
		//setup
		//exercise
		//verify
		assertEquals(10,restriccionG.getLongitud());
	}

	@Test
	void testGetRadio() {
		//setup
		//exercise
		//verify
		assertEquals(4,restriccionG.getRadio());
	}

	@Test
	void testContieneTrue() {
		//setup
		Coordenada coordenada = new Coordenada(31, 12);
		//exercise
		//verify
		assertTrue(restriccionG.seCumple(coordenada));
	}

	@Test
	void testContieneFalse() {
		//setup
		Coordenada coordenada = new Coordenada(33, 13);
		//exercise
		//verify
		assertFalse(restriccionG.seCumple(coordenada));
	}

}
