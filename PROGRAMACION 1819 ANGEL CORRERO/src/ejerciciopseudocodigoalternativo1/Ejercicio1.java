package ejerciciopseudocodigoalternativo1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numEnt=0;
		
		System.out.println("Introduce un numero real: ");
		numEnt = Entrada.real();
		
		if (numEnt>0) {
			System.out.println("El numero es positivo");
		}
		
		if (numEnt<0) {
			System.out.println("El numero es negativo");
		}
		
		if (numEnt==0) {
			System.out.println("El numero es 0");
		}

	}

}
