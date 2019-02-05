package vectores1;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acumuladorPosPares=0, acumuladorPosImpares=0;
		int [] numerosPositivos= new int[10];
		
		for(int i=0;i<numerosPositivos.length;i++) {
			System.out.println("Introduce un número entre 1 y 20 para la posición "+i);
			numerosPositivos[i]=Entrada.entero();
		}
		
		for(int i=0;i<numerosPositivos.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+numerosPositivos[i]);
		}
		
		for(int i=0;i<numerosPositivos.length;i++) {
			if (i%2==0) {
				acumuladorPosPares=acumuladorPosPares+numerosPositivos[i];
			} else {
				acumuladorPosImpares=acumuladorPosImpares+numerosPositivos[i];
			}
		}
		
		System.out.println("La suma de los valores de las posiciones pares que hay en el vector es "+acumuladorPosPares);
		System.out.println("La suma de los valores de las posiciones impares que hay en el vector es "+acumuladorPosImpares);

	}

}
