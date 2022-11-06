package ar.edu.unq.po2.tpfinal;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.clasesBasicas.Categoria;


class CategoriaTest {

	private Categoria categoria;
	private String nombre;
	
	
	@BeforeEach
	public void setup() {
		nombre = "Ciencias Naturales";
		categoria = new Categoria(nombre);
	}
	
}
