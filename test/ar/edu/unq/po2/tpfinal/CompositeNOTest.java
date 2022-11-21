package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.util.collections.Sets;

import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.*;

public class CompositeNOTest {

	private Negacion compositeNOT;
	private IncluyeTextoEnTitulo condicion;
	private Proyecto proyecto1, proyecto2, proyecto3;


	@BeforeEach
	void setUp() throws Exception {
		
		condicion = new IncluyeTextoEnTitulo("Java"); 
		
		proyecto1 = mock(Proyecto.class);
		proyecto2 = mock(Proyecto.class);
		proyecto3 = mock(Proyecto.class);
		
		compositeNOT = new Negacion(condicion);
		
		when(proyecto1.getNombre()).thenReturn("Programacion con Java");
		when(proyecto2.getNombre()).thenReturn("Arboles Binarios");
		when(proyecto3.getNombre()).thenReturn("Java and C++");
	}
	
	@Test 
	void testNegacion() {
		
		Set<Proyecto> proyectos = Sets.newSet(proyecto1, proyecto2, proyecto3);
		
		List<Proyecto> filtrados = Arrays.asList(proyecto2); 
		
		assertEquals(compositeNOT.filtrarProyectos(proyectos), filtrados); 
		
	}
}
