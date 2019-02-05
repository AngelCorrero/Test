package ejerciciosJavaAmpliacion1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numUsuarioA = 0, numUsuarioB = 0, i = 2, divisoresPrimos = 0, casiPrimos = 0, j = 1, min = 0, max = 0,
				divisores = 0;

		System.out.println("Introduce el primer número del rango: ");
		numUsuarioA = Entrada.entero();

		System.out.println("Introduce el segundo número del rango: ");
		numUsuarioB = Entrada.entero();

		if (numUsuarioA > numUsuarioB) {

			max = numUsuarioA;

			min = numUsuarioB;

		} else {

			max = numUsuarioB;

			min = numUsuarioA;

		}

		while (min <= max) {

			while (i < min && divisoresPrimos <= 1) {

				if (min % i == 0) {

					while (j <= i && divisores <= 2) {

						if (i % j == 0) {

							divisores++;

						}

						j++;

					}

					if (divisores == 2 || divisores == 1) {

						divisoresPrimos++;

					}

				}

				i++;

				j = 1;

				divisores = 0;

			}

			if (divisoresPrimos == 1) {

				casiPrimos++;

			}

			divisoresPrimos = 0;

			i = 2;

			min++;

		}

		System.out.println("Hay " + casiPrimos + " números casi primos dentro del rango");

	}

}
