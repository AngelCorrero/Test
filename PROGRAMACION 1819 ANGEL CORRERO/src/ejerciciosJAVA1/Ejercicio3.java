package ejerciciosJAVA1;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numUsuarioA = 0, numUsuarioB = 0, cifras = 0, suma = 0, potencia = 1, digito = 0, i = 1;

		System.out.println("Introduzca un n�mero entero: ");
		numUsuarioA = Entrada.entero();

		numUsuarioB = numUsuarioA;

		while (numUsuarioB > 0) {

			numUsuarioB = numUsuarioB / 10;

			cifras++;

		}

		numUsuarioB = numUsuarioA;

		while (numUsuarioB > 0) {

			digito = numUsuarioB % 10;

			while (i <= cifras) {

				potencia = potencia * digito;

				i++;

			}

			suma = suma + potencia;

			numUsuarioB = numUsuarioB / 10;

			i = 1;

			potencia = 1;

		}

		if (suma == numUsuarioA) {

			System.out.println("El n�mero " + numUsuarioA + " es un n�mero armstrong");

		} else {

			System.out.println("El n�mero " + numUsuarioA + " no es un n�mero armstrong");

		}

	}

}
