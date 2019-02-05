package practica3JAVA1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1, j = 1, numFilas = 0, numColumnas = 0, productoA = 0, divisores = 0, primos = 1;

		System.out.println("Introduzca hasta que número quiere hacer las tablas de multiplicar: ");
		numFilas = Entrada.entero();

		System.out.println("Introduzca hasta que número quiere llegar a multiplicar los números: ");
		numColumnas = Entrada.entero();

		while (primos <= numColumnas) {

			while (i <= primos && divisores <= 2) {

				if (primos % i == 0) {

					divisores++;

				}

				i++;

			}

			if (divisores == 2 || divisores == 1) {

				while (j <= numFilas) {

					productoA = j * primos;

					if (j == 1) {

						System.out.print(j + "*" + primos + "=" + productoA);

					} else
						System.out.print("   \t" + j + "*" + primos + "=" + productoA);

					j++;

				}

				System.out.println(" ");

			}

			primos++;

			i = 1;

			j = 1;

			divisores = 0;

		}

	}

}
