package ejerciciosJAVA1;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, j=1, numEnt;
		
		System.out.println("Introduce un número entero: ");
		numEnt = Entrada.entero();
		
		while (i<=numEnt) {
			
			while (j<=i) {
				
				System.out.print("*");
				
				j++;
				
			}
			
			System.out.println();
			
			j=1;
			
			i++;
			
		}

	}

}
