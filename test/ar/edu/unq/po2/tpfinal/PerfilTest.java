package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.tpfinal.StrategyRecomendacion.*;

class PerfilTest {

	private Perfil perfil; // sut

	
	@Mock private RecomendadorDesafios tipoDeRecomendacion;
	@Mock private RecomendadorDesafios tipoDeRecomendacion2;
	
	@BeforeEach
	public void setup() {
		perfil = new Perfil(10, 4, 30, tipoDeRecomendacion);
		tipoDeRecomendacion = mock(RecomendadorDesafios.class);
		tipoDeRecomendacion2 = mock(RecomendadorDesafios.class);
	}

	@Test
	void testGetCantMuestrasARecolectar() {
		//setup
		
		//exercise
		
		//verify
		assertEquals(10,perfil.getCantMuestrasARecolectar());
	}

	@Test
	void testSetCantMuestrasARecolectar() {
		//setup
		
		//exercise
		perfil.setCantMuestrasARecolectar(7);
		//verify
		assertEquals(7,perfil.getCantMuestrasARecolectar());
	}

	@Test
	void testGetDificultad() {
		//setup
		
		//exercise
		
		//verify
		assertEquals(4,perfil.getDificultad());
	}

	@Test
	void testSetDificultad() {
		//setup
		
		//exercise
		perfil.setDificultad(2);
		//verify
		assertEquals(2,perfil.getDificultad());
	}

	@Test
	void testGetRecompensasPreferidas() {
		//setup
		
		//exercise
		perfil.getRecompensasPreferidas();
		//verify
		assertEquals(30,perfil.getRecompensasPreferidas());
	}

	@Test
	void testSetRecompensasPreferidas() {
		//setup
		
		//exercise
		perfil.setRecompensasPreferidas(99);
		//verify
		assertEquals(99,perfil.getRecompensasPreferidas());
	}

	@Test
	void testGetTipoDeRecomendacion() {
		//setup
		
		//exercise
		perfil.setTipoDeRecomendacion(tipoDeRecomendacion);
		//verify
		assertEquals(tipoDeRecomendacion,perfil.getTipoDeRecomendacion());
	}
	
	@Test
	void testSetTipoDeRecomendacion() {
		//setup
		
		//exercise
		perfil.setTipoDeRecomendacion(tipoDeRecomendacion2);
		//verify
		assertEquals(tipoDeRecomendacion2,perfil.getTipoDeRecomendacion());
	}
	
}
