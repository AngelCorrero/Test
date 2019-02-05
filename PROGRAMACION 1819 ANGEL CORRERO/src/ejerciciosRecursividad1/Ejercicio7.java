package ejerciciosRecursividad1;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3333, div=2;
		
		//f(num, div);
		
		while(num>1) {
			
			if (num%div==0) {
				System.out.println(div);
				num=num/div;
			} else {
				div++;
			}
		}

	}
	
	public static void f(int num, int div) {
		
		if (num>1) {
			
			if (num%div==0) {
				System.out.println(div);
				f(num/div, div);
			} else {
				f(num, div+1);
			}
		}

	}

}
