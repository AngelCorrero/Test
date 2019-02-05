package vectores1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pares=0, impares=0;
		int [] vectorAleatorio= new int[10];
		
		for(int i=0;i<vectorAleatorio.length;i++) {
			vectorAleatorio[i]=(int)(Math.random()*20+1);
		}
		
		for(int i=0;i<vectorAleatorio.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vectorAleatorio[i]);
		}
		
		for(int i=0;i<vectorAleatorio.length;i++) {
			if (vectorAleatorio[i]%2==0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("Hay "+pares+" números pares y "+impares+" números impares");

	}

}
