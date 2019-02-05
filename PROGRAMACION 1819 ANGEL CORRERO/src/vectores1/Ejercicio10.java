package vectores1;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos1=0, pos2=0, numPos1=0;
		char respuestaUusario=' ';
		boolean continuar=true;
		int [] vectorInicial= new int[10];
		
		for(int i=0;i<vectorInicial.length;i++) {
			System.out.println("Introduce un número para la posición "+i+" : ");
			vectorInicial[i]=Entrada.entero();
		}
		
		for(int i=0;i<vectorInicial.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vectorInicial[i]);
		}
		
		while (continuar) {
			
			System.out.println("Introduce una posición del vector: ");
			pos1 = Entrada.entero();
			
			System.out.println("Introduce una posición del vector: ");
			pos2 = Entrada.entero();
			
			numPos1=vectorInicial[pos1];
			
			vectorInicial[pos1]=vectorInicial[pos2];
			vectorInicial[pos2]=numPos1;
			
			for(int i=0;i<vectorInicial.length;i++) {
				System.out.println("En la posición "+i+" está el valor "+vectorInicial[i]);
			}
			
			System.out.println("¿Deseas trasponer más valores?(s/n)");
			respuestaUusario = Entrada.caracter();
			
			if (respuestaUusario=='n') {
				continuar=false;
			}
			
		}

	}

}
