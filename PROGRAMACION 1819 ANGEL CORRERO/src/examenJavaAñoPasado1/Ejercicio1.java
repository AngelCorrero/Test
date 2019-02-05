package examenJavaAñoPasado1;

import practica3JAVA1.Entrada;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 1, h = 0, numUsuario = 0;
		
		while (numUsuario < 10 || numUsuario % 2 == 0) {

			System.out.println("introduzca un número impar mayor o igual a 10: ");
			numUsuario = Entrada.entero();

		}

		h = numUsuario;

		while (i <= numUsuario) {

			while (j <= numUsuario) {

				if (i == 1 || i == (numUsuario / 2) + 1 || i == numUsuario) {

					System.out.print("* ");

				} else {

					if (j == h || j==i || j==1 || j==(numUsuario / 2) + 1 || j==numUsuario) {

						System.out.print("* ");

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
