

public class Lista {

	Nodo primero;
	Nodo ultimo;
	
	public Lista(){
		primero=null;
		ultimo=null;
	}
	//insertar al frente
	public void insertarFinal(int d){
		Nodo nuevo = new Nodo();   
		nuevo.dato=d;		//asignando el valor del nuevo dato en la variable d
		if(primero==null){  //Si la lista está vacía, el nuevo nodo, será el primer nodo
		primero=nuevo;		//primero igual a nuevo cuando esta vacia
		primero.siguiente=primero;	//enlaze derecho
		nuevo.anterior=ultimo;		//enlaze izquierdo
		ultimo=nuevo;				//el nuevo nodo sera el primero y el ultimo
		
		}else{
		ultimo.siguiente=nuevo;		//el nodo que esta a la derecha apunta para el siguiente nodo
		nuevo.siguiente=primero;	//esta apuntando a la cabeza
		nuevo.anterior=ultimo;		//esta apuntando al utlimo osea la cola
		ultimo=nuevo;				//el ultimo va a ser el primero 
		primero.anterior=ultimo;	//
		}		
	}
	public void insertarInicio(int d){
		Nodo nuevo = new Nodo();
		nuevo.dato=d;
		if(ultimo==null){
		ultimo=nuevo;
		ultimo.anterior=ultimo;
		nuevo.siguiente=primero;
		primero=nuevo;
		}else{
		primero.anterior=nuevo;
		nuevo.anterior=ultimo;
		nuevo.siguiente=primero;
		primero=nuevo;
		ultimo.siguiente=primero;
		}		
	}
	
	public void buscarNodo(int x){
		Nodo actual= new Nodo();
		actual=ultimo;
		boolean encontrado=false;
		do{
			if(actual.dato==x){
				encontrado = true;
			}
			actual=actual.anterior;
		}while(actual != ultimo && encontrado != true);
		if(encontrado = true){
			System.out.println ("Nodo encontrado");
		}else{
			System.out.println ("Nodo no encontrado");
		}
		
	}
	public void eliminaNodo(int x){
		Nodo actual= new Nodo();
		Nodo anterior= new Nodo();
		actual=primero;
		anterior=ultimo;
		do{
			if(actual.dato==x){
				if(actual==primero){
					primero=primero.siguiente;
					ultimo.siguiente=primero;
					primero.anterior= ultimo;
				}else if (actual == ultimo){
					ultimo=anterior;
					primero.anterior=ultimo;
					ultimo.siguiente=primero;
				}else {
					anterior.siguiente=actual.siguiente;
					actual.siguiente.anterior=anterior;
				}
			}
			anterior=actual;
			actual=actual.siguiente;
		}while(actual != primero);
	}
	public void desplegar(){
		Nodo actual = new Nodo();
		actual=primero;
		do{
			
			System.out.println(actual.dato);
			actual= actual.siguiente;
		}while(actual != primero);
			
	}
	public String comprobar(){
		String Com = "el numero anterior al primero es: " + primero.getAnterior().getDato()+"\n";
		Com += "el siguiente numero al ultimo es: " + ultimo.getSiguiente().getDato();
		return Com;
	}
	}

