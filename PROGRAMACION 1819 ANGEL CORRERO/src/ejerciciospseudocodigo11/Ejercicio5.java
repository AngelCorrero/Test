package ejerciciospseudocodigo11;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA = 0, numB = 0;

		System.out.println("Introduce un numero entero: ");
		numA = Entrada.entero();

		System.out.println("Introduce otro numero entero: ");
		numB = Entrada.entero();

		System.out.println(
				numA + " dividido entre " + numB + " es igua a " + (numA / numB) + " y su resto es " + (numA % numB));

	}

}
