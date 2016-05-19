package Tdd_ArrayAsociativo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import arrayAsociativo.ArrayAsociativoException;
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
	
	@Test
	public void InsertarNuevaEntradaSinClaveRepetida(){
		array.put("edad", "14");
		Nodo current = array.primero;
		array.put("nombre", "luis");
		while(current.siguiente != null) current = current.siguiente;
		assertEquals(current.clave, "nombre");
		assertEquals(current.valor, "luis");
		
	}
	
	@Test
	public void InsertarNuevaEntradaArrayConClaveRepetida(){
		array.put("nombre", "luis");
		Nodo current = array.primero;
		array.put("nombre", "jose");
		while(current.siguiente != null && current.clave!= "nombre") current = current.siguiente;
		assertEquals(current.clave, "nombre");
		assertEquals(current.valor, "jose");
	}
	
	@Test
	public void BuscaClaveyDevuelveValorAsociado() {
		array.put("alumno", "luis");
		array.put("nombre", "jose");
		assertEquals(array.get("nombre"), "jose");
	}
	
	@Test(expected = ArrayAsociativoException.class)
	public void BuscaClaveyDevuelveValorAsociadoSinoEncuentraElevaExcepcion(){
		array.put("alumno", "luis");
		array.put("nombre", "jose");
		array.get("edad");
	}
	
	@Test
	public void BuscaClaveyDevuelveValorAsociadoGetOrElse(){
		array.put("alumno", "luis");
		array.put("nombre", "jose");
		assertEquals(array.getOrElse("nombre", "valorPorDefecto"), "jose");
	}
	
	@Test
	public void BuscaClaveyDevuelveValorAsociadoGetOrElseSiNoDevuelveValorPorDefecto(){
		array.put("alumno", "luis");
		array.put("nombre", "jose");
		assertEquals(array.getOrElse("edad", "valorPorDefecto"), "valorPorDefecto");
	}
	
	@Test
	public void BuscaClaveyLaEncuentraContainskey(){
		array.put("alumno", "luis");
		array.put("nombre", "jose");
		assertEquals(array.containsKey("nombre"), true);
	}
	
	@Test
	public void BuscaClaveyNoLaEncuentraContainskey(){
		array.put("alumno", "luis");
		array.put("nombre", "jose");
		assertEquals(array.containsKey("edad"), false);
	}
	
	@Test
	public void NumeroDeEntradasDelArray() {
		array.put("alumno", "luis");
		array.put("nombre", "jose");
		assertEquals(array.size(), 2);
	}
	
	@Test
	public void BorrarParAsociadoAClaveConExitoPrimero(){
		array.put("alumno", "luis");
		array.put("nombre", "jose");
		assertEquals(array.remove("alumno"), true);
	}
	
	@Test
	public void BorrarParAsociadoAClaveConExito(){
		array.put("alumno", "luis");
		array.put("edad", "jose");
		array.put("nombre", "jose");
		assertEquals(array.remove("edad"), true);
	}
	
	@Test
	public void BorrarParAsociadoAClaveSinExito(){
		array.put("alumno", "luis");
		array.put("nombre", "jose");
		assertEquals(array.remove("edad"), false);
	}
}
