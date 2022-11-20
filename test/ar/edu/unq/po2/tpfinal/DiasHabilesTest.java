package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.tpfinal.RestriccionTemporal.DiasHabiles;
import ar.edu.unq.po2.tpfinal.RestriccionTemporal.RestriccionTemporal;

class DiasHabilesTest {

	@Mock
	private RestriccionTemporal restriccion1;
	private DiasHabiles diasHabiles;

	@BeforeEach
	void setUp() throws Exception {

		diasHabiles = new DiasHabiles();
	}

	@Test
	void testEstaHabilitadoTrue() {
		// verify
		assertTrue(diasHabiles.seCumple(LocalDate.of(2022, 10, 17))); // Lunes
		assertTrue(diasHabiles.seCumple(LocalDate.of(2022, 10, 18))); // Martes
		assertTrue(diasHabiles.seCumple(LocalDate.of(2022, 10, 19))); // Miércoles
		assertTrue(diasHabiles.seCumple(LocalDate.of(2022, 10, 20))); // Jueves
		assertTrue(diasHabiles.seCumple(LocalDate.of(2022, 10, 21))); // Viernes
	}

	@Test
	void testEstaHabilitadoFalse() {
		// verify
		assertFalse(diasHabiles.seCumple(LocalDate.of(2022, 10, 22))); // Sábado
		assertFalse(diasHabiles.seCumple(LocalDate.of(2022, 10, 23))); // Domingo
	}
}
