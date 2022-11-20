package ar.edu.unq.po2.tpfinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import ar.edu.unq.po2.tpfinal.RestriccionTemporal.*;

class RestriccionMixtaTest {

	private RestriccionMixta restriccionMixta;
	@Mock
	private RestriccionTemporal restriccion1;
	@Mock
	private RestriccionTemporal restriccion2;
	private List<RestriccionTemporal> restricciones;

	@BeforeEach
	void setUp() throws Exception {
		restriccion1 = mock(RestriccionTemporal.class);
		restriccion2 = mock(RestriccionTemporal.class);
		restricciones = new ArrayList<RestriccionTemporal>();
		restriccionMixta = new RestriccionMixta(restricciones);
		restriccionMixta.getRestricciones().add(restriccion1);
		restriccionMixta.getRestricciones().add(restriccion2);
	}

	@Test
	void testEstaHabilitadoTrue() {
		when(restriccion1.seCumple(LocalDate.of(2022, 10, 17))).thenReturn(true);
		when(restriccion2.seCumple(LocalDate.of(2022, 10, 17))).thenReturn(true);
		assertTrue(restriccionMixta.seCumple(LocalDate.of(2022, 10, 17)));
	}

	@Test
	void testEstaHabilitadoFalse() {
		when(restriccion1.seCumple(LocalDate.of(2022, 10, 17))).thenReturn(false);
		when(restriccion2.seCumple(LocalDate.of(2022, 10, 17))).thenReturn(true);
		assertFalse(restriccionMixta.seCumple(LocalDate.of(2022, 10, 17)));
	}

}
