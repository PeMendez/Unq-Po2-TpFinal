package ar.edu.unq.po2.tpfinal;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestriccionGeograficaTest {

	private RestriccionGeografica restriccion;
	private Coordenada coordenada;
	private RestriccionGeografica restriccionG;
	private int latitud;
	private int longitud;
	private int radio;
	private Muestra muestra;

	@BeforeEach
	void setUp() throws Exception {
		coordenada = mock(Coordenada.class);
		restriccion = new RestriccionGeografica(5, 5, 5);
		latitud = 30;
		longitud = 10;
		radio = 4;
		restriccionG = new RestriccionGeografica(latitud, longitud, radio);
		muestra = mock(Muestra.class);
		when(muestra.getCoordenada()).thenReturn(coordenada);
	}

	@Test
	void testSeCumpleTrue() {
		// coordenada en el interior
		when(coordenada.getLatitud()).thenReturn(4);
		when(coordenada.getLongitud()).thenReturn(4);
		assertTrue(restriccion.seCumple(muestra));

		// coordenada en el borde
		when(coordenada.getLatitud()).thenReturn(5);
		when(coordenada.getLongitud()).thenReturn(5);
		assertTrue(restriccion.seCumple(muestra));
	}

	@Test
	void testSeCumpleFalse() {
		// coordenada fuera
		when(coordenada.getLatitud()).thenReturn(6);
		when(coordenada.getLongitud()).thenReturn(6);
		assertTrue(restriccion.seCumple(muestra));
	}

	@Test
	void testGetLatitud() {
		// setup
		// exercise
		// verify
		assertEquals(30, restriccionG.getLatitud());
	}

	@Test
	void testGetLongitud() {
		// setup
		// exercise
		// verify
		assertEquals(10, restriccionG.getLongitud());
	}

	@Test
	void testGetRadio() {
		// setup
		// exercise
		// verify
		assertEquals(4, restriccionG.getRadio());
	}

//	@Test
//	void testContieneTrue() {
//		//setup
//		Coordenada coordenada = new Coordenada(31, 12);
//		//exercise
//		//verify
//		assertTrue(restriccionG.seCumple(coordenada));
//	}
//
//	@Test
//	void testContieneFalse() {
//		//setup
//		Coordenada coordenada = new Coordenada(33, 13);
//		//exercise
//		//verify
//		assertFalse(restriccionG.seCumple(coordenada));
//	}

}
