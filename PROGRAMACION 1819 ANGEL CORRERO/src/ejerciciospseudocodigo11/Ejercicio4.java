package ejerciciospseudocodigo11;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14159;
		double radio = 0;
		
		System.out.println("Introduzca el radio del circulo: ");
		radio =Entrada.real();
		
		System.out.println("El area del circulo es "+PI*(radio*radio)+" y su perimetro es "+(2*PI*radio));

	}

}
