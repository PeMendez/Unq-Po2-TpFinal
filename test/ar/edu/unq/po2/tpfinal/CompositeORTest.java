package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

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
//	@Mock
//	private Categoria cat1, cat2, cat3, cat4, cat5;
//	private List<Categoria> categorias = new ArrayList<Categoria>();
//	private List<Categoria> catproy1 = new ArrayList<Categoria>();
//	private List<Categoria> catproy2 = new ArrayList<Categoria>();
//	private List<Categoria> catproy3 = new ArrayList<Categoria>();

	@BeforeEach
	void setUp() throws Exception {

//		condicion1 = new IncluyeTextoEnTitulo("Java");
//		condicion2 = new IncluyeCategorias(categorias);

		condicion1 = mock(IncluyeTextoEnTitulo.class);
		condicion2 = mock(IncluyeCategorias.class);
//
//		cat1 = mock(Categoria.class);
//		cat2 = mock(Categoria.class);
//		cat3 = mock(Categoria.class);
//		cat4 = mock(Categoria.class);
//		cat5 = mock(Categoria.class);

		proyecto1 = mock(Proyecto.class);
//		proyecto2 = mock(Proyecto.class);
//		proyecto3 = mock(Proyecto.class);

//		when(cat1.getNombre()).thenReturn("Geologia");
//		when(cat2.getNombre()).thenReturn("Ingenieria Computacional");
//		when(cat3.getNombre()).thenReturn("Programación");
//		when(cat4.getNombre()).thenReturn("Fisica Cuantica");
//		when(cat5.getNombre()).thenReturn("BioInformática");
//
//		when(proyecto1.getCategorias()).thenReturn(catproy1);
//		when(proyecto2.getCategorias()).thenReturn(catproy2);
//		when(proyecto3.getCategorias()).thenReturn(catproy3);
//
//		when(proyecto1.getNombre()).thenReturn("Programacion con Java");
//		when(proyecto2.getNombre()).thenReturn("Arboles Binarios");
//		when(proyecto3.getNombre()).thenReturn("Java and C++");

//		when(condicion1.getTextoABuscar()).thenReturn("Java");
//		when(condicion2.getCategorias()).thenReturn(categorias);

//		catproy1.add(cat1);
//		catproy1.add(cat3);
//		catproy2.add(cat2);
//		catproy3.add(cat3);
//		catproy3.add(cat4);
//		catproy3.add(cat5);
//
//		categorias.add(cat1);
//		categorias.add(cat3);

		compositeOR = new OR(condicion1, condicion2);

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
