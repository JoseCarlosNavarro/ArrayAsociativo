package Tdd_ArrayAsociativo;

import static org.junit.Assert.*;

import org.junit.Test;

import arrayAsociativo.Nodo;
import arrayAsociativo.arrayAsociativo;;

public class arrayAsociativoTest {

	@Test
	public void crearNodoVacio() {
		Nodo nd = new Nodo();
		assertEquals(nd.clave, "");
		assertEquals(nd.valor, "");
		assertEquals(nd.siguiente, null);
	}

	@Test
	public void crearNodoConDatos(){
		Nodo nd = new Nodo("clave","valor",null);
		assertEquals(nd.clave, "clave");
		assertEquals(nd.valor, "valor");
		assertEquals(nd.siguiente, null);
	}
	
	@Test
	public void crearNuevoArrayAsociativoVacio(){
		arrayAsociativo array = new arrayAsociativo();
		assertEquals(array.primero, null);
		}
	
	@Test
	public void InsertarPrimeraEntradaEnArrayAsociativo(){
		arrayAsociativo array = new arrayAsociativo();
		array.put("nombre", "luis");
		
		assertEquals(array.primero.clave, "nombre");
		assertEquals(array.primero.valor, "luis");
		
	}
}
