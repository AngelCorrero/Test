package ejerciciosRecursividad1;

import practica3JAVA1.Entrada;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0, num=1;
		
		System.out.println("Introduce un número");
		n = Entrada.entero();
		imprimeImparesNoPrimos(n);

	}
	
	public static void imprimeImparesNoPrimos(int n) {
		int i=1, divisores=0;
		
		if (n==1) {
			System.out.println(n);
		} else {
			
			imprimeImparesNoPrimos(n-1);
			
			while (i <= n / 2 && divisores <= 1) {
				if (n % i == 0) {
					divisores++;
				}
				i++;
			}
			if (divisores>1 && n%2!=0) {
				System.out.println(n);
			}

		}
	}
}
