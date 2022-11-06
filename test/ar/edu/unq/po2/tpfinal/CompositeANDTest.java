package ar.edu.unq.po2.tpfinal;
	
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.*;

class CompositeANDTest {

	private AND compositeAND;
	@Mock
	private IncluyeTextoEnTitulo condicion1;
	@Mock
	private IncluyeCategorias condicion2;
	@Mock
	private Proyecto proyecto1, proyecto2, proyecto3;

	@BeforeEach
	void setUp() throws Exception {

		condicion1 = mock(IncluyeTextoEnTitulo.class);
		condicion2 = mock(IncluyeCategorias.class);
		proyecto1 = mock(Proyecto.class);
		compositeAND = new AND(condicion1, condicion2);
	}

	@Test
	void testORCompositeAmbasTrue() {

		when(condicion1.seCumple(proyecto1)).thenReturn(true);
		when(condicion2.seCumple(proyecto1)).thenReturn(true);
		assertTrue(compositeAND.seCumple(proyecto1));
	}

	@Test
	void testORCompositeCondicion1True() {

		when(condicion1.seCumple(proyecto1)).thenReturn(true);
		when(condicion2.seCumple(proyecto1)).thenReturn(false);
		assertFalse(compositeAND.seCumple(proyecto1));
	}

	@Test
	void testORCompositeCondicion2True() {

		when(condicion1.seCumple(proyecto1)).thenReturn(false);
		when(condicion2.seCumple(proyecto1)).thenReturn(true);
		assertFalse(compositeAND.seCumple(proyecto1));
	}

	@Test
	void testORCompositeFalse() {

		when(condicion1.seCumple(proyecto1)).thenReturn(false);
		when(condicion2.seCumple(proyecto1)).thenReturn(false);
		assertFalse(compositeAND.seCumple(proyecto1));

	}
}
