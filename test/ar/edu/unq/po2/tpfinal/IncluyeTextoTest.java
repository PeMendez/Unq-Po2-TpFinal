package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.*;
import org.mockito.internal.util.collections.Sets;

import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.*;

public class IncluyeTextoTest {

	private IncluyeTextoEnTitulo incluyeTexto;
	private Proyecto proyecto1, proyecto2, proyecto3;

	@BeforeEach
	void setUp() throws Exception {
		 
		incluyeTexto = new IncluyeTextoEnTitulo("Java");
	
		proyecto1 = mock(Proyecto.class);
		proyecto2 = mock(Proyecto.class);
		proyecto3 = mock(Proyecto.class);

		when(proyecto1.getNombre()).thenReturn("Programacion con Java");
		when(proyecto2.getNombre()).thenReturn("Arboles Binarios");
		when(proyecto3.getNombre()).thenReturn("Java and C++");
	}

	@Test 
	void testIncluyeTexto() {
		
		Set<Proyecto> proyectos = Sets.newSet(proyecto1, proyecto2, proyecto3);
		
		List<Proyecto> filtrados = Arrays.asList(proyecto1, proyecto3); 
		
		assertEquals(incluyeTexto.filtrarProyectos(proyectos), filtrados); 
	}
	
	
	@Test
	void testORCompositeTrue() {
		
		assertTrue(incluyeTexto.seCumple(proyecto1));
		assertTrue(incluyeTexto.seCumple(proyecto3));
	}

	@Test
	void testORCompositeFalse() {
		
		assertFalse(incluyeTexto.seCumple(proyecto2));

	}
}
