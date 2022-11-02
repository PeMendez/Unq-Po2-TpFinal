package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import ar.edu.unq.po2.clasesBasicas.Muestra;
import ar.edu.unq.po2.clasesBasicas.Perfil;
import ar.edu.unq.po2.clasesBasicas.Proyecto;
import ar.edu.unq.po2.clasesBasicas.Usuario;
import ar.edu.unq.po2.clasesBasicas.StateDesafios.DesafioUsuario;

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
	
	private List<Muestra> muestrasUser; 
	private List<Proyecto> proyectosUser; 
	private List<DesafioUsuario> desafiosUsuariosUser;
	
	@BeforeEach
	void setUp() throws Exception {
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
		
		muestrasUser = new ArrayList<Muestra>();
		proyectosUser = new ArrayList<Proyecto>();
		desafiosUsuariosUser = new ArrayList<DesafioUsuario>();

	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
