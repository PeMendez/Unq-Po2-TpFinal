package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

//import ar.edu.unq.po2.tpfinal.StateDesafios.*;

class ProyectoTest {

	private Proyecto proyect; //sut
	private String nombre1; 
	private String nombre2; 
	private String descripcion1;
	private String descripcion2;
	private Categoria categoria1;
	private Categoria categoria2;
	private Categoria categoria3;
	@Mock private Usuario participante1;
	@Mock private Usuario participante2;
	@Mock private Usuario participante3;
	@Mock private Muestra muestra1;
	@Mock private Muestra muestra2;
	@Mock private Muestra muestra3;
	@Mock private Desafio desafioU1;
	@Mock private Desafio desafioU2;
	@Mock private Desafio desafioU3;
	private List<Categoria> categorias;
	
	@BeforeEach
	public void setUp()  {
		proyect = new Proyecto(nombre1, descripcion1, categorias);
		nombre1 = "ProyectoPrueba";
		nombre2 = "ProyectoPrueba2";
		descripcion1 = "Ciencias naturales";
		descripcion2 = "Ciencias Sociales";
		categoria1 = mock(Categoria.class);
		categoria2 = mock(Categoria.class); 
		categoria3 = mock(Categoria.class);
		participante1 = mock(Usuario.class);
		participante2 = mock(Usuario.class);
		participante3 = mock(Usuario.class);
		muestra1 = mock(Muestra.class);
		muestra2 = mock(Muestra.class);
		muestra3 = mock(Muestra.class);
		desafioU1 = mock(Desafio.class);
		desafioU2 = mock(Desafio.class);
		desafioU3 = mock(Desafio.class);

	}

	//setter y getter
	
	@Test
	void testGetYSetNombre() {
		//setup
		
		//excercise
		proyect.setNombre("hola");
		//verify
		assertEquals("hola", proyect.getNombre());
	}
	
	@Test
	void testGetYSetCategorias() {
		//setup
		List<Categoria> categTest = Arrays.asList(categoria1,categoria2);
		//excercise
		proyect.setCategorias(categTest);
		//verify
		assertEquals(categTest, proyect.getCategorias());
	}	
	
	@Test
	void testGetMuestrasRecolectadas() {
		//setup
		proyect.addMuestra(muestra1);
		proyect.addMuestra(muestra2);
		List<Muestra> muestrasTest = Arrays.asList(muestra1,muestra2);
		//excercise
		proyect.getMuestrasRecolectadas();
		//verify
		assertEquals(muestrasTest,proyect.getMuestrasRecolectadas());
	}

	@Test
	void testGetParticipantes() {
		//setup
		proyect.addParticipante(participante1);
		proyect.addParticipante(participante2);
		List<Usuario> participanteTest = Arrays.asList(participante1,participante2);
		//excercise
		proyect.getParticipantes();
		//verify
		assertEquals(participanteTest,proyect.getParticipantes());
	}
	
	@Test
	void testAddMuestra() {
		//setup
		List<Muestra> muestrasTest = Arrays.asList(muestra1);
		//excercise
		proyect.addMuestra(muestra1);
		//verify
		assertEquals(muestrasTest,proyect.getMuestrasRecolectadas());
	}
	
	@Test
	void testAddParticipante() {
		//setup
		List<Usuario> participantesTest = Arrays.asList(participante1);
		//excercise
		proyect.addParticipante(participante1);
		//verify
		assertEquals(participantesTest,proyect.getParticipantes());
	}
	
	@Test
	void testRemoveParticipante() {
		//setup
		List<Usuario> participantesTest = Arrays.asList(participante2);
		//Exercise
		proyect.addParticipante(participante1);
		proyect.addParticipante(participante2);
		proyect.desuscribirParticipante(participante1);
		//verify
		assertEquals(participantesTest,proyect.getParticipantes());
	}

	@Test
	void testGetYSetDesafios() {
		//setup
		List<Desafio> desafiosTest = Arrays.asList(desafioU1,desafioU2);
		List<Desafio> desafiosEsperado = Arrays.asList(desafioU1,desafioU2);
		//Exercise
		proyect.setDesafios(desafiosTest);
		//verify
		assertEquals(desafiosEsperado,proyect.getDesafios());
	}
	
}
