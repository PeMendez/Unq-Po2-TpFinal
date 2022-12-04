package ar.edu.unq.po2.tpfinal;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestriccionGeograficaTest {

	private RestriccionGeografica restriccion;
	private Coordenada coordenada;
	private Coordenada coordenadaDeRestriccion;
	private Muestra muestra;

	@BeforeEach
	void setUp() throws Exception {
		coordenada = mock(Coordenada.class);
		coordenadaDeRestriccion = mock(Coordenada.class);
		restriccion = new RestriccionGeografica(coordenadaDeRestriccion, 5);
		muestra = mock(Muestra.class);
		when(muestra.getCoordenada()).thenReturn(coordenada);
		when(coordenadaDeRestriccion.getLatitud()).thenReturn(5);
		when(coordenadaDeRestriccion.getLongitud()).thenReturn(5);
	}

	@Test
	void testSeCumpleTrue() {
		// coordenada en el interior
		when(coordenada.getLatitud()).thenReturn(4);
		when(coordenada.getLongitud()).thenReturn(4);
		assertTrue(restriccion.seCumple(muestra));

		// coordenada en el borde
		when(coordenada.getLatitud()).thenReturn(5);
		when(coordenada.getLongitud()).thenReturn(10);
		assertTrue(restriccion.seCumple(muestra));
	}

	@Test
	void testSeCumpleFalse() {
		// coordenada fuera
		when(coordenada.getLatitud()).thenReturn(10);
		when(coordenada.getLongitud()).thenReturn(10);
		assertFalse(restriccion.seCumple(muestra));
	}

	@Test
	void testGetCoordenada() {
		// verify
		assertEquals(coordenadaDeRestriccion, restriccion.getCoordenada());
	}

	@Test
	void testGetRadio() {
		// verify
		assertEquals(5, restriccion.getRadio());
	}
}
