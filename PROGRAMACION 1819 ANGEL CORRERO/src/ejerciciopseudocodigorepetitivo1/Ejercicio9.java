package ejerciciopseudocodigorepetitivo1;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numEnt=0, i=0, suma=0;
		
		while (numEnt>=0) {
			
			System.out.println("Introduce un n�mero entero positivo para sumarlo o un n�mero entero negativo para terminar: ");
			numEnt = Entrada.entero();
			
			if (numEnt>=0) {
				
				suma = suma + numEnt;
				
				i++;
				
			}
			
		}
		
		System.out.println("La media de la suma de los n�meros positivos introducidos es: "+(suma/i));

	}

}
