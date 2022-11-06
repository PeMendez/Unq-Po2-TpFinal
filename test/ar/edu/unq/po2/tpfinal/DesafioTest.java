package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.tpfinal.RestriccionTemporal.DiasHabiles;
import ar.edu.unq.po2.tpfinal.RestriccionTemporal.TipoDeRestriccion;

public class DesafioTest {

	private Desafio desafio;
	@Mock
	private RestriccionGeografica area;
	@Mock
	private TipoDeRestriccion restriccion;
	private int cantidadDeMuestras;
	private int dificultad;
	private int recompensa;
	@Mock
	private Muestra muestra;
	private Coordenada coordenada;

	@BeforeEach
	void setUp() throws Exception {
		area = mock(RestriccionGeografica.class);
		restriccion = mock(TipoDeRestriccion.class);
		cantidadDeMuestras = 10;
		dificultad=4;
		recompensa=100;
		desafio = new Desafio(area, restriccion, cantidadDeMuestras, dificultad, recompensa);
		muestra = mock(Muestra.class);
	}

	@Test
	void testEsMuestraValidaTrue() {
		// set up
		when(muestra.getCoordenada()).thenReturn(coordenada);
		when(area.contiene(coordenada)).thenReturn(true);
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 17));
		when(restriccion.estaHabilitado(LocalDate.of(2022, 10, 17))).thenReturn(true);
		
		// verify
		assertTrue(desafio.esMuestraValida(muestra));
		
	}

	@Test
	void testEsMuestraValidaFalse() {
		// set up
		when(muestra.getCoordenada()).thenReturn(coordenada);
		when(area.contiene(coordenada)).thenReturn(false);
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 17));
		when(restriccion.estaHabilitado(LocalDate.of(2022, 10, 17))).thenReturn(true);
		
		// verify
		assertFalse(desafio.esMuestraValida(muestra));
	}
}
