package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpfinal.RestriccionTemporal.DiasHabiles;
import ar.edu.unq.po2.tpfinal.RestriccionTemporal.TipoDeRestriccion;

class DiasHabilesTest {

	private TipoDeRestriccion diasHabiles;

	@BeforeEach
	void setUp() throws Exception {
		diasHabiles = new DiasHabiles();
	}

	@Test
	void testEstaHabilitadoTrue() {
		assertTrue(diasHabiles.estaHabilitado(LocalDate.of(2022, 10, 17))); // Lunes
		assertTrue(diasHabiles.estaHabilitado(LocalDate.of(2022, 10, 18))); // Martes
		assertTrue(diasHabiles.estaHabilitado(LocalDate.of(2022, 10, 19))); // Mi�rcoles
		assertTrue(diasHabiles.estaHabilitado(LocalDate.of(2022, 10, 20))); // Jueves
		assertTrue(diasHabiles.estaHabilitado(LocalDate.of(2022, 10, 21))); // Viernes
	}

	@Test
	void testEstaHabilitadoFalse() {
		assertFalse(diasHabiles.estaHabilitado(LocalDate.of(2022, 10, 22))); // S�bado
		assertFalse(diasHabiles.estaHabilitado(LocalDate.of(2022, 10, 23))); // Domingo
	}
}
