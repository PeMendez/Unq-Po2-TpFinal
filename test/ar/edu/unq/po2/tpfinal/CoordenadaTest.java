package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CoordenadaTest {

	private Coordenada coordenada;
	private int x;
	private int y;
	
	@BeforeEach
	public void setup() {
		x = 5;
		y = 6;
		coordenada = new Coordenada(x, y);
	}

	@Test
	void testGetX() {
		//setup
		//exercise
		//verify
		assertEquals(5,coordenada.getLatitud());
	}
	
	@Test
	void testGetY() {
		//setup
		//exercise
		//verify
		assertEquals(6,coordenada.getLongitud());
	}
	
}
