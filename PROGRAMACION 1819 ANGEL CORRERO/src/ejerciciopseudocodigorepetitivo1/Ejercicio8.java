package ejerciciopseudocodigorepetitivo1;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numEnt=0, i=0;
		
		while (numEnt>=0) {
			
			System.out.println("Introduce un número entero positivo o un número entero negativo para terminar: ");
			numEnt = Entrada.entero();
			
			if (numEnt>=0) {
				
				i++;
				
			}
			
		}
		
		System.out.println("El ususario ha introducido "+i+" numeros positivos");

	}

}
