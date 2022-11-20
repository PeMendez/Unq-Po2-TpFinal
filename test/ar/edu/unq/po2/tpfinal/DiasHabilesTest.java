package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpfinal.RestriccionTemporal.DiasHabiles;

class DiasHabilesTest {

	
	private DiasHabiles diasHabiles;
	private Muestra muestra;

	@BeforeEach
	void setUp() throws Exception {
		diasHabiles = new DiasHabiles();
		muestra = mock(Muestra.class);
	}

	@Test
	void testSeCumpleTrue() {
		// lunes
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 17));
		// verify
		assertTrue(diasHabiles.seCumple(muestra));
		
		// martes
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 18));
		// verify
		assertTrue(diasHabiles.seCumple(muestra));
		
		// miercoles
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 19));
		// verify
		assertTrue(diasHabiles.seCumple(muestra));
		
		// jueves
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 10));
		// verify
		assertTrue(diasHabiles.seCumple(muestra));
		
		// viernes
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 21));
		// verify
		assertTrue(diasHabiles.seCumple(muestra));
	}
	
	@Test
	void testSeCumpleFalse() {
		// sabado
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 22));
		// verify
		assertFalse(diasHabiles.seCumple(muestra));

		// domingo
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 23));
		// verify
		assertFalse(diasHabiles.seCumple(muestra));
	}
}
