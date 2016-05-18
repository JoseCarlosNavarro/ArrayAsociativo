package Tdd_ArrayAsociativo;

import static org.junit.Assert.*;

import org.junit.Test;

import arrayAsociativo.Nodo;

public class arrayAsociativoTest {

	@Test
	public void crearNodoVacio() {
		Nodo nd = new Nodo();
		assertEquals(nd.clave, "");
		assertEquals(nd.valor, "");
		assertEquals(nd.siguiente, null);
	}

}
