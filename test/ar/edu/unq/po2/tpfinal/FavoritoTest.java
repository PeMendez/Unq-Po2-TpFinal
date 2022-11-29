package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.internal.util.collections.Sets;

import ar.edu.unq.po2.tpfinal.StateDesafios.*;
import ar.edu.unq.po2.tpfinal.StrategyRecomendacion.*;


public class FavoritoTest {
	
	private Favorito recomendador;
	@Mock
	private Usuario usuario;
	@Mock
	private Perfil perfil;
	@Mock
	private Desafio desafio1;
	@Mock
	private Desafio desafio2;
	@Mock
	private Desafio desafio3;
	@Mock
	private Desafio desafio4;
	@Mock
	private Desafio desafio5;
	@Mock
	private Desafio desafio6;
	
	@Mock
	private DesafioUsuario desafioUsuario;
	@Mock 
	private DesafioUsuario desafioUsuario2; 
	@Mock
	private DesafioUsuario desafioUsuario3;
	@Mock 
	private DesafioUsuario desafioUsuario4;
	@Mock 
	private Proyecto proyecto1;
	@Mock 
	private Proyecto proyecto2;
	@Mock 
	private Sistema sistema; 

	@BeforeEach
	void setUp() throws Exception {
		recomendador = new Favorito();
		usuario = mock(Usuario.class);
		perfil = mock(Perfil.class);
		desafio1 = mock(Desafio.class);
		desafio2 = mock(Desafio.class);
		desafio3 = mock(Desafio.class);
		desafio4 = mock(Desafio.class);
		desafio5 = mock(Desafio.class);
		desafio6 = mock(Desafio.class);
		desafioUsuario = mock(DesafioUsuario.class);
		desafioUsuario2 = mock(DesafioUsuario.class);
		desafioUsuario3 = mock(DesafioUsuario.class);
		desafioUsuario4 = mock(DesafioUsuario.class);
		proyecto1 = mock(Proyecto.class);
		proyecto2 = mock(Proyecto.class);
		sistema = mock(Sistema.class); 

		when(desafioUsuario.getValoracion()).thenReturn(5);		
		when(desafioUsuario.getDesafio()).thenReturn(desafio1);
		
		when(perfil.getCantMuestrasARecolectar()).thenReturn(15);
		when(perfil.getDificultad()).thenReturn(2);
		when(perfil.getRecompensasPreferidas()).thenReturn(25);
		
		when(desafio1.getCantidadDeMuestras()).thenReturn(30);
		when(desafio1.getDificultad()).thenReturn(5);
		when(desafio1.getRecompensa()).thenReturn(10);
		
		when(desafio2.getCantidadDeMuestras()).thenReturn(30);
		when(desafio2.getDificultad()).thenReturn(6);
		when(desafio2.getRecompensa()).thenReturn(10);
		
		when(desafio3.getCantidadDeMuestras()).thenReturn(30);
		when(desafio3.getDificultad()).thenReturn(4);
		when(desafio3.getRecompensa()).thenReturn(10);
		
		when(desafio4.getCantidadDeMuestras()).thenReturn(30);
		when(desafio4.getDificultad()).thenReturn(7);
		when(desafio4.getRecompensa()).thenReturn(10);
		
		when(desafio5.getCantidadDeMuestras()).thenReturn(30);
		when(desafio5.getDificultad()).thenReturn(8);
		when(desafio5.getRecompensa()).thenReturn(10);
		
		when(desafio6.getCantidadDeMuestras()).thenReturn(30);
		when(desafio6.getDificultad()).thenReturn(9);
		when(desafio6.getRecompensa()).thenReturn(10);
		
		when(usuario.getPerfil()).thenReturn(perfil); 
		
		when(proyecto1.getDesafios()).thenReturn(Arrays.asList(desafio1, desafio2, desafio3)); 
		when(proyecto2.getDesafios()).thenReturn(Arrays.asList(desafio4, desafio5, desafio6)); 
		
		when(sistema.getProyDisponibles()).thenReturn(Sets.newSet(proyecto1, proyecto2)); 
	}

	@Test
	void testeDesafioFavorito() {
		
		List<DesafioUsuario> desafiosUsuario = Arrays.asList(desafioUsuario, desafioUsuario2); 
		
		when(desafioUsuario.getDesafio()).thenReturn(desafio1); 
		when(desafioUsuario2.getDesafio()).thenReturn(desafio2); 
		
		when(desafioUsuario.getValoracion()).thenReturn(5); 
		when(desafioUsuario2.getValoracion()).thenReturn(1); 
		
		when(usuario.getDesafiosUsuario()).thenReturn(desafiosUsuario);
		
		assertEquals(recomendador.desafioFavoritoDe(usuario), desafio1); 
	}
	
	
//	@Test
//	void testDesafiosSegunUsuario() {
//		// set up 
//		List<Desafio> desafiosProyecto1 = Arrays.asList(desafio1, desafio2, desafio3); 
//		List<Desafio> desafiosProyecto2 = Arrays.asList(desafio4, desafio5, desafio6); 
//		//exercise
//		
//		when(proyecto1.getDesafios()).thenReturn(desafiosProyecto1); 
//		when(proyecto2.getDesafios()).thenReturn(desafiosProyecto2);		
//		
//		when(usuario.getProyectos()).thenReturn(Arrays.asList(proyecto1, proyecto2)); 
//
//		
//		assertEquals(recomendador.desafiosSegunUsuario(usuario).size(), 6); 
//	}

	@Test
	void testDesafiosARecomendar() {
		
//		List<DesafioUsuario> desafiosDelUsuario = new ArrayList<DesafioUsuario>();
//
//		when(usuario.getDesafiosUsuario()).thenReturn(desafiosDelUsuario);
//		desafiosDelUsuario.add(desafioUsuario);
//		
//		
//		List<Desafio> desafiosProyecto1 = Arrays.asList(desafio1, desafio2, desafio3, desafio4, desafio5, desafio6); 
//		
//		when(proyecto1.getDesafios()).thenReturn(desafiosProyecto1); 		
//		
//		when(usuario.getProyectos()).thenReturn(Arrays.asList(proyecto1, proyecto2)); 

		
		assertEquals(5, recomendador.desafiosRecomendados(usuario,sistema).size()); 
	}
	
}