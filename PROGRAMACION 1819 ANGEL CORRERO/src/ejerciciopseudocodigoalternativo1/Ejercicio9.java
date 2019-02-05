package ejerciciopseudocodigoalternativo1;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA = 0, numB = 0, numC = 0;

		System.out.println("Introsuce un numero entero: ");
		numA = Entrada.entero();

		System.out.println("Introsuce un numero entero: ");
		numB = Entrada.entero();

		System.out.println("Introsuce un numero entero: ");
		numC = Entrada.entero();

		if (numA + numB == numC) {

			System.out.println(numA + " + " + numB + " es igual a " + numC);

		} else {

			if (numA + numC == numB) {

				System.out.println(numA + " + " + numC + " es igual a " + numB);

			} else {

				if (numC + numB == numA) {

					System.out.println(numC + " + " + numB + " es igual a " + numA);

				} else {

					System.out.println("Ningun numero es la suma de los otros dos");
				}

			}

		}

	}

}
