package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import ar.edu.unq.po2.clasesBasicas.Categoria;
import ar.edu.unq.po2.clasesBasicas.Desafio;
import ar.edu.unq.po2.clasesBasicas.Muestra;
import ar.edu.unq.po2.clasesBasicas.Proyecto;
import ar.edu.unq.po2.clasesBasicas.Usuario;
import ar.edu.unq.po2.clasesBasicas.StateDesafios.DesafioUsuario;
import ar.edu.unq.po2.tpfinal.StateDesafios.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

//import ar.edu.unq.po2.tpfinal.StateDesafios.*;

class UsuarioTest {

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

	@Test
	void testSuscribirseAProyecto() {
		//setup
		List<Proyecto> proyectosSuscriptos = Arrays.asList(proyecto1);
		//excercise
		user.suscribirse(proyecto1); 
		//verify
		assertEquals(proyectosSuscriptos,user.getProyectos());

		verify(proyecto1).addParticipante(user);
	}
	
	@Test
	void testAceptarDesafio() {
		//setup
		//excercise
		user.aceptarDesafio(desafiosUsuario1); 
		//verify
		verify(desafiosUsuario1).serAceptado();
	}
	
	//TODO este test no esta ok
	//@Test //ver como testeo este mensaje
	void testDesafiosRecomendados() {
		//setup
		List<DesafioUsuario> desafioRecomendado = Arrays.asList(desafiosUsuario1);
		//excercise
		user.desafiosRecomendados(); 
		//verify
		verify(perfilUser,times(1)).getTipoDeRecomendacion();
	}
	
	@Test
	void testValorarDesafio() {
		//setup
		List<DesafioUsuario> desafioRecomendado = Arrays.asList(desafiosUsuario1);
		user.setDesafiosUsuario(desafioRecomendado);
		//excercise
		user.valorarDesafio(desafiosUsuario1, 100); 
		//verify
		assertEquals(desafioRecomendado,user.getDesafiosUsuario());
		verify(desafiosUsuario1).setValoracion(100);
	}
	
	@Test
	void testDesafioFavorito() {
		//setup
		List<DesafioUsuario> desafios1Y2 = Arrays.asList(desafiosUsuario1,desafiosUsuario2);
		user.setDesafiosUsuario(desafios1Y2);
		//excercise
		user.desafioFavorito(); 
		//verify
		verify(desafiosUsuario1).getValoracion();
		verify(desafiosUsuario2).getValoracion();
	}

	//Test Getters y Setters
	
	@Test
	void testGetYSetPerfil() {
		//excercise
		user.setPerfil(perfilUser2);
		//excercise y verify
		assertEquals(perfilUser2,user.getPerfil());
	}	
	
	@Test
	void testGetYSetProyectos() {
		//setup
		List<Proyecto> proyectosSuscriptos = Arrays.asList(proyecto1,proyecto2);
		//excercise
		user.setProyectos(proyectosSuscriptos);
		//verify
		assertEquals(proyectosSuscriptos,user.getProyectos());
	}

	@Test
	void testGetYSetMuestras() {
		//setup
		List<Muestra> muestrasUser = Arrays.asList(muestra1,muestra2);
		//excercise
		user.setMuestras(muestrasUser);
		//verify
		assertEquals(muestrasUser,user.getMuestras());
	}	
	
	@Test
	void testGetYSetDesafioUsuario() {
		//setup
		List<DesafioUsuario> desafiosUsuariosUser = Arrays.asList(desafiosUsuario1,desafiosUsuario2);
		//excercise
		user.setDesafiosUsuario(desafiosUsuariosUser);
		//verify
		assertEquals(desafiosUsuariosUser,user.getDesafiosUsuario());
	}

	
}
