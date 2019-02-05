package ejerciciopseudocodigoalternativo1;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracA = ' ', caracB = ' ', caracC = ' ';

		System.out.println("introduce un caracter: ");
		caracA = Entrada.caracter();

		System.out.println("introduce otro caracter: ");
		caracB = Entrada.caracter();

		System.out.println("introduce otro caracter: ");
		caracC = Entrada.caracter();

		if (caracA >= caracB && caracA >= caracB) {

			if (caracB > caracC) {

				System.out.println(caracA + ", " + caracB + ", " + caracC);

			} else {

				System.out.println(caracA + ", " + caracC + ", " + caracB);

			}

		} else {

			if (caracB > caracA && caracB > caracC) {

				if (caracA > caracC) {

					System.out.println(caracB + ", " + caracA + ", " + caracC);

				} else {

					System.out.println(caracB + ", " + caracC + ", " + caracA);

				}

			} else {

				if (caracC > caracA && caracC > caracB) {

					if (caracA > caracB) {

						System.out.println(caracC + ", " + caracA + ", " + caracB);

					} else {

						System.out.println(caracC + ", " + caracB + ", " + caracA);

					}

				}

			}

		}
	}

}
