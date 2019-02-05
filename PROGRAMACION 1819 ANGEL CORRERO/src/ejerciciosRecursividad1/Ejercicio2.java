package ejerciciosRecursividad1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=2, exponente=4;
		System.out.println(potencia(base, exponente));

	}
	
	public static int potencia(int base, int exponente) {
		int ac=1;
		if (exponente==0) {
			return (1);
		} else {
			ac=base*potencia(base, exponente-1);
			return (ac);
		}
	}

}
