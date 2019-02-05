package ejerciciosRecursividad1;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=86;
		
		System.out.println(f (x));

	}
	
	public static int f(int x) {
		if (x>100) {
			return (x-10);
		} else {
			return (f (f (x+11)));
		}
	}

}
