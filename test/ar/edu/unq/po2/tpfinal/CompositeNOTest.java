package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.*;

public class CompositeNOTest {

	private Negacion compositeNOT;
	private IncluyeTextoEnTitulo condicion;
	private Proyecto proyecto1;

	@BeforeEach
	void setUp() throws Exception {
		condicion = mock(IncluyeTextoEnTitulo.class);
		proyecto1 = mock(Proyecto.class);
		compositeNOT = new Negacion(condicion);
	}

	@Test
	void testSeCumpleTrue() {
		when(condicion.seCumple(proyecto1)).thenReturn(false);
		assertTrue(compositeNOT.seCumple(proyecto1));
	}

	@Test
	void testSeCumpleFalse() {
		when(condicion.seCumple(proyecto1)).thenReturn(true);
		assertFalse(compositeNOT.seCumple(proyecto1));
	}

}
