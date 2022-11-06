package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import ar.edu.unq.po2.tpfinal.BusquedaDeProyectos.*;
import ar.edu.unq.po2.tpfinal.RestriccionTemporal.TipoDeRestriccion;
import ar.edu.unq.po2.tpfinal.StateDesafios.*;
import ar.edu.unq.po2.tpfinal.StrategyRecomendacion.RecomendadorDesafios;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;


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
	@Mock private CondicionDeBusqueda condicion; 
	@Mock private AdministradorDeProyectos admP; 
	@Mock private RecomendadorDesafios tipoRecomendacion; 

	
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
		condicion = mock(IncluyeCategorias.class); 
		admP = mock(AdministradorDeProyectos.class);  
		tipoRecomendacion = mock(RecomendadorDesafios.class); 

	}

	@Test
	void testSuscribirseAProyecto() {
		//setup
		List<Proyecto> proyectosSuscriptos = Arrays.asList(proyecto1);
		//Exercise
		user.suscribirse(admP, proyecto1); 
		//verify
		assertEquals(proyectosSuscriptos,user.getProyectos());

		verify(proyecto1).addParticipante(user);
	}
	
	@Test
	void testDesuscribirseAProyecto() {
		//setup
		List<Proyecto> proyectosSuscriptos = Arrays.asList(proyecto1);
		//Exercise
		user.desuscribirse(proyecto1); 
		//verify
		assertNotEquals(proyectosSuscriptos,user.getProyectos());

		verify(proyecto1).desuscribirParticipante(user);;
	}
	
	@Test
	void testAceptarDesafio() {
		//setup
		//Exercise
		user.aceptarDesafio(desafiosUsuario1); 
		//verify
		verify(desafiosUsuario1).serAceptado();
	}

	@Test 
	void testDesafiosRecomendados() {
		//setup
		perfilUser2 = new Perfil(10, 4, 30, tipoRecomendacion);
		user = new Usuario(perfilUser2);
		//Exercise
		user.desafiosRecomendados(); 
		//verify
		verify(tipoRecomendacion, times(1)).desafiosRecomendados(user); 
	}
	
	@Test 
	void testBuscarProyectos() {
		//setUp
		user.suscribirse(admP, proyecto1);
		//Exercise
		user.buscarProyectosPor(condicion);
		//verify
		verify(user.getSistema(), times(1)).filtrarProyectos(condicion); 
	}
	
	@Test 
	void testEnviarMuestra() {
		
		user.enviarMuestra(muestra1, proyecto1);
		
		verify(proyecto1, times(1)).addMuestra(muestra1);
	}
	
	@Test
	void testRecolectarMuestra() {
		
		user.recolectarMuestra(muestra1);
		
		assertTrue(user.getMuestras().contains(muestra1)); 
	}
	
	@Test
	void testRechazarDesafio(){
		
		user.rechazarDesafio(desafiosUsuario1);
		
		assertTrue(user.getDesafiosUsuario().isEmpty()); 
	}
	
	@Test
	void testValorarDesafio() {
		//setup
		List<DesafioUsuario> desafioRecomendado = Arrays.asList(desafiosUsuario1);
		user.setDesafiosUsuario(desafioRecomendado);
		//Exercise
		user.valorarDesafio(desafiosUsuario1, 100); 
		//verify
		assertEquals(desafioRecomendado,user.getDesafiosUsuario());
		verify(desafiosUsuario1).setValoracion(100);
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
