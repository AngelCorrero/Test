package ejerciciopseudocodigoalternativo1;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159;
		double base = 0, altura = 0, radio = 0, areaT = 0, areaC = 0;

		System.out.println("Introduce la base del triangulo: ");
		base = Entrada.real();

		System.out.println("Introduce la altura del triangulo: ");
		altura = Entrada.real();

		System.out.println("Introduce el radio del circulo: ");
		radio = Entrada.real();

		areaT = (base * altura) / 2;

		areaC = PI * (Math.pow(radio, 2));

		if (areaT > areaC) {

			System.out.println("El triangulo es mayor que el circulo");

		}

		if (areaT < areaC) {

			System.out.println("El circulo es mayor que el triangulo");

		}

		if (areaT == areaC) {

			System.out.println("El circulo y el triangulo son iguales");

		}

	}

}
