package ejerciciopseudocodigoalternativo1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA=0, numB=0;
		
		System.out.println("Introduce un numero entero");
		numA = Entrada.entero();
		
		System.out.println("Introduce otro numero entero");
		numB = Entrada.entero();
		
		if (numA>numB) {
			
			System.out.println(+numA+" es mayor que "+numB);
			
		} else {
			
			if (numA<numB) {
				
				System.out.println(+numB+" es mayor que "+numA);
				
			} else {
				
				System.out.println(+numA+" y "+numB+" son iguales");

			}

		}

	}

}
