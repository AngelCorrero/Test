package ejerciciopseudocodigorepetitivo1;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numEnt = 0, suma = 0;

		while (numEnt >= 0) {

			suma = suma + numEnt;

			System.out.println(
					"Introduce un número entero positivo para sumarlo o un número entero negativo para terminar: ");
			numEnt = Entrada.entero();

		}

		System.out.println("La suma de los números introducidos es: " + suma);

	}

}
