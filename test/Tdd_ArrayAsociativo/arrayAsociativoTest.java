package Tdd_ArrayAsociativo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import arrayAsociativo.Nodo;
import arrayAsociativo.arrayAsociativo;

public class arrayAsociativoTest {
	arrayAsociativo array;
	@Before
	public void setUp(){
		array = new arrayAsociativo();
		
	}
	 
	@Test
	public void crearNodoVacio() {
		Nodo nd = new Nodo();
		assertEquals(nd.clave, "");
		assertEquals(nd.valor, "");
		assertEquals(nd.siguiente, null);
	}

	@Test
	public void crearNodoConDatos(){
		Nodo nd = new Nodo("clave","valor");
		assertEquals(nd.clave, "clave");
		assertEquals(nd.valor, "valor");
		assertEquals(nd.siguiente, null);
	}
	
	@Test
	public void crearNuevoArrayAsociativoVacio(){
		assertEquals(array.primero, null);
		}
	
	@Test
	public void InsertarPrimeraEntradaEnArrayAsociativo(){
		array.put("nombre", "luis");
		assertEquals(array.primero.clave, "nombre");
		assertEquals(array.primero.valor, "luis");
		
	}
	
}
