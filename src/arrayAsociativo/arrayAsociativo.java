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

		if (current.clave != clave) {
			current.siguiente = new Nodo(clave, valor);
		} else {
			current.valor = valor;
		}

	}

	public String get(String clave) {
		Nodo current = primero;
		while (primero!=null && current.siguiente != null && current.clave != clave) {
			current = current.siguiente;
		}
		if (primero==null || current.clave != clave) {
			throw new ArrayAsociativoException("Clave no encontrada");
		} else {
			return current.valor;
		}

	}

	public String getOrElse(String clave, String valorPorDefecto) {
		Nodo current = primero;
		String valor = "";
		while (current.siguiente != null && current.clave != clave) {
			current = current.siguiente;
		}
		if (current.clave == clave) {
			valor = current.valor;
		} else {
			valor = valorPorDefecto;
		}
		return valor;
	}

	public Boolean containsKey(String clave) {
		boolean esta = false;
		Nodo current = primero;
		while (current.siguiente != null && current.clave != clave) {
			current = current.siguiente;
		}

		if (current.clave == clave) {
			esta = true;
		}
		return esta;
	}

	public int size() {
		int cont = 0;
		Nodo current = primero;
		while (current != null) {
			cont++;
			current = current.siguiente;
		}
		return cont;
	}

	public boolean remove(String clave) {
		boolean realizado = false;
		if (primero.clave == clave) {
			primero = primero.siguiente;
			realizado = true;
		} else {
			Nodo current = primero;
			while (current.siguiente != null
					&& current.siguiente.clave != clave) {
				current = current.siguiente;
			}
			if (current.siguiente != null && current.siguiente.clave == clave) {
				current.siguiente = current.siguiente.siguiente;
				realizado = true;
			}
		}
		return realizado;
	}
}