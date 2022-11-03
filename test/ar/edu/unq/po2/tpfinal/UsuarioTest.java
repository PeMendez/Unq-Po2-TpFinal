package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import ar.edu.unq.po2.tpfinal.StateDesafios.*;

import java.util.ArrayList;
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
	
//	private List<Muestra> muestrasUser; 
//	private List<Proyecto> proyectosUser; 
//	private List<DesafioUsuario> desafiosUsuariosUser;
	
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
		
//		muestrasUser = new ArrayList<Muestra>();
//		proyectosUser = new ArrayList<Proyecto>();
//		desafiosUsuariosUser = new ArrayList<DesafioUsuario>();

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
}
