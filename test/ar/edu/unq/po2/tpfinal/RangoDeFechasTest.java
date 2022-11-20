package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpfinal.RestriccionTemporal.RangoDeFechas;

class RangoDeFechasTest {

	private RangoDeFechas rangodefechas;

	@BeforeEach
	void setUp() throws Exception {
		rangodefechas = new RangoDeFechas(LocalDate.of(2022, 10, 17), LocalDate.of(2022, 10, 19));
	}

	@Test
	void testEstaHabilitadoTrue() {
		// verify
		assertTrue(rangodefechas.seCumple(LocalDate.of(2022, 10, 17)));
		assertTrue(rangodefechas.seCumple(LocalDate.of(2022, 10, 18)));
		assertTrue(rangodefechas.seCumple(LocalDate.of(2022, 10, 19)));
	}

	@Test
	void testEstaHabilitadoFalse() {
		// verify
		assertFalse(rangodefechas.seCumple(LocalDate.of(2022, 10, 16)));
		assertFalse(rangodefechas.seCumple(LocalDate.of(2022, 10, 20)));
	}

}
