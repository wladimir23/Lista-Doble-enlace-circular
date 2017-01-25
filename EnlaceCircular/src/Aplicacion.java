import java.util.Scanner;

public class Aplicacion {
	
	public static void main(String[] args){
		
		Lista lista = new Lista ();
		
		Scanner teclado = new Scanner(System.in);
		
		int opcion=0;
		do {
			System.out.println("\n*************************");
			System.out.println("LISTA CIRCULAR DOBLE\n");
			System.out.println("1.ingresar nodo al inicio ");
			System.out.println("2.insertar al final ");
			System.out.println("3.buscar");
			System.out.println("4.Eliminar");
			System.out.println("5. Desplegar");
			System.out.println("6.Salir");
			System.out.println("7. Comprobar\n");
			System.out.println("*************************\n");
			System.out.println("Escoja una opcion");
			
			opcion=teclado.nextInt();
			
			switch (opcion) {
			
			case 1: System.out.println ("Ingresar nodo al inicio");
			System.out.println ("Ingresar el dato del nodo");
	         int dato = teclado.nextInt();
	         lista.insertarInicio(dato);
	        break;
			case 2:System.out.println ("Ingresar nodo al final");
			System.out.println ("Ingresar el dato del nodo");
	        int dat = teclado.nextInt();
	        lista.insertarFinal(dat);
	        break;
			case 3:System.out.println ("Buscar Nodo ");
			System.out.println ("Ingresar el dato del nodo a buscar");
	        dato=teclado.nextInt();
	        lista.buscarNodo(dato);
	        break;      
			case 4: System.out.println ("Eliminar nodo");
			System.out.println ("Ingrese el dato del nodo a eliminar");
			 dato=teclado.nextInt();
			 lista.eliminaNodo(dato);
	        break;
			case 5: System.out.println ("Lista de Nodos");
	        lista.desplegar();
	        break;
			case 6: System.out.println ("Fin del programa");
	        break;
			case 7: System.out.println ("Comprobar lista circular");
			System.out.println(lista.comprobar());
	        break;
	        default:
	        	System.out.println ("opcion no valida");
			}
			} while (opcion != 7);
		}

}
