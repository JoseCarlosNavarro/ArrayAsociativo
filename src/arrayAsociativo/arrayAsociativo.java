package arrayAsociativo;

public class arrayAsociativo {

	public Nodo primero;

	public arrayAsociativo() {
		primero = null;
	}

	public void put(String clave, String valor) {
		if (primero == null) {
			primero = new Nodo(clave, valor);
		}
		Nodo current = primero;

		while (current.siguiente != null && current.clave != clave)
			current = current.siguiente;

		if (current.siguiente == null) {
			current.siguiente = new Nodo(clave, valor);
		} else {
			current.valor = valor;
		}

	}

}