package ejerciciopseudocodigorepetitivo1;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numEnt=0, i=1, sumaPositivos=0, sumaNegativos=0, j=0, k=0;
		
		while (i<=10) {
			
			System.out.println("Introduce un número entero: ");
			numEnt = Entrada.entero();
			
			if (numEnt>0) {
				
				sumaPositivos=sumaPositivos+numEnt;
				
			} else {
				
				if (numEnt<0) {
					
					sumaNegativos=sumaNegativos+numEnt;
					
					j++;
					
				} else {
					
					k++;
					
				}
				
			}
			
			i++;
			
		}
		
		System.out.println("La suma de los números positivos introducidos es: "+sumaPositivos);
		
		if (j!=0) {
			
			System.out.println("La media de los números negativos introducidos es: "+(sumaNegativos/j));
			
		} else {
			
			System.out.println("No se puede hacer la media porque no hay numeros negativos");
			
		}
		
		System.out.println("El usuario ha introducido "+k+" ceros");

	}

}
