package ar.edu.unq.po2.tpfinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.*;
import org.mockito.*;
import org.mockito.internal.util.collections.Sets;

import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.*;

public class SistemaTest {

	private Sistema admP; 
	@Mock private IncluyeTextoEnTitulo condicion;
	@Mock private Proyecto proyecto1, proyecto2, proyecto3;
	@Mock private Usuario usuario1, usuario2; 
	@Mock private Categoria cat1, cat2; 
	
	
	@BeforeEach	
	void setUp(){
		
		admP = new Sistema(); 
		
		condicion = mock(IncluyeTextoEnTitulo.class); 
		
		proyecto1 = mock(Proyecto.class); 
		proyecto2 = mock(Proyecto.class); 
		proyecto3 = mock(Proyecto.class); 
		
		usuario1 = mock(Usuario.class);
		usuario2 = mock(Usuario.class);
		
		cat1 = mock(Categoria.class); 
		cat2= mock(Categoria.class); 
	}
	
	@Test
	void testAddProyecto() {
		
		admP.addProyecto(proyecto1);
		admP.addProyecto(proyecto2);
		admP.addProyecto(proyecto3);
		admP.addProyecto(proyecto1);
		
		assertEquals(admP.getProyDisponibles().size(), 3); 		
	}
	
	@Test
	void testAddUsuario() {
		
		admP.addUsuario(usuario1);
		admP.addUsuario(usuario2);
		admP.addUsuario(usuario1);
		
		assertEquals(admP.getUsuarios().size(), 2); 		
	}
	
	@Test
	void testAddCategoria() {
		
		admP.addCategoria(cat1);
		admP.addCategoria(cat2);
		admP.addCategoria(cat2);
		
		assertEquals(admP.getCategoriasDisponibles().size(), 2); 		
	}
	
	@Test
	void testFiltrarProyectos() {
		
		List<Proyecto> filtrados = Arrays.asList(proyecto2, proyecto1); 
		
		when(condicion.seCumple(proyecto1)).thenReturn(true); 
		when(condicion.seCumple(proyecto2)).thenReturn(true); 
		when(condicion.seCumple(proyecto3)).thenReturn(false); 
		
		admP.addProyecto(proyecto1);
		admP.addProyecto(proyecto2);
		admP.addProyecto(proyecto3); 
		
		assertEquals(admP.filtrarProyectos(condicion), filtrados); 		
	}
	
	@Test 
	void testSetter() {
		
		Set<Proyecto> proyectos = Sets.newSet(proyecto1, proyecto2, proyecto3); 
		
		admP.setProyDisponibles(proyectos);
		
		assertEquals(admP.getProyDisponibles(), proyectos); 
	}
	
	@Test 
	void testDesuscribirUsuario() {
		
		Set<Usuario> usuarios = Sets.newSet(usuario1, usuario2);
		
		admP.setUsuarios(usuarios);
		
		assertEquals(admP.getUsuarios().size(), 2); 
		
		admP.removeUsuario(usuario1);
		
		assertEquals(admP.getUsuarios().size(), 1);
		
	}
	
	@Test 
	void testDesuscribirProyecto() {
		
		Set<Proyecto> proyectos = Sets.newSet(proyecto1, proyecto2, proyecto3); 
		
		admP.setProyDisponibles(proyectos);
		
		assertEquals(admP.getProyDisponibles().size(), 3); 
		
		admP.removeProyecto(proyecto1);
		
		assertEquals(admP.getProyDisponibles().size(), 2);
		
	}
	
	@Test 
	void testDesuscribirCategoria() {
		
		Set<Categoria> categorias = Sets.newSet(cat1, cat2); 
		
		admP.setCategoriasDisponibles(categorias);
		
		assertEquals(admP.getCategoriasDisponibles().size(), 2); 
		
		admP.removeCategoria(cat1);
		
		assertEquals(admP.getCategoriasDisponibles().size(), 1);
		
	}
}
