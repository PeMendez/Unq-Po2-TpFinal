package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpfinal.RestriccionTemporal.RangoDeFechas;
import ar.edu.unq.po2.tpfinal.RestriccionTemporal.TipoDeRestriccion;

class RangoDeFechasTest {

	private TipoDeRestriccion rangodefechas;

	@BeforeEach
	void setUp() throws Exception {
		rangodefechas = new RangoDeFechas(LocalDate.of(2022, 10, 17), LocalDate.of(2022, 10, 19));
	}

	@Test
	void testEstaHabilitadoTrue() {
		assertTrue(rangodefechas.estaHabilitado(LocalDate.of(2022, 10, 17)));
		assertTrue(rangodefechas.estaHabilitado(LocalDate.of(2022, 10, 18)));
		assertTrue(rangodefechas.estaHabilitado(LocalDate.of(2022, 10, 19)));
	}

	@Test
	void testEstaHabilitadoFalse() {
		assertFalse(rangodefechas.estaHabilitado(LocalDate.of(2022, 10, 16)));
		assertFalse(rangodefechas.estaHabilitado(LocalDate.of(2022, 10, 20)));
	}

}
