package ar.edu.unq.po2.tpfinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.*;
import org.mockito.*;

import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.*;

public class AdministradorDeProyectosTest {

	private AdministradorDeProyectos admP; 
	@Mock private IncluyeTextoEnTitulo condicion;
	@Mock private Proyecto proyecto1, proyecto2, proyecto3;
	
	@BeforeEach	
	void setUp(){
		
		admP = new AdministradorDeProyectos(); 
		
		condicion = mock(IncluyeTextoEnTitulo.class); 
		
		proyecto1 = mock(Proyecto.class); 
		proyecto2 = mock(Proyecto.class); 
		proyecto3 = mock(Proyecto.class); 

	}
	
	@Test
	void testAdd() {
		
		admP.addProyecto(proyecto1);
		admP.addProyecto(proyecto2);
		admP.addProyecto(proyecto3);
		
		assertTrue(admP.getProyDisponibles().size() == 3); 		
	}
	
	@Test
	void testFiltrarProyectos() {
		
		List<Proyecto> filtrados = Arrays.asList(proyecto1, proyecto2); 
		
		when(condicion.seCumple(proyecto1)).thenReturn(true); 
		when(condicion.seCumple(proyecto2)).thenReturn(true); 
		when(condicion.seCumple(proyecto3)).thenReturn(false); 
		
		admP.addProyecto(proyecto1);
		admP.addProyecto(proyecto2);
		admP.addProyecto(proyecto3);
		
		admP.filtrarProyectos(condicion); 
		
		assertEquals(admP.filtrarProyectos(condicion), filtrados); 		
	}
}
