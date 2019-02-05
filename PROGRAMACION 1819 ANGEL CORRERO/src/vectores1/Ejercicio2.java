package vectores1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pares=0, impares=0, j=0, h=0;
		int [] vectorInicial= new int[15];
		int [] vectorPares;
		int [] vectorImpares;
		
		for(int i=0;i<vectorInicial.length;i++) {
			System.out.println("Introduce un número entre 1 y 20 para la posición "+i);
			vectorInicial[i]=Entrada.entero();
		}
		
		for(int i=0;i<vectorInicial.length;i++) {
			if (vectorInicial[i]%2==0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		vectorPares= new int[pares];
		vectorImpares= new int[impares];
		
		for(int i=0;i<vectorInicial.length;i++) {
			if (vectorInicial[i]%2==0) {
				vectorPares[j]=vectorInicial[i];
				j++;
			} else {
				vectorImpares[h]=vectorInicial[i];
				h++;
			}
		}
		
		for(int i=0;i<vectorPares.length;i++) {
			System.out.println("En la posición "+i+" del vectorPares está el valor "+vectorPares[i]);
		}
		
		for(int i=0;i<vectorImpares.length;i++) {
			System.out.println("En la posición "+i+" del vectorImpares está el valor "+vectorImpares[i]);
		}

	}

}
