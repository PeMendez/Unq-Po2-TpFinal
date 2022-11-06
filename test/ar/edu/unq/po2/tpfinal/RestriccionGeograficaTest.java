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
