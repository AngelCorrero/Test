package ordenacion1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vectorDesordenado = generaVectorAleatorio(100, 1 ,100);
		
		insercion(vectorDesordenado);
		
		for(int i=0;i<vectorDesordenado.length;i++) {
			System.out.print(vectorDesordenado[i]+", ");
		}
		
		System.out.println();
		
		for(int i=0;i<insercion(vectorDesordenado).length;i++) {
			System.out.print(insercion(vectorDesordenado)[i]+", ");
		}

	}
	
	public static int [] generaVectorAleatorio(int tam , int min ,int max){
		
		int [ ]vector12=new int[tam];
		
		for(int i = 0; i < vector12.length ; i++ ){
			int  aleatorio = (int) (Math.random()*(max))+min;
			vector12[i]=aleatorio;
		}
		return vector12;
	}
	
	public static int [] insercion(int vector[]) {
		int i, temp, j;
		int [] vectorOrdenado = new int[vector.length];
		
		vectorOrdenado[0]=vector[0];
		for (i = 1; i < vector.length; i++) {
			temp = vector[i];
			j = i - 1;
			while ((j >= 0) && (vectorOrdenado[j] > temp)) {
					vectorOrdenado[j + 1] = vectorOrdenado[j];
					j--;
			}
			vectorOrdenado[j + 1] = temp;
		}
		
		return vectorOrdenado;
	}

}
