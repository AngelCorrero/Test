package ejerciciopseudocodigoalternativo1;

public class Ejercicio4 {

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
			
			if (numB%numA==0) {
				
				System.out.println(numB+" es multiplo de "+numA);
				
			} else {
				
				System.out.println(numA+" y "+numB+" no son multiplos");
				
			}
			
		}

	}

}
