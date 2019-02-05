package practica3JAVA1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, cifras = 0;
		long numFinal = 0, numero = 0;
		boolean valido = true;
		String numUsuario = " ", numAnterior = " ";

		System.out.println("Introduce el número de cifras: ");
		cifras = Entrada.entero();

		while (i <= cifras) {

			System.out.println("Introduce un número: ");
			numUsuario = Entrada.cadena();

			switch (numUsuario.toUpperCase()) {

			case "CERO":

				if (numUsuario.compareToIgnoreCase(numAnterior) >= 0) {

					numero = 0;

					numAnterior = numUsuario;

					valido = true;

				} else {

					System.out.println("Cifra no valida porque la cadena introducida es menor que la anterior ");

					valido = false;

				}

				break;

			case "UNO":

				if (numUsuario.compareToIgnoreCase(numAnterior) >= 0) {

					numero = 1;

					numAnterior = numUsuario;

					valido = true;

				} else {

					System.out.println("Cifra no valida porque la cadena introducida es menor que la anterior ");

					valido = false;

				}

				break;

			case "DOS":

				if (numUsuario.compareToIgnoreCase(numAnterior) >= 0) {

					numero = 2;

					numAnterior = numUsuario;

					valido = true;

				} else {

					System.out.println("Cifra no valida porque la cadena introducida es menor que la anterior ");

					valido = false;

				}

				break;

			case "TRES":

				if (numUsuario.compareToIgnoreCase(numAnterior) >= 0) {

					numero = 3;

					numAnterior = numUsuario;

					valido = true;

				} else {

					System.out.println("Cifra no valida porque la cadena introducida es menor que la anterior ");

					valido = false;

				}

				break;

			case "CUATRO":

				if (numUsuario.compareToIgnoreCase(numAnterior) >= 0) {

					numero = 4;

					numAnterior = numUsuario;

					valido = true;

				} else {

					System.out.println("Cifra no valida porque la cadena introducida es menor que la anterior ");

					valido = false;

				}

				break;

			case "CINCO":

				if (numUsuario.compareToIgnoreCase(numAnterior) >= 0) {

					numero = 5;

					numAnterior = numUsuario;

					valido = true;

				} else {

					System.out.println("Cifra no valida porque la cadena introducida es menor que la anterior ");

					valido = false;

				}

				break;

			case "SEIS":

				if (numUsuario.compareToIgnoreCase(numAnterior) >= 0) {

					numero = 6;

					numAnterior = numUsuario;

					valido = true;

				} else {

					System.out.println("Cifra no valida porque la cadena introducida es menor que la anterior ");

					valido = false;

				}

				break;

			case "SIETE":

				if (numUsuario.compareToIgnoreCase(numAnterior) >= 0) {

					numero = 7;

					numAnterior = numUsuario;

					valido = true;

				} else {

					System.out.println("Cifra no valida porque la cadena introducida es menor que la anterior ");

					valido = false;

				}

				break;

			case "OCHO":

				if (numUsuario.compareToIgnoreCase(numAnterior) >= 0) {

					numero = 8;

					numAnterior = numUsuario;

					valido = true;

				} else {

					System.out.println("Cifra no valida porque la cadena introducida es menor que la anterior ");

					valido = false;

				}

				break;

			case "NUEVE":

				if (numUsuario.compareToIgnoreCase(numAnterior) >= 0) {

					numero = 9;

					numAnterior = numUsuario;

					valido = true;

				} else {

					System.out.println("Cifra no valida porque la cadena introducida es menor que la anterior ");

					valido = false;

				}

				break;

			default:

				System.out.println("Cifra no valida porque la cadena introducida no es un número ");

				valido = false;

				break;

			}

			if (valido == true) {

				numero = (numero * (long) Math.pow(10, i)) / 10;

				numFinal = numFinal + numero;

				i++;

				if (i <= cifras) {

					System.out.println("Su número parcialmente es: " + numFinal);

				}

			}

		}

		System.out.println("Su número completo es: " + numFinal);

	}

}
