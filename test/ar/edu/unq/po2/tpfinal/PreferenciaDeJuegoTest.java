package ar.edu.unq.po2.tpfinal;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.tpfinal.StateDesafios.DesafioUsuario;
import ar.edu.unq.po2.tpfinal.StrategyRecomendacion.PreferenciaDeJuego;

class PreferenciaDeJuegoTest {

	private PreferenciaDeJuego recomendador;
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
	private Proyecto proyecto1;
	@Mock 
	private Proyecto proyecto2;


	@BeforeEach
	void setUp() throws Exception {
		recomendador = new PreferenciaDeJuego();
		usuario = mock(Usuario.class);
		perfil = mock(Perfil.class);
		desafio1 = mock(Desafio.class);
		desafio2 = mock(Desafio.class);
		desafio3 = mock(Desafio.class);
		desafio4 = mock(Desafio.class);
		desafio5 = mock(Desafio.class);
		desafio6 = mock(Desafio.class);
		desafioUsuario = mock(DesafioUsuario.class);
		proyecto1 = mock(Proyecto.class);
		proyecto2 = mock(Proyecto.class);
	}

	@Test
	void testOrdenarPorCoincidencia() {
		// set up
		when(usuario.getPerfil()).thenReturn(perfil);
		
		when(desafio1.getDificultad()).thenReturn(5);
		when(desafio1.getCantidadDeMuestras()).thenReturn(10);
		when(desafio1.getRecompensa()).thenReturn(100);
		
		when(desafio2.getDificultad()).thenReturn(2);
		when(desafio2.getCantidadDeMuestras()).thenReturn(19);
		when(desafio2.getRecompensa()).thenReturn(79);
		
		when(perfil.getDificultad()).thenReturn(3);
		when(perfil.getCantMuestrasARecolectar()).thenReturn(20);
		when(perfil.getRecompensasPreferidas()).thenReturn(80);
		
		List<Desafio> desafiosAOrdenar = new ArrayList<Desafio>();
		List<Desafio> desafiosOrdenados = new ArrayList<Desafio>();

		// exercise
		desafiosAOrdenar.add(desafio1);
		desafiosAOrdenar.add(desafio2);
		desafiosOrdenados = recomendador.ordenarPorCoincidencia(desafiosAOrdenar, usuario);
		Integer coincidecia1ro = recomendador.coincidenciaCon(perfil, desafiosOrdenados.get(0));
		Integer coincidecia2do = recomendador.coincidenciaCon(perfil, desafiosOrdenados.get(1));

		// verify
		assertTrue(coincidecia1ro < coincidecia2do);
	}

	@Test
	void testConcidenciaCon() {
		// set up
		when(desafio1.getDificultad()).thenReturn(5);
		when(desafio1.getCantidadDeMuestras()).thenReturn(10);
		when(desafio1.getRecompensa()).thenReturn(100);
		when(perfil.getDificultad()).thenReturn(3);
		when(perfil.getCantMuestrasARecolectar()).thenReturn(20);
		when(perfil.getRecompensasPreferidas()).thenReturn(80);

		// verify
		assertEquals(32, recomendador.coincidenciaCon(perfil, desafio1));
	}
	
	@Test
	void testDesafiosARecomendar() {
		
		List<DesafioUsuario> desafiosDelUsuario = new ArrayList<DesafioUsuario>();

		when(desafioUsuario.getValoracion()).thenReturn(5);		
		when(desafioUsuario.getDesafio()).thenReturn(desafio1);
		when(usuario.getDesafiosUsuario()).thenReturn(desafiosDelUsuario);
		desafiosDelUsuario.add(desafioUsuario);
		
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
		
		List<Desafio> desafiosProyecto1 = Arrays.asList(desafio1, desafio2, desafio3, desafio4, desafio5, desafio6); 
		
		when(proyecto1.getDesafios()).thenReturn(desafiosProyecto1); 		
		
		when(usuario.getProyectos()).thenReturn(Arrays.asList(proyecto1, proyecto2)); 

		
		assertEquals(5, recomendador.desafiosRecomendados(usuario).size()); 
	}
	
}
