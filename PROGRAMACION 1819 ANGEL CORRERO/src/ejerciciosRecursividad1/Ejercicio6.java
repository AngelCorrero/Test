package ejerciciosRecursividad1;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		
		System.out.println("Introduce un número:");
		num = Entrada.entero();
		System.out.print(invertirNumero(num));

	}
	
	public static int invertirNumero(int num) {
		int acumulador=0;
		if (num<10) {
			//System.out.print(num%10+"+");
			return (num%10);
		} else {
			acumulador=num%10;
			acumulador=acumulador+invertirNumero(num/10);
			//System.out.print(num%10+"+");
			return (acumulador);
		}
	}
}
