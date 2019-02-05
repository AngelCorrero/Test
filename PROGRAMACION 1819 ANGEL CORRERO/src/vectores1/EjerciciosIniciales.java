package vectores1;

public class EjerciciosIniciales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] vocales= {'a','e','i','o','u'};
		float [] vectorF1= new float[10];
		float [] vectorF2= new float[10];
		float [] vectorFsuma= new float[10];
		final int NUM=15;
		int [] vector1= new int[NUM];
		
		for(int i=0;i<vectorF1.length;i++) {
			System.out.println("Dame un valor para la posición "+i);
			vectorF1[i]=Entrada.entero();
		}
		
		//Ejercicio 3
		
		vectorF2=vectorF1.clone();
		
		//Ejercicio 5
		 
		for(int i=0;i<vector1.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vector1[i]);
		}
		
		for(int i=0;i<vector1.length;i++) {
			vector1[i]=(i+1)*5;
		}
		
		for(int i=0;i<vector1.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vector1[i]);
		}
		
		//Ejercicio 6
		
		if (vectorF1.equals(vectorF2)) {
			System.out.println("Los vectores son iguales");
		} else {
			System.out.println("Los vectores no son iguales");
		}
		
		//Ejercicio 7
		
		for(int i=0;i<vectorF2.length;i++) {
			System.out.println("Dame un valor para la posición "+i);
			vectorF2[i]=Entrada.entero();
		}
		
		//Ejercicio 8
		
		if (vectorF1.equals(vectorF2)) {
			System.out.println("Los vectores son iguales");
		} else {
			System.out.println("Los vectores no son iguales");
		}
		
		//Ejercicio 9
		
		for(int i=0;i<vectorFsuma.length;i++) {
			vectorFsuma[i]=vectorF1[i]+vectorF2[i];
		}
		
		//Ejercicio 10
		
		for(int i=0;i<vectorFsuma.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vectorFsuma[i]);
		}
		
		//Ejercicio 11
		
		for(int i=0;i<vocales.length;i++) {
			vocales[i]=Character.toUpperCase(vocales[i]);
		}
		
		//Ejercicio 12
		
		for(int i=0;i<vocales.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vocales[i]);
		}

	}

}
