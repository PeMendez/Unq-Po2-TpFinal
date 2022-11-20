package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpfinal.RestriccionTemporal.RangoDeFechas;

class RangoDeFechasTest {

	private RangoDeFechas rangodefechas;
	private Muestra muestra;

	@BeforeEach
	void setUp() throws Exception {
		rangodefechas = new RangoDeFechas(LocalDate.of(2022, 10, 17), LocalDate.of(2022, 10, 19));
		muestra = mock(Muestra.class);
	}

	@Test
	void testSeCumpleTrue() {
		// inicio del rango
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 17));
		// verify
		assertTrue(rangodefechas.seCumple(muestra));
		
		// dentro del rango
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 18));
		// verify
		assertTrue(rangodefechas.seCumple(muestra));
		
		// final del rango
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 19));
		// verify
		assertTrue(rangodefechas.seCumple(muestra));
	}

	@Test
	void testSeCumpleFalse() {
		// antes del inicio
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 16));
		// verify
		assertFalse(rangodefechas.seCumple(muestra));
		
		// luego del fin
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 20));
		// verify
		assertFalse(rangodefechas.seCumple(muestra));
	}

}
