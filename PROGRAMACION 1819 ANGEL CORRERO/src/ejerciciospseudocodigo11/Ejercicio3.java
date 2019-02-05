package ejerciciospseudocodigo11;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadNombre = "", cadApellido1 = "", cadApellido2 = "";
		
		System.out.println("Introduce un nombre");
		cadNombre = Entrada.cadena();

		System.out.println("Introduce un apellido");
		cadApellido1 = Entrada.cadena();

		System.out.println("Introduce otro apellido");
		cadApellido2 = Entrada.cadena();

		System.out.println("Su nombre es " + cadNombre + " " + cadApellido1 + " " + cadApellido2);

	}

}
