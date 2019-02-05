package ejerciciopseudocodigoalternativo1;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numEnt = 0;

		System.out.println("Introduce un numero real del 0 al 10: ");
		numEnt = Entrada.real();

		if (numEnt >= 0 && numEnt < 5) {

			System.out.println("La nota del alumno es insuficiente");

		}

		if (numEnt >= 5 && numEnt < 6) {

			System.out.println("La nota del alumno es suficiente");

		}

		if (numEnt >= 6 && numEnt < 7) {

			System.out.println("La nota del alumno es bien");

		}

		if (numEnt >= 7 && numEnt < 9) {

			System.out.println("La nota del alumno es notable");

		}

		if (numEnt >= 9 && numEnt < 10) {

			System.out.println("La nota del alumno es bien");

		}

	}

}
