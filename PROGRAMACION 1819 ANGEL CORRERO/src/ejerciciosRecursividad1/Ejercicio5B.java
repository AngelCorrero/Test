package ejerciciosRecursividad1;

public class Ejercicio5B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		
		System.out.println("Introduce un número:");
		num = Entrada.entero();
		System.out.println(invertirNumero(num));

	}
	
	public static int invertirNumero(int num) {
		int numInv=0, cifras=0, numOtro=num;
		
		// Caso Base
		if (num<10) {
			numInv=num%10;
			return (numInv);
		} 
		// Caso Recursivo
		else {
			while (numOtro>0) {
				numOtro=numOtro/10;
				cifras++;
			}
			numInv=num%10*(int)Math.pow(10, cifras-1)+invertirNumero(num/10);
			return (numInv);
		}
	}

}
