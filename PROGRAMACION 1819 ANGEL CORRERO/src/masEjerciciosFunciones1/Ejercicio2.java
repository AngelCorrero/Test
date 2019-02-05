package masEjerciciosFunciones1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0, numPrimoA=1, numPrimoB=0, primosGemelos=0;;
		
		System.out.println("Introduzca un número entero: ");
		n = Entrada.entero();
		System.out.println("Las "+n+" primeras tuplas de números primos gemelos son: ");
		System.out.println("");
		while (primosGemelos<n) {
			numPrimoB=siguientePrimo(numPrimoA);
			primosGemelos=primoGemelo(numPrimoA, numPrimoB, primosGemelos);
			numPrimoA=numPrimoB;
		}

	}
	
	public static boolean esPrimo(int numPrimoA) {
		int i = 1, divisores = 0;
		boolean numEsPrimo=false;
		while (i <= Math.sqrt(numPrimoA) && divisores <= 1) {
			if (numPrimoA % i == 0) {
				divisores++;
			}
			i++;
		}
		if (divisores == 1 || divisores == 0) {
			numEsPrimo = true;
		}
		return (numEsPrimo);
	}
	
	public static int siguientePrimo(int numPrimoA) {
		boolean numEsPrimo=false;
		while (numEsPrimo==false) {
			numPrimoA++;
			numEsPrimo=esPrimo(numPrimoA);
		}
		return (numPrimoA);
	}
	
	public static int primoGemelo(int numPrimoA, int numPrimoB, int primosGemelos) {
		if (numPrimoB-numPrimoA==2) {
			System.out.print("("+numPrimoA+","+numPrimoB+") ");
			primosGemelos++;
		}
		return (primosGemelos);
	}

}
