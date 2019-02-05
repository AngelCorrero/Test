package examenJava23111;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numPrimo = 0, i = 1, divisores = 0, numLetra = 0;
		char letraUsuario = ' ', letraEnc = ' ', letraMin = 'a';
		boolean numEsPrimo = false;

		while (numEsPrimo == false) {

			numPrimo = (int) ((Math.random() * 25) + 1);

			while (i <= numPrimo / 2 && divisores <= 1) {

				if (numPrimo % i == 0) {

					divisores++;

				}

				i++;

			}

			if (divisores == 1 || divisores == 0) {

				numEsPrimo = true;

			}

			divisores = 0;

			i = 1;

		}

		System.out.println("El número secreto primo es: " + numPrimo);

		System.out.println("Escribe una letra: ");
		letraUsuario = Entrada.caracter();

		letraEnc = letraUsuario;

		numLetra = (int) letraUsuario;

		if ((122 - numLetra) < numPrimo) {

			numPrimo = numPrimo - (122 - numLetra);
			
			System.out.println("La letra " + letraUsuario + " encriptada pasará a ser la letra " + (char) ((int) letraMin + numPrimo-1));

		} else {

			System.out.println("La letra " + letraUsuario + " encriptada pasará a ser la letra " + (char) ((int) letraEnc + numPrimo));

		}

	}

}
