package ar.edu.unq.po2.tpfinal;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
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
	private DesafioUsuario desafioUsuario;

	@BeforeEach
	void setUp() throws Exception {
		recomendador = new PreferenciaDeJuego();
		usuario = mock(Usuario.class);
		perfil = mock(Perfil.class);
		desafio1 = mock(Desafio.class);
		desafio2 = mock(Desafio.class);
		desafioUsuario = mock(DesafioUsuario.class);
	}

	@Test
	void testDesafiosARecomendar() {
		// set up
		List<Desafio> desafiosDelUsuario = new ArrayList<Desafio>();
		List<Desafio> desafiosYaTomados = new ArrayList<Desafio>();
		
		//exercise
		desafiosDelUsuario.add(desafio1);
		desafiosDelUsuario.add(desafio2);

		when(recomendador.desafiosSegunUsuario(usuario)).thenReturn(desafiosDelUsuario);

		fail("Not yet implemented");
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
}
