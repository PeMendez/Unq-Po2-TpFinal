package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

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

	@BeforeEach
	void setUp() throws Exception {
		recomendador = new Favorito();
		usuario = mock(Usuario.class);
		perfil = mock(Perfil.class);
		desafio1 = mock(Desafio.class);
		desafio2 = mock(Desafio.class);
		desafio3 = mock(Desafio.class);
		desafio4 = mock(Desafio.class);
		desafioUsuario = mock(DesafioUsuario.class);
		desafioUsuario2 = mock(DesafioUsuario.class);
		desafioUsuario3 = mock(DesafioUsuario.class);
		desafioUsuario4 = mock(DesafioUsuario.class);
		proyecto1 = mock(Proyecto.class);
		proyecto2 = mock(Proyecto.class);
		
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
	
}