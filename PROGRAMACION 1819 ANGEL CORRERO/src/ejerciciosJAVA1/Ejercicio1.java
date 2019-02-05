package ejerciciosJAVA1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numUsuarioA = 0, numUsuarioB = 0, i = 1, divisores = 0, primos = 0;

		System.out.println("Introduzca un número entero: ");
		numUsuarioA = Entrada.entero();

		System.out.println("Introduzca otro número entero: ");
		numUsuarioB = Entrada.entero();

		if (numUsuarioB - numUsuarioA == 2) {

			while (i <= numUsuarioA && divisores <= 2) {

				if (numUsuarioA % i == 0) {

					divisores++;

				}

				i++;

			}

			if (divisores == 2 || divisores == 1) {

				primos++;

			}

			divisores = 0;

			i = 1;

			while (i <= numUsuarioB && divisores <= 2) {

				if (numUsuarioB % i == 0) {

					divisores++;

				}

				i++;

			}

			if (divisores == 2 || divisores == 1) {

				primos++;

			}

			if (primos == 2) {

				System.out.println("Los números introducidos son primos gemelos");

			}

		} else {

			System.out.println("Los números introducidos no son primos gemelos");

		}

	}

}
