package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.*;

public class CompositeORTest {

	private OR compositeOR;
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
		compositeOR = new OR(condicion1, condicion2);
	}

	@Test
	void testORCompositeAmbasTrue() {

		when(condicion1.seCumple(proyecto1)).thenReturn(true);
		when(condicion2.seCumple(proyecto1)).thenReturn(false);
		assertTrue(compositeOR.seCumple(proyecto1));
	}

	@Test
	void testORCompositeCondicion1True() {

		when(condicion1.seCumple(proyecto1)).thenReturn(true);
		when(condicion2.seCumple(proyecto1)).thenReturn(false);
		assertTrue(compositeOR.seCumple(proyecto1));
	}

	@Test
	void testORCompositeCondicion2True() {

		when(condicion1.seCumple(proyecto1)).thenReturn(false);
		when(condicion2.seCumple(proyecto1)).thenReturn(true);
		assertTrue(compositeOR.seCumple(proyecto1));
	}

	@Test
	void testORCompositeFalse() {

		when(condicion1.seCumple(proyecto1)).thenReturn(false);
		when(condicion2.seCumple(proyecto1)).thenReturn(false);
		assertFalse(compositeOR.seCumple(proyecto1));

	}
}
