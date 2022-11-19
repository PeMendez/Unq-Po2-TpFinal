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
	private Restriccion restriccion1;
	@Mock
	private Restriccion restriccion2;
	private List<Restriccion> restricciones;

	@BeforeEach
	void setUp() throws Exception {
		restriccion1 = mock(Restriccion.class);
		restriccion2 = mock(Restriccion.class);
		restricciones = new ArrayList<Restriccion>();
		restriccionMixta = new RestriccionMixta(restricciones);
		restriccionMixta.getRestricciones().add(restriccion1);
		restriccionMixta.getRestricciones().add(restriccion2);
	}

	@Test
	void testEstaHabilitadoTrue() {
		when(restriccion1.estaHabilitado(LocalDate.of(2022, 10, 17))).thenReturn(true);
		when(restriccion2.estaHabilitado(LocalDate.of(2022, 10, 17))).thenReturn(true);
		assertTrue(restriccionMixta.estaHabilitado(LocalDate.of(2022, 10, 17)));
	}

	@Test
	void testEstaHabilitadoFalse() {
		when(restriccion1.estaHabilitado(LocalDate.of(2022, 10, 17))).thenReturn(false);
		when(restriccion2.estaHabilitado(LocalDate.of(2022, 10, 17))).thenReturn(true);
		assertFalse(restriccionMixta.estaHabilitado(LocalDate.of(2022, 10, 17)));
	}

}
