<<<<<<< HEAD
<<<<<<< HEAD
package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.clasesBasicas.RestriccionGeografica;

class RestriccionGeograficaTest {

	private RestriccionGeografica restriccionG;
	private int latitud;
	private int longitud;
	private int radio;
	
	@BeforeEach
	public void setup() {
		latitud = 30;
		longitud = 10;
		radio = 4;
		restriccionG = new RestriccionGeografica(latitud, longitud, radio);
	}
	
}
=======
package ar.edu.unq.po2.tpfinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class RestriccionGeograficaTest {

	private RestriccionGeografica restriccion;
	@Mock
	private Coordenada coordenada1;
	@Mock
	private Coordenada coordenada2;

	@BeforeEach
	void setUp() throws Exception {
		coordenada1 = mock(Coordenada.class);
		coordenada2 = mock(Coordenada.class);
		restriccion = new RestriccionGeografica(5, 5, 5);
	}

	@Test
	void testEstaHabilitadoTrue() {
		// set up
		when(coordenada1.getX()).thenReturn(4);
		when(coordenada1.getY()).thenReturn(4);
		when(coordenada2.getX()).thenReturn(5);
		when(coordenada2.getY()).thenReturn(5);

		// verify
		assertTrue(restriccion.contiene(coordenada1));
		assertTrue(restriccion.contiene(coordenada2));
	}

	@Test
	void testEstaHabilitadoFalse() {
		// set up
		when(coordenada2.getX()).thenReturn(6);
		when(coordenada2.getY()).thenReturn(6);

		// verify
		assertFalse(restriccion.contiene(coordenada1));
	}

}
>>>>>>> branch 'main' of https://github.com/PeMendez/Unq-Po2-TpFinal.git
=======
package ar.edu.unq.po2.tpfinal;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class RestriccionGeograficaTest {

	private RestriccionGeografica restriccion;
	@Mock
	private Coordenada coordenada1;
	@Mock
	private Coordenada coordenada2;

	@BeforeEach
	void setUp() throws Exception {
		coordenada1 = mock(Coordenada.class);
		coordenada2 = mock(Coordenada.class);
		restriccion = new RestriccionGeografica(5, 5, 5);
	}

	@Test
	void testContieneTrue() {
		// set up
		when(coordenada1.getX()).thenReturn(4);
		when(coordenada1.getY()).thenReturn(4);
		when(coordenada2.getX()).thenReturn(5);
		when(coordenada2.getY()).thenReturn(5);

		// verify
		assertTrue(restriccion.contiene(coordenada1));
		assertTrue(restriccion.contiene(coordenada2));
	}

	@Test
	void testContieneFalse() {
		// set up
		when(coordenada2.getX()).thenReturn(6);
		when(coordenada2.getY()).thenReturn(6);

		// verify
		assertFalse(restriccion.contiene(coordenada1));
	}

}
>>>>>>> branch 'main' of https://github.com/PeMendez/Unq-Po2-TpFinal.git
