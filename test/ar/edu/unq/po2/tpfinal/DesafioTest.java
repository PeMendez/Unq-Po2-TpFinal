package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.tpfinal.RestriccionTemporal.RestriccionTemporal;

public class DesafioTest {

	private Desafio desafio;
	@Mock
	private RestriccionGeografica area;
	@Mock
	private RestriccionTemporal restriccion;
	private int cantidadDeMuestras;
	private int dificultad;
	private int recompensa;
	@Mock
	private Muestra muestra;
	private Coordenada coordenada;

	@BeforeEach
	void setUp() throws Exception {
		area = mock(RestriccionGeografica.class);
		restriccion = mock(RestriccionTemporal.class);
		cantidadDeMuestras = 10;
		dificultad = 4;
		recompensa = 100;
		desafio = new Desafio(area, restriccion, cantidadDeMuestras, dificultad, recompensa);
		muestra = mock(Muestra.class);
	}

	@Test
	void testGetCantidadDeMuestras() {
		assertEquals(10, desafio.getCantidadDeMuestras());
	}

	@Test
	void testGetDificultad() {
		assertEquals(4, desafio.getDificultad());
	}

	@Test
	void testGetRecompensa() {
		assertEquals(100, desafio.getRecompensa());
	}

	@Test
	void testEsMuestraValidaTrue() {
		// set up
		when(muestra.esMuestraValida(restriccion)).thenReturn(true);
		when(muestra.esMuestraValida(area)).thenReturn(true);

		// verify
		assertTrue(desafio.esMuestraValida(muestra));

	}

	@Test
	void testEsMuestraValidaCoordenadaFalse() {
		// set up
		when(muestra.getCoordenada()).thenReturn(coordenada);
		when(area.seCumple(muestra)).thenReturn(false);
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 17));
		when(restriccion.seCumple(muestra)).thenReturn(true);

		// verify
		assertFalse(desafio.esMuestraValida(muestra));
	}

	@Test
	void testEsMuestraValidaFechaFalse() {
		// set up
		when(muestra.getCoordenada()).thenReturn(coordenada);
		when(area.seCumple(muestra)).thenReturn(true);
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 17));
		when(restriccion.seCumple(muestra)).thenReturn(false);

		// verify
		assertFalse(desafio.esMuestraValida(muestra));
	}
}
