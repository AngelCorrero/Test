package examenJava23111;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int diaSecreto = 14, mesSecreto = 10, anyoSecreto = 1997;
		int diaUsuario = 0, mesUsuario = 0, anyoUsuario = 0, intentos = 0, i = 0;
		boolean valido = true, victoria = false;

		System.out.println("¿En cuantos intentos quieres adivinar la fecha?");
		intentos = Entrada.entero();

		while (i < intentos && victoria == false) {

			System.out.println("Introduzca el dia (tiene que número entero positivo): ");
			diaUsuario = Entrada.entero();

			System.out.println("Introduzca el mes (tiene que número entero positivo: ");
			mesUsuario = Entrada.entero();

			System.out.println("Introduzca el año (tiene que número entero positivo: ");
			anyoUsuario = Entrada.entero();
			
			if (mesUsuario>12) {
				
				valido = false;
				
			} else {
				
				if (mesUsuario == 1 || mesUsuario == 3 || mesUsuario == 5 || mesUsuario == 7 || mesUsuario == 8
						|| mesUsuario == 10 || mesUsuario == 12) {

					if (diaUsuario > 31) {

						valido = false;

					}

				} else if (mesUsuario == 4 || mesUsuario == 6 || mesUsuario == 9 || mesUsuario == 11) {

					if (diaUsuario > 30) {

						valido = false;

					}

				} else if (mesUsuario == 2) {

					if (anyoUsuario % 4 == 0 && (anyoUsuario % 100 != 0 || anyoUsuario % 400 == 0)) {

						if (diaUsuario > 29) {

							valido = false;

						}

					} else if (diaUsuario > 28) {

						valido = false;

					}

				}
				
			}

			if (valido == false) {

				System.out.println("fecha incorrecta, este intento no cuenta...");

			} else {

				if (anyoUsuario == anyoSecreto) {

					System.out.println("AÑO ACERTADO!");

					if (mesUsuario == mesSecreto) {

						System.out.println("MES ACERTADO!");

						if (diaUsuario == diaSecreto) {

							System.out.println("DIA ACERTADO!");

							victoria = true;

						}

						if (diaUsuario < diaSecreto) {

							System.out.println("El dia secreto es mayor que el dia que has escrito");

						}

						if (diaUsuario > diaSecreto) {

							System.out.println("El dia secreto es menor que el dia que has escrito");

						}

					}

					if (mesUsuario < mesSecreto) {

						System.out.println("El mes secreto es mayor que el mes que has escrito");

					}

					if (mesUsuario > mesSecreto) {

						System.out.println("El mes secreto es menor que el mes que has escrito");

					}

				}

				if (anyoUsuario < anyoSecreto) {

					System.out.println("El año secreto es mayor que el año que has escrito");

				}

				if (anyoUsuario > anyoSecreto) {

					System.out.println("El año secreto es menor que el año que has escrito");

				}

				i++;

			}

			valido = true;

		}

		if (victoria == true) {

			System.out.println("Acertaste la fecha en " + i + " intentos!!");

		} else {

			System.out.println("Agotaste tus intentos, la fecha era " + diaSecreto + "/" + mesSecreto + "/" + anyoSecreto);

		}

	}

}
