package ejerciciosJavaAmpliacion1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracUsuario=' ';
		
		System.out.println("introduzca un caract�r en min�scula: ");
		caracUsuario = Entrada.caracter();
		
		System.out.println("La may�scula del carat�r "+caracUsuario+" es "+(char)((int)caracUsuario-32));

	}

}
