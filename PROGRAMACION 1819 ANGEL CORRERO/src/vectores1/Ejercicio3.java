package vectores1;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0 , pos=0;
		int [] vectorNumeros= new int[10];
		
		for(int i=0;i<vectorNumeros.length;i++) {
			vectorNumeros[i]=(int)(Math.random()*100+1);
		}
		
		for(int i=0;i<vectorNumeros.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vectorNumeros[i]);
		}
		
		for(int i=1;i<vectorNumeros.length;i++) {
			if (vectorNumeros[i]>max) {
				max=vectorNumeros[i];
				pos=i;
			}
		}
		
		System.out.println("El valor mñáximo almacenado en el vector es "+max+" y esta en la posición "+pos);

	}

}
