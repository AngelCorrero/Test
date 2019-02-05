package ejerciciosRecursividad1;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=0;
		
		System.out.println("Introduce un número: ");
		numero=Entrada.entero();
		imprimeCifrasNumero(numero);

	}
	
	public static void imprimeCifrasNumero(int numero) {
		if (numero<10) {
			System.out.print(numero+" ");
		} else {
			imprimeCifrasNumero(numero/10);
			System.out.print(numero%10+" ");
		}
	}

}
