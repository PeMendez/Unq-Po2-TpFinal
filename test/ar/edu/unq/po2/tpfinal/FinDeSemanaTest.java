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
		assertTrue(finDeSemana.estaHabilitado(LocalDate.of(2022, 10, 22))); // Sábado
		assertTrue(finDeSemana.estaHabilitado(LocalDate.of(2022, 10, 23))); // Domingo
	}

	@Test
	void testEstaHabilitadoFalse() {
		assertFalse(finDeSemana.estaHabilitado(LocalDate.of(2022, 10, 17))); // Lunes
		assertFalse(finDeSemana.estaHabilitado(LocalDate.of(2022, 10, 18))); // Martes
		assertFalse(finDeSemana.estaHabilitado(LocalDate.of(2022, 10, 19))); // Miércoles
		assertFalse(finDeSemana.estaHabilitado(LocalDate.of(2022, 10, 20))); // Jueves
		assertFalse(finDeSemana.estaHabilitado(LocalDate.of(2022, 10, 21))); // Viernes
	}
}
