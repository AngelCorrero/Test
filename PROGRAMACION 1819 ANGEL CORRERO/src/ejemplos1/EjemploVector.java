package ejemplos1;

public class EjemploVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vector1=new int[5];
		int [] vector2={54,2,-1,4,7};
		
		for(int i=0;i<vector1.length;i++) {
			System.out.println("Dame un valor para la posición "+i);
			vector1[i]=Entrada.entero();
		}	
		
		for(int i=0;i<vector1.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vector1[i]);
		}
		
		vector1=vector2.clone();
		
		/*
		System.out.println("Los datos del vector1 es");
		for(int i=0;i<vector1.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vector1[i]);
		}
		
		vector2[0]=3;
		
		System.out.println("Los datos del vector1 es");
		for(int i=0;i<vector1.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vector1[i]);
		}*/
		
		if(vector1.equals(vector2))
		{
			System.out.println("Los dos vectores son el mismo");
		}
		else
			System.out.println("Los dos vectores son diferentes");
	}

}
