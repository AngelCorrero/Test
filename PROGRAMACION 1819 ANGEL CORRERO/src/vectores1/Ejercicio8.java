package vectores1;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0, j=0;
		int [] vectorDelDerecho;
		int [] vectorDelReves;
		
		System.out.println("Introduce el tamaño del vector: ");
		n = Entrada.entero();
		
		vectorDelDerecho= new int[n];
		
		for(int i=0;i<vectorDelDerecho.length;i++) {
			System.out.println("Introduce un número para la posición "+i+" : ");
			vectorDelDerecho[i]=Entrada.entero();
		}
		
		vectorDelReves= new int[n];
		j=n-1;
		
		for(int i=0;i<vectorDelReves.length;i++) {
			vectorDelReves[i]=vectorDelDerecho[j];
			j--;
		}
		
		for(int i=0;i<vectorDelDerecho.length;i++) {
			System.out.print(vectorDelDerecho[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<vectorDelReves.length;i++) {
			System.out.print(vectorDelReves[i]+" ");
		}
		
	}

}
