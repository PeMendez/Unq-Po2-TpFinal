package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import ar.edu.unq.po2.tpfinal.StateDesafios.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

//import ar.edu.unq.po2.tpfinal.StateDesafios.*;

class UsuarioTest {

	private Usuario user;
	@Mock private Muestra muestra1; 
	@Mock private Muestra muestra2; 
	@Mock private Muestra muestra3; 
	@Mock private Proyecto proyecto1; 
	@Mock private Proyecto proyecto2; 
	@Mock private Perfil perfilUser; 
	@Mock private Perfil perfilUser2; 
	@Mock private DesafioUsuario desafiosUsuario1;
	@Mock private DesafioUsuario desafiosUsuario2;
	@Mock private DesafioUsuario desafiosUsuario3;

	
	@BeforeEach
	public void setUp()  {
		user = new Usuario(perfilUser);
	    muestra1 = mock(Muestra.class); 
		muestra2 = mock(Muestra.class);  
		muestra3 = mock(Muestra.class);  
		proyecto1 = mock(Proyecto.class);  
		proyecto2 = mock(Proyecto.class);   
		perfilUser = mock(Perfil.class);   
		desafiosUsuario1 = mock(DesafioUsuario.class);  
		desafiosUsuario2 = mock(DesafioUsuario.class); 
		desafiosUsuario3 = mock(DesafioUsuario.class);

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
	
//	@Test
//	void testDesafioFavorito() {
//		//setup
//		List<DesafioUsuario> desafios1Y2 = Arrays.asList(desafiosUsuario1,desafiosUsuario2);
//		user.setDesafiosUsuario(desafios1Y2);
//		//excercise
//		user.getDesafioFavorito(); 
//		//verify
//		verify(desafiosUsuario1).getValoracion();
//		verify(desafiosUsuario2).getValoracion();
//	}

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
