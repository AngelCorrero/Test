package vectores1;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisores=0;
		int [] vectorAleatorio= new int[20];
		
		for(int i=0;i<vectorAleatorio.length;i++) {
			vectorAleatorio[i]=(int)(Math.random()*100+1);
		}
		
		for(int i=0;i<vectorAleatorio.length;i++) {
			for(int j=1;j <= i / 2 && divisores <= 1;j++) {
				if (i % j == 0) {
					divisores++;
				}
			}
			if (divisores==1) {
				System.out.println("En la posición "+i+" está el valor "+vectorAleatorio[i]);
			}
			divisores=0;
		}

	}

}
