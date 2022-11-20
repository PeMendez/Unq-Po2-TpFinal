package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpfinal.RestriccionTemporal.FinDeSemana;

class FinDeSemanaTest {

	private FinDeSemana finDeSemana;

	@BeforeEach
	void setUp() throws Exception {
		finDeSemana = new FinDeSemana();
	}

	@Test
	void testEstaHabilitadoTrue() {
		// verify
		assertTrue(finDeSemana.seCumple(LocalDate.of(2022, 10, 22))); // Sábado
		assertTrue(finDeSemana.seCumple(LocalDate.of(2022, 10, 23))); // Domingo
	}

	@Test
	void testEstaHabilitadoFalse() {
		// verify
		assertFalse(finDeSemana.seCumple(LocalDate.of(2022, 10, 17))); // Lunes
		assertFalse(finDeSemana.seCumple(LocalDate.of(2022, 10, 18))); // Martes
		assertFalse(finDeSemana.seCumple(LocalDate.of(2022, 10, 19))); // Miércoles
		assertFalse(finDeSemana.seCumple(LocalDate.of(2022, 10, 20))); // Jueves
		assertFalse(finDeSemana.seCumple(LocalDate.of(2022, 10, 21))); // Viernes
	}
}
