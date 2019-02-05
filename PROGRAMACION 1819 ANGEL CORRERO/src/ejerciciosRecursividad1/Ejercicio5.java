package ejerciciosRecursividad1;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		
		System.out.println("Introduce un número:");
		num = Entrada.entero();
		invertirNumero(num);

	}
	
	public static void invertirNumero(int num) {
		if (num<10) {
			System.out.print(num);
		} else {
			System.out.print(num%10);
			invertirNumero(num/10);
		}
	}

}
