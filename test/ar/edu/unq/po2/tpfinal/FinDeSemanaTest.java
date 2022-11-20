package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpfinal.RestriccionTemporal.FinDeSemana;

class FinDeSemanaTest {

	
	private FinDeSemana finDeSemana;
	private Muestra muestra;

	@BeforeEach
	void setUp() throws Exception {
		finDeSemana = new FinDeSemana();
		muestra = mock(Muestra.class);
	}

	@Test
	void testEstaHabilitadoTrue() {
		// sabado
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 22));
		// verify
		assertTrue(finDeSemana.seCumple(muestra));

		// domingo
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 23));
		// verify
		assertTrue(finDeSemana.seCumple(muestra));
	}

	@Test
	void testEstaHabilitadoFalse() {
		// lunes
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 17));
		// verify
		assertFalse(finDeSemana.seCumple(muestra));
		
		// martes
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 18));
		// verify
		assertFalse(finDeSemana.seCumple(muestra));
		
		// miercoles
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 19));
		// verify
		assertFalse(finDeSemana.seCumple(muestra));
		
		// jueves
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 10));
		// verify
		assertFalse(finDeSemana.seCumple(muestra));
		
		// viernes
		// set up
		when(muestra.getFecha()).thenReturn(LocalDate.of(2022, 10, 21));
		// verify
		assertFalse(finDeSemana.seCumple(muestra));
	}
}
