package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.*;
import org.mockito.internal.util.collections.Sets;

import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.*;

public class ExcluyeCategoriasTest {
	
	private ExcluyeCategorias excluyeCategorias;
	private Proyecto proyecto1, proyecto2, proyecto3;
	private Categoria cat1, cat2, cat3, cat4, cat5;
	private List<Categoria> categorias = new ArrayList<>();
	private List<Categoria> catproy1 = new ArrayList<>();
	private List<Categoria> catproy2 = new ArrayList<>();
	private List<Categoria> catproy3 = new ArrayList<>();

	@BeforeEach
	void setUp() throws Exception {
		
		excluyeCategorias = new ExcluyeCategorias(categorias);
	
		proyecto1 = mock(Proyecto.class);
		proyecto2 = mock(Proyecto.class);
		proyecto3 = mock(Proyecto.class);
		
		cat1 = mock(Categoria.class);
		cat2 = mock(Categoria.class);
		cat3 = mock(Categoria.class);
		cat4 = mock(Categoria.class);
		cat5 = mock(Categoria.class);
		
		when(cat1.getNombre()).thenReturn("Geologia");
		when(cat2.getNombre()).thenReturn("Ingenieria Computacional");
		when(cat3.getNombre()).thenReturn("Programación");
		when(cat4.getNombre()).thenReturn("Fisica Cuantica");
		when(cat5.getNombre()).thenReturn("BioInformática");
		

		catproy1.add(cat1);
		catproy1.add(cat3);
		when(proyecto1.getCategorias()).thenReturn(catproy1);
		
		catproy2.add(cat2);
		when(proyecto2.getCategorias()).thenReturn(catproy2);
	
		catproy3.add(cat3);
		catproy3.add(cat4);
		catproy3.add(cat5);
		when(proyecto3.getCategorias()).thenReturn(catproy3);
		
		categorias.add(cat1);
		categorias.add(cat3);
		when(proyecto1.getNombre()).thenReturn("Programacion con Java");
		when(proyecto2.getNombre()).thenReturn("Arboles Binarios");
		when(proyecto3.getNombre()).thenReturn("Java and C++");
		 
	}

	@Test 
	void testExcluyeCategorias() {
		
		Set<Proyecto> proyectos = Sets.newSet(proyecto1, proyecto2, proyecto3);
		
		List<Proyecto> filtrados = Arrays.asList(proyecto2); 
		
		assertEquals(excluyeCategorias.filtrarProyectos(proyectos), filtrados); 
	}

}
