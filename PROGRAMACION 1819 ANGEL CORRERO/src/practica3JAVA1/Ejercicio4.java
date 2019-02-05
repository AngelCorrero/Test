package practica3JAVA1;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 1, h = 0, numUsuario = 0;

		while (numUsuario < 5 || numUsuario % 2 == 0) {

			System.out.println("introduzca un número impar mayor o igual a 5: ");
			numUsuario = Entrada.entero();

		}

		h = numUsuario;

		while (i <= numUsuario) {

			while (j <= numUsuario) {

				if (i == 1 || i == (numUsuario / 2) + 1 || i == numUsuario) {

					System.out.print("Z ");

				} else {

					if (j == h) {

						System.out.print("Z ");

					} else {

						System.out.print("  ");

					}

				}

				j++;

			}

			System.out.println("");

			i++;

			h--;

			j = 1;

		}

	}

}
