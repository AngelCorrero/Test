package ejemplos1;

public class EjemploEntrada {
	public static void main(String[] args) {
		
		int numEnt;
		double numReal1;
		float numReal2;
		char carac;
		String cad;
		
		System.out.println("Introduzca un numero entero:");
		numEnt=Entrada.entero(); //LEER numEnt
		
		System.out.println("Introduzca un numero real:");
		numReal1=Entrada.real();
		
		System.out.println("Introduzca otro numero real:");
		numReal2=(float)Entrada.real();
		
		System.out.println("Introduzca un caracter:");
		carac=Entrada.caracter();
		
		System.out.println("Introduzca una cadena:");
		cad=Entrada.cadena();
		
		System.out.println("Ha introducido "+numEnt+" como numero entero\n"+
											+numReal1+" como numero real1\n"
											+numReal2+" como numero real2\n"
											+carac+" como caracter\n"
											+cad+" como cadena");		

	}
}