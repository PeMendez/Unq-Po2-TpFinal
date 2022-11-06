package ar.edu.unq.po2.tpfinal;
	
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.*;

class CompositeANDTest {

		private AND compositeAND;
		private IncluyeTextoEnTitulo condicion1;
		private IncluyeCategorias condicion2;
		private Proyecto proyecto1, proyecto2, proyecto3;
		private Categoria cat1, cat2, cat3, cat4, cat5;
		private List<Categoria> categorias = new ArrayList<>();
		private List<Categoria> catproy1 = new ArrayList<>();
		private List<Categoria> catproy2 = new ArrayList<>();
		private List<Categoria> catproy3 = new ArrayList<>();
		private List<Proyecto> proyectos = new ArrayList<>();
		
		@BeforeEach
		void setUp() throws Exception {
			
//			admP = new AdministradorDeProyectos(); 
//			condicion1 = new IncluyeTextoEnTitulo("Java");
//			condicion2 = new IncluyeCategorias(categorias);
			
			condicion1 = mock(IncluyeTextoEnTitulo.class);
			condicion2 = mock(IncluyeCategorias.class);
			
			when(condicion1.getTextoABuscar()).thenReturn("Java");
			when(condicion2.getCategorias()).thenReturn(categorias);
			
			compositeAND = new AND(condicion1, condicion2);
			
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
			
			proyectos.add(proyecto1);
			proyectos.add(proyecto2);
			proyectos.add(proyecto3);
			
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
		void testANDCompositeTrue() {
			
			assertTrue(compositeAND.seCumple(proyecto1));
//			assertFalse(compositeAND.filtrarProyectos(admP).contains(proyecto3));
		}
		
		@Test
		void testANDCompositeFalse() {
			
			assertFalse(compositeAND.seCumple(proyecto2));
		}
}
