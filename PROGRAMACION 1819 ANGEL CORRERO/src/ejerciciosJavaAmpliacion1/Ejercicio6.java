package ejerciciosJavaAmpliacion1;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=0, max=0, numero=0, numeroAnterior=0, numUsuarioA=0, numUsuarioB=0;
		max++;
		
		System.out.println("Introduzca un número entero: ");
		numUsuarioA=Entrada.entero();
		
		System.out.println("Introduzca otro número entero: ");
		numUsuarioB=Entrada.entero();
		
		if (numUsuarioA>numUsuarioB) {
			
			max=numUsuarioA;
			
			min=numUsuarioB;
			
		} else {
			
			max=numUsuarioB;
			
			min=numUsuarioA;
			
		}
		
		numeroAnterior=max;
		
		while (numero<=numeroAnterior) {
			
			numero=(int)(Math.random()*(max)+min);
			
			System.out.println(numero);
			
			if (numero<numeroAnterior) {
				
				numeroAnterior=numero;
				
				System.out.println(numero+"*");
				
			}
			
		}

	}

}
