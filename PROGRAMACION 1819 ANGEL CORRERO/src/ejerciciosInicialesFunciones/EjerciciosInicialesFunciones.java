package ejerciciosInicialesFunciones;

public class EjerciciosInicialesFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, numA = 0, numB = 0, numC = 0, max = 0, min = 0, doble = 0, divisoresPrimos = 0, maxComDivisor = 0,
				minComMultiplo = 0;
		final double PI = 3.1415;
		double radio = 0, altura = 0, area = 0, volumen = 0;
		char caracA = ' ';
		boolean numEsPrimo = false;

		// num=pideNumeroint();

		// imprimeNveces(num);

		// Ejercicio 1 FIN

		// numA=pideNumeroint();

		// numB=pideNumeroint();

		// max=Maximo2(numA, numB);

		// Ejercicio 2 FIN

		// numA=pideNumeroint();

		// numB=pideNumeroint();

		// numC=pideNumeroint();

		// max=Maximo2(numA, numB);

		// max=Maximo3(max, numC);
		
		// System.out.println(max);

		// Ejercicio 3 FIN

		// numA=pideNumeroint();

		// numB=pideNumeroint();

		// max=Maximo2(numA, numB);

		// min=Minimo2(numA, numB);

		// contador2(min, max);

		// Ejercicio 4 FIN

		// numA=pideNumeroint();

		// doble=doble1(numA);

		// System.out.println(doble);

		// Ejercicio 5 FIN

		caracA=pideCaracter();

		radio=pideNumerodouble();

		altura=pideNumerodouble();
		
		areaVolumen(altura, radio, PI,caracA);

		// Ejercicio 6 FIN

		// numA=pideNumeroint();

		// numEsPrimo=esPrimo(numA);

		// System.out.println(numEsPrimo);

		// Ejercicio 7 FIN

		// numA=pideNumeroint();

		// divisoresPrimos=divisoresPrimos(numA);

		// System.out.println("El número introducido tiene "+divisoresPrimos+" divisores
		// primos");

		// Ejercicio 8 FIN

		// numA=pideNumeroint();

		// numB=pideNumeroint();

		// numC=pideNumeroint();

		// max=Maximo2(numA, numB);

		// max=Maximo3(max, numC);

		// maxComDivisor=maximoComunDivisor(numA,numB, numC, max);

		// System.out.println(maxComDivisor);

		// Ejercicio 9 FIN

		// numA=pideNumeroint();

		// numB=pideNumeroint();

		// numC=pideNumeroint();

		// max=Maximo2(numA, numB);

		// max=Maximo3(max, numC);

		// minComMultiplo=minimoComunMultiplo(numA, numB, numC, max);

		// System.out.println(minComMultiplo);

	}

	public static int pideNumeroint() {
		System.out.println("Introduce un número: ");
		int num = Entrada.entero();
		return (num);
	}

	public static double pideNumerodouble() {
		System.out.println("Introduce un número real: ");
		double radio = Entrada.real();
		return (radio);
	}

	public static char pideCaracter() {
		System.out.println("Introduce el carácter a para area o el carácter v para volumen: ");
		char caracA = Entrada.caracter();
		return (caracA);
	}

	public static void imprimeNveces(int num) {
		int i = 0;
		while (i < num) {
			System.out.println("Modulo ejecutandose");
			i++;
		}
	}

	public static int Maximo2(int numA, int numB) {
		int max = 0;
		if (numA > numB) {
			max = numA;
		} else {
			max = numB;
		}
		return (max);
	}

	public static int Maximo3(int max, int numC) {
		if (numC > max) {
			max = numC;
		}
		return (max);
	}

	public static int Minimo2(int numA, int numB) {
		int min = 0;
		if (numA > numB) {
			min = numB;
		} else {
			min = numA;
		}
		return (min);
	}

	public static void contador2(int min, int max) {
		while (min <= max) {
			System.out.print(min+" ");
			min++;
		}
	}

	public static int doble1(int numA) {
		int doble = numA * 2;
		return (doble);
	}
	
	public static void areaVolumen(double altura, double radio, final double PI, char caracA) {
		if (caracA=='a') {
			double area=area(altura, radio, PI);
			System.out.println("El area del cilindro es "+area);
		} else if (caracA=='v') {
			double volumen=volumen(altura, radio, PI);
			System.out.println("El volumen del cilindro es "+volumen);
		} else {
			System.out.println("El carácter introducido es invalido");
		}
	}

	public static double area(double altura, double radio, final double PI) {
		double area = 0;
		area = (2 * PI * radio * altura) + (2 * PI * Math.pow(radio, 2));
		return (area);
	}

	public static double volumen(double altura, double radio, final double PI) {
		double volumen = 0;
		volumen = PI * Math.pow(radio, 2) * altura;
		return (volumen);
	}

	public static boolean esPrimo(int numA) {
		int i = 1, divisores = 0;
		boolean numEsPrimo = false;
		while (i <= numA / 2 && divisores <= 1) {
			if (numA % i == 0) {
				divisores++;
			}
			i++;
		}
		if (divisores == 1 || divisores == 0) {
			numEsPrimo = true;
		}
		return (numEsPrimo);
	}

	public static int divisoresPrimos(int numA) {
		int i = 1, j = 1, divisores = 0, divisoresPrimos = 0;
		boolean numEsPrimo = false;
		while (i <= numA) {
			if (numA % i == 0) {
				esPrimo(i);
			}
			if (numEsPrimo == true) {
				divisoresPrimos++;
			}
			i++;
		}
		return (divisoresPrimos);
	}

	public static int maximoComunDivisor(int numA, int numB, int numC, int max) {
		boolean divisor = false;
		max = max / 2;
		while (divisor == false) {
			if (numA % max == 0) {
				if (numB % max == 0) {
					if (numC % max == 0) {
						divisor = true;
					} else {
						max--;
					}
				} else {
					max--;
				}
			} else {
				max--;
			}
		}
		return (max);
	}

	public static int minimoComunMultiplo(int numA, int numB, int numC, int max) {
		boolean multiplo = false;
		while (multiplo == false) {
			if (max % numA == 0) {
				if (max % numB == 0) {
					if (max % numC == 0) {
						multiplo = true;
					} else {
						max++;
					}
				} else {
					max++;
				}
			} else {
				max++;
			}
		}
		return (max);
	}

}
