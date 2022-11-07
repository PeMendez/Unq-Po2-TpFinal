package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.tpfinal.StateDesafios.*;

//import ar.edu.unq.po2.tpfinal.RestriccionTemporal.TipoDeRestriccion;

public class DesafioUsuarioTest {

	@Mock private Usuario usuario; 
	@Mock private Usuario usuario2; 
	@Mock private Desafio desafio; 
	@Mock private Desafio desafio2; 
	@Mock private EstadoDesafio estado; 
	@Mock private EstadoDesafio estado2; 
	private Integer valoracion; 
	private LocalDate fechaInicio;
	private DesafioUsuario desafioU; // sut
	
	@BeforeEach
	public void setup() {
		usuario = mock(Usuario.class);
		usuario2 = mock(Usuario.class);
		desafio = mock(Desafio.class);
		desafio2 = mock(Desafio.class);
		estado = mock(EstadoDesafio.class);
		estado2 = mock(EstadoDesafio.class);
		desafioU = new DesafioUsuario(usuario, desafio);
	}

	@Test
	void testCantidadMuestrasValidas() {
		//setup
		//exercise
		desafioU.cantidadDeMuestrasValidas();
		//verify
		verify(usuario).getMuestras();
	}
	
	@Test
	void testGetYSetUsuario() {
		//setup
		//exercise
		desafioU.setUsuario(usuario2);
		//verify
		assertEquals(usuario2,desafioU.getUsuario());
	}
	
	@Test
	void testGetYSetDesafio() {
		//setup
		//exercise
		desafioU.setDesafio(desafio2);
		//verify
		assertEquals(desafio2,desafioU.getDesafio());
	}	
	
	@Test
	void testGetYSetEstado() {
		//setup
		//exercise
		desafioU.setEstado(estado2);
		//verify
		assertEquals(estado2,desafioU.getEstado());
	}
	
	@Test
	void testGetYSetValoracion() {
		//setup
		valoracion = 2;
		//exercise
		desafioU.setValoracion(valoracion);
		//verify
		assertEquals(valoracion,desafioU.getValoracion());
	}
	
	@Test
	void testGetYSetFechaInicio() {
		//setup
		fechaInicio = LocalDate.of(2022, 5, 11);
		//exercise
		desafioU.setFechaInicio(fechaInicio);
		//verify
		assertEquals(fechaInicio,desafioU.getFechaInicio());
	}
	
	@Test
	void testSerAceptado() throws Exception {
		//setup
		desafioU.setEstado(estado);
		//exercise
		desafioU.serAceptado();
		//verify
		verify(estado).serAceptado(desafioU);
	}
}
