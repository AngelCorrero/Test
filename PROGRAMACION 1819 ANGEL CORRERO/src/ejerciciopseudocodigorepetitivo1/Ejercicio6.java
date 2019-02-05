package ejerciciopseudocodigorepetitivo1;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2, sumaPares = 0, productoImpares = 0;

		while (i <= 20) {

			sumaPares = sumaPares + i;

			i = i + 2;

		}

		System.out.println("La suma de los números pares desde el 1 al 20 es: " + sumaPares);

		i = 1;

		while (i <= 20) {

			productoImpares = productoImpares * i;

			i = i + 2;

		}

		System.out.println("La multiplicacion de los números impares desde el 1 al 20 es: " + sumaPares);

	}

}
