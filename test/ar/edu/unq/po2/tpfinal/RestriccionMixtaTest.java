package ar.edu.unq.po2.tpfinal;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import ar.edu.unq.po2.tpfinal.RestriccionTemporal.*;

class RestriccionMixtaTest {

	private RestriccionMixta restriccionMixta;
	@Mock private TipoDeRestriccion restriccion1;
	@Mock private TipoDeRestriccion restriccion2;
	private List<TipoDeRestriccion> restricciones;

	@BeforeEach
	void setUp() throws Exception {
		restriccion1=mock(TipoDeRestriccion.class);
		restriccion2=mock(TipoDeRestriccion.class);
		restricciones = new ArrayList<TipoDeRestriccion>();
		restriccionMixta = new RestriccionMixta(restricciones);
		restriccionMixta.getRestricciones().add(restriccion1);
		restriccionMixta.getRestricciones().add(restriccion2);
	}

	@Test
	void testEstaHabilitadoTrue() {
		
	}

	@Test
	void testEstaHabilitadoFalse() {
	}

}
