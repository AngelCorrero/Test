package ejerciciopseudocodigoalternativo1;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numEnt = 0;

		System.out.println("Introduce un numero entero entre 0 y 9999");
		numEnt = Entrada.entero();

		if (numEnt >= 0 && numEnt <= 9) {

			System.out.println(numEnt + " tiene una cifra");

		}

		if (numEnt >= 10 && numEnt <= 99) {

			System.out.println(numEnt + " tiene dos cifras");

		}

		if (numEnt >= 100 && numEnt <= 999) {

			System.out.println(numEnt + " tiene tres cifras");

		}

		if (numEnt >= 1000 && numEnt <= 9999) {

			System.out.println(numEnt + " tiene cuatro cifras");

		}

	}

}
