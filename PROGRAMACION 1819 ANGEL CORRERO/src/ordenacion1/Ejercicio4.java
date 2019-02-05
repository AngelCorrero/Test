package ordenacion1;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vector = generaVectorAleatorio(1000 , 1 ,1000);
		
		burbujaOptimizada(vector);
		
	}
	
	public static int [] generaVectorAleatorio(int tam , int min ,int max){
		
		int [ ]vector12=new int[tam];
		
		for(int i = 0; i < vector12.length ; i++ ){
			int  aleatorio = (int) (Math.random()*(max))+min;
			vector12[i]=aleatorio;
		}
		return vector12;
	}
	
	static void insercion(int vector[]) {
		int i, temp, j;
		for (i = 1; i < vector.length; i++) {
			temp = vector[i];
			j = i - 1;
			while ((j >= 0) && (vector[j] > temp)) {
				vector[j + 1] = vector[j];
				j--;
			}
			vector[j + 1] = temp;
		}
		
		i=vector.length-1;
		
		while (i>vector.length-11) {
			System.out.println(vector[i]);
			i--;
		}
	}
	
	static void burbujaOptimizada(int vector[])
	{
		int temp;
		int i, j;
		for (i = 1; i < vector.length; i++) {
			for (j = 0; j < i; j++) {
				if (vector[i] > vector[j]) {
					temp = vector[j];
					vector[j] = vector[i];
					vector[i] = temp;
				}
			}
		}
		
		for(i=0;i<10;i++) {
			System.out.print(vector[i]+", ");
		}
	}

}
