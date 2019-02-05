package ejerciciosRecursividad1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, i=1;
		
		System.out.println("Introduce un número: ");
		num = Entrada.entero();
		tablaDeMultiplicar(num, i);

	}
	
	public static void tablaDeMultiplicar(int num, int i) {
		if (i==10) {
			System.out.println(num+"x"+i+"="+num*i);
		} else {
			System.out.println(num+"x"+i+"="+num*i);
			i++;
			tablaDeMultiplicar(num, i);
		}
	}
}
