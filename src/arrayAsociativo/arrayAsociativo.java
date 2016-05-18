package arrayAsociativo;

public class arrayAsociativo {

	public Nodo primero ;
	
	public arrayAsociativo(){
		primero=null;
	}

	public void put(String clave, String valor) {
		if(primero==null){
		primero = new Nodo(clave,valor);
		}else{
			Nodo current = primero;
			while(current.siguiente !=null) current = current.siguiente;
			current.siguiente= new Nodo(clave,valor);
		}
		
	}

}