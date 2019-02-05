package vectores1;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acumuladorPares=0, acumuladorImpares=0;
		int [] numerosPositivos= new int[10];
		
		for(int i=0;i<numerosPositivos.length;i++) {
			System.out.println("Introduce un número entre 1 y 20 para la posición "+i);
			numerosPositivos[i]=Entrada.entero();
		}
		
		for(int i=0;i<numerosPositivos.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+numerosPositivos[i]);
		}
		
		for(int i=0;i<numerosPositivos.length;i++) {
			if (numerosPositivos[i]%2==0) {
				acumuladorPares=acumuladorPares+numerosPositivos[i];
			} else {
				acumuladorImpares=acumuladorImpares+numerosPositivos[i];
			}
		}
		
		System.out.println("La suma de los pares que hay en el vector es "+acumuladorPares);
		System.out.println("La suma de los impares que hay en el vector es "+acumuladorImpares);

	}

}
