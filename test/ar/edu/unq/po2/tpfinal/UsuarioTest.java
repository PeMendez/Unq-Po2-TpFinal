package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

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
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
