package ejerciciopseudocodigorepetitivo1;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numEnt=0;
		
		System.out.println("Introduce un número entero o introduce el número 0 para terminar: ");
		numEnt = Entrada.entero();
		
		while (numEnt!=0) {
			
			if (numEnt%2==0) {
				
				System.out.println(numEnt+" es par");
				
			} else {
				
				System.out.println(numEnt+" es impar");
				
			}
			
			System.out.println("Introduce un número entero o introduce el número 0 para terminar: ");
			numEnt = Entrada.entero();
			
		}

	}

}
