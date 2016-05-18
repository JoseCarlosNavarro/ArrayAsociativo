package arrayAsociativo;

public class arrayAsociativo {

	public Nodo primero ;
	
	public arrayAsociativo(){
		primero=null;
	}

	public void put(String clave, String valor) {
		primero = new Nodo(clave,valor,null);
		
	}

}