package ejerciciosJavaAmpliacion1;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numUsuarioA=0, numUsuarioB=0, max=0, min=0, cifras=0, otro=0, resto=0;
		boolean contenido=false;
		
		System.out.println("Intrudoce un n�mero entero; ");
		numUsuarioA = Entrada.entero();
		
		System.out.println("Intrudoce otro n�mero entero; ");
		numUsuarioB = Entrada.entero();
		
		if (numUsuarioA>numUsuarioB) {
			
			max=numUsuarioA;
			
			min=numUsuarioB;
			
		} else {
			
			max=numUsuarioB;
			
			min=numUsuarioA;
			
		}
		
		otro=min;
		
		while (otro>0) {
			
			otro=otro/10;
			
			cifras++;
			
		}
		
		otro=max;
		
		while (otro>=(int)Math.pow(10, cifras)) {
			
			resto=otro%(int)Math.pow(10, cifras);
			
			if (resto==min) {
				
				contenido=true;
				
			}
			
			otro=otro/10;
			
		}
		
		if (contenido==true) {
			
			System.out.println("El n�mero "+max+" contiene al n�mero "+min);
			
		} else {
			
			System.out.println("El n�mero "+max+" no contiene al n�mero "+min);
			
		}

	}

}
