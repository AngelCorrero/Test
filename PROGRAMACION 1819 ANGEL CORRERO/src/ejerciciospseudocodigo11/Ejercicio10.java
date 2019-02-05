package ejerciciospseudocodigo11;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadNombre=" ";
		int edad=0;
				
		System.out.println("Introduce tu nombre: ");
		cadNombre = Entrada.cadena();
		
		System.out.println("Introduce tu edad: ");
		edad = Entrada.entero();
		
		System.out.println("Hola "+cadNombre+", tienes "+edad+" anyos, que mayor eres!");

	}

}
