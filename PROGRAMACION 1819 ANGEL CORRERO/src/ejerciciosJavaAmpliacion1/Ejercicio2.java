package ejerciciosJavaAmpliacion1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracUsuario=' ';
		
		System.out.println("introduzca un caractér en minúscula: ");
		caracUsuario = Entrada.caracter();
		
		System.out.println("La mayúscula del caratér "+caracUsuario+" es "+(char)((int)caracUsuario-32));

	}

}
