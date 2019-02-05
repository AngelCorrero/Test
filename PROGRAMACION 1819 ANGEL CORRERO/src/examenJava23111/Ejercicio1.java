package examenJava23111;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, j = 1, numUsuario = 0;
		String cuadrante = " ";

		while (numUsuario < 10 || numUsuario % 2 == 0) {

			System.out.println("introduzca un número impar mayor o igual a 10: ");
			numUsuario = Entrada.entero();

		}

		System.out.println("Elige cuadrante a romper: ");
		cuadrante = Entrada.cadena();

		while (i <= numUsuario) {

			while (j <= numUsuario) {

				if (i == 1 || i == (numUsuario / 2) + 1 || i == numUsuario) {

					System.out.print("* ");

				} else {

					if (j == 1 || j == (numUsuario / 2) + 1 || j == numUsuario) {

						System.out.print("* ");

					} else {

						if (cuadrante.equalsIgnoreCase("arriba izquierda")) {

							if (j > 1 && j < (numUsuario / 2 + 1) && i > 1 && i < (numUsuario / 2 + 1)) {

								System.out.print("* ");

							} else {

								System.out.print("  ");

							}

						} else {

							if (cuadrante.equalsIgnoreCase("arriba derecha")) {

								if (j < numUsuario && j > (numUsuario / 2 + 1) && i > 1 && i < (numUsuario / 2 + 1)) {

									System.out.print("* ");

								} else {

									System.out.print("  ");

								}

							} else {

								if (cuadrante.equalsIgnoreCase("abajo izquierda")) {

									if (j > 1 && j < (numUsuario / 2 + 1) && i < numUsuario
											&& i > (numUsuario / 2 + 1)) {

										System.out.print("* ");

									} else {

										System.out.print("  ");

									}

								} else {

									if (cuadrante.equalsIgnoreCase("abajo derecha")) {

										if (j < numUsuario && j > (numUsuario / 2 + 1) && i < numUsuario
												&& i > (numUsuario / 2 + 1)) {

											System.out.print("* ");

										} else {

											System.out.print("  ");

										}

									} else {

										System.out.print("  ");

									}

								}

							}

						}

					}

				}

				j++;

			}

			System.out.println("");

			i++;

			j = 1;

		}

	}

}
