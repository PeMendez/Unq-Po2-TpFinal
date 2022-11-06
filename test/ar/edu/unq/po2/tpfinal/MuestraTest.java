package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.clasesBasicas.Coordenada;
import ar.edu.unq.po2.clasesBasicas.Muestra;
import ar.edu.unq.po2.clasesBasicas.Usuario;

class MuestraTest {

	private Muestra muestra;
	@Mock private Coordenada coordenada; 
	@Mock private Usuario usuario; 
	private LocalDate fecha; 
	private LocalTime hora;
	
	@BeforeEach
	public void setup() {
		fecha = LocalDate.of(2022, 5, 11);
		hora = LocalTime.of(15, 25);
		coordenada = mock(Coordenada.class);
		usuario = mock(Usuario.class);
		muestra = new Muestra(coordenada, usuario, fecha, hora);
	}
}
