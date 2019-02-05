package ordenacion1;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vector1= generaVectorAleatorio(10, 1 ,100);
		int [] vector2= generaVectorAleatorio(10, 1 ,100);
		int [] vectorOrdenado= vectorOrdenado(vector1, vector2);
		
		for(int i=0;i<vector1.length;i++) {
			System.out.print(vector1[i]+", ");
		}
		
		System.out.println();
		
		for(int i=0;i<vector2.length;i++) {
			System.out.print(vector2[i]+", ");
		}
		
		System.out.println();
		
		for(int i=0;i<vectorOrdenado.length;i++) {
			System.out.print(vectorOrdenado[i]+", ");
		}

	}
	
	public static int [] vectorOrdenado(int vector1[], int vector2[]) {
		int i, temp, j, k=0;
		int [] vectorOrdenado = new int[vector1.length+vector1.length];
		
		vectorOrdenado[0]=vector1[0];
		for (i = 1; i < vectorOrdenado.length; i++) {
			if (i<vector1.length) {
				temp = vector1[i];
			} else {
				temp = vector2[k];
			}
			j = i - 1;
			while ((j >= 0) && (vectorOrdenado[j] > temp)) {
					vectorOrdenado[j + 1] = vectorOrdenado[j];
					j--;
			}
			vectorOrdenado[j + 1] = temp;
			if(i>vector1.length) {
				k++;
			}
		}
		
		return vectorOrdenado;
	}
	
	public static int [] generaVectorAleatorio(int tam , int min ,int max){
		
		int [ ]vector12=new int[tam];
		
		for(int i = 0; i < vector12.length ; i++ ){
			int  aleatorio = (int) (Math.random()*(max))+min;
			vector12[i]=aleatorio;
		}
		return vector12;
	}

}
