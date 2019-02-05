package practica3JAVA1;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ANYOACTUAL = 2018, MESACTUAL = 11, DIAACTUAL = 14;
		int dia = 0, mes = 0, anyo = 0, diaSemana = 0, i = 1, sumaDias = 0, j = 0;

		System.out.println("Introduzca el día de su nacimiento: ");
		dia = Entrada.entero();

		System.out.println("Introduzca el mes de su nacimiento: ");
		mes = Entrada.entero();

		System.out.println("Introduzca el año de su nacimiento: ");
		anyo = Entrada.entero();

		sumaDias = DIAACTUAL;

		if (anyo == ANYOACTUAL && mes == MESACTUAL) {

			sumaDias = DIAACTUAL - dia;

			System.out.println(sumaDias);

		} else {

			sumaDias = DIAACTUAL;

			if (anyo != ANYOACTUAL) {

				while (i < MESACTUAL) {

					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {

						sumaDias = sumaDias + 31;

					}

					if (i == 4 || i == 6 || i == 9 || i == 11) {

						sumaDias = sumaDias + 30;

					}

					if (i == 2) {

						if (ANYOACTUAL % 4 == 0 && (ANYOACTUAL % 100 != 0 || ANYOACTUAL % 400 == 0)) {

							sumaDias = sumaDias + 29;

						} else {

							sumaDias = sumaDias + 28;

						}

					}

					i++;

				}

				System.out.println(sumaDias);

				j = ANYOACTUAL - 1;

				while (j > anyo) {

					if (j % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0)) {

						sumaDias = sumaDias + 366;

					} else {

						sumaDias = sumaDias + 365;

					}

					j--;

				}

				System.out.println(sumaDias);

				i = 12;

				while (i > mes) {

					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {

						sumaDias = sumaDias + 31;

					}

					if (i == 4 || i == 6 || i == 9 || i == 11) {

						sumaDias = sumaDias + 30;

					}

					if (i == 2) {

						if (ANYOACTUAL % 4 == 0 && (ANYOACTUAL % 100 != 0 || ANYOACTUAL % 400 == 0)) {

							sumaDias = sumaDias + 29;

						} else {

							sumaDias = sumaDias + 28;

						}

					}

					i--;

					System.out.println(sumaDias);

				}

			} else {

				i = 10;

				while (i > mes) {

					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {

						sumaDias = sumaDias + 31;

					}

					if (i == 4 || i == 6 || i == 9 || i == 11) {

						sumaDias = sumaDias + 30;

					}

					if (i == 2) {

						if (ANYOACTUAL % 4 == 0 && (ANYOACTUAL % 100 != 0 || ANYOACTUAL % 400 == 0)) {

							sumaDias = sumaDias + 29;

						} else {

							sumaDias = sumaDias + 28;

						}

					}

					i--;

					System.out.println(sumaDias);

				}

			}

		}

		if (anyo == ANYOACTUAL && mes == MESACTUAL) {

		} else {

			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {

				sumaDias = sumaDias - dia + 31;

			}

			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

				sumaDias = sumaDias - dia + 30;

			}

			if (mes == 2) {

				if (anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0)) {

					sumaDias = sumaDias - dia + 29;

				} else {

					sumaDias = sumaDias - dia + 28;

				}

			}

		}

		System.out.println(sumaDias);

		diaSemana = sumaDias % 7;

		System.out.println(diaSemana);

		switch (diaSemana) {
		case 0:

			System.out.println("Sabiendo que el día " + DIAACTUAL + " del " + MESACTUAL + " de " + ANYOACTUAL
					+ " es MIERCOLES...");

			System.out.println("Usted nació un MIERCOLES");

			break;

		case 1:

			System.out.println("Sabiendo que el día " + DIAACTUAL + " del " + MESACTUAL + " de " + ANYOACTUAL
					+ " es MIERCOLES...");

			System.out.println("Usted nació un MARTES");

			break;

		case 2:

			System.out.println("Sabiendo que el día " + DIAACTUAL + " del " + MESACTUAL + " de " + ANYOACTUAL
					+ " es MIERCOLES...");

			System.out.println("Usted nació un LUNES");

			break;

		case 3:

			System.out.println("Sabiendo que el día " + DIAACTUAL + " del " + MESACTUAL + " de " + ANYOACTUAL
					+ " es MIERCOLES...");

			System.out.println("Usted nació un DOMINGO");

			break;

		case 4:

			System.out.println("Sabiendo que el día " + DIAACTUAL + " del " + MESACTUAL + " de " + ANYOACTUAL
					+ " es MIERCOLES...");

			System.out.println("Usted nació un SABADO");

			break;

		case 5:

			System.out.println("Sabiendo que el día " + DIAACTUAL + " del " + MESACTUAL + " de " + ANYOACTUAL
					+ " es MIERCOLES...");

			System.out.println("Usted nació un VIERNES");

			break;

		case 6:

			System.out.println("Sabiendo que el día " + DIAACTUAL + " del " + MESACTUAL + " de " + ANYOACTUAL
					+ " es MIERCOLES...");

			System.out.println("Usted nació un JUEVES");

			break;
		}

	}

}
