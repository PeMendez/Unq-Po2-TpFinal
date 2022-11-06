package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

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
}
