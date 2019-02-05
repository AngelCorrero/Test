package ejerciciopseudocodigoalternativo1;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA=0, numB=0;
		
		System.out.println("Introduce un numero entero");
		numA = Entrada.entero();
		
		System.out.println("Introduce otro numero entero");
		numB = Entrada.entero();
		
		if (numA%numB==0) {
			
			System.out.println(numA+" es multiplo de "+numB);
			
		} else {
			
			System.out.println(numA+" no es multiplo de "+numB);

		}

	}

}
