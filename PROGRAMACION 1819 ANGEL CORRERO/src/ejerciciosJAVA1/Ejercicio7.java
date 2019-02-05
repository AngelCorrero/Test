package ejerciciosJAVA1;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cifra0=0, cifra1=0, cifra2=0, cifra3=0, cifra4=0, cifra5=0, cifra6=0, cifra7=0, cifra8=0, cifra9=0, numUsuario=0, resto=0;
		
		System.out.println("Introduce un número entero");
		numUsuario = Entrada.entero();
		
		while (numUsuario>0) {
			
			resto=numUsuario%10;
			
			switch ((int)resto) {
			case 0:
				
				cifra0++;
				
				break;
			case 1:
				
				cifra1++;
				
				break;
			case 2:
				
				cifra2++;
				
				break;
			case 3:
				
				cifra3++;
				
				break;
			case 4:
				
				cifra4++;
				
				break;
			case 5:
				
				cifra5++;
				
				break;
			case 6:
				
				cifra6++;
				
				break;
			case 7:
				
				cifra7++;
				
				break;
			case 8:
				
				cifra8++;
				
				break;
			case 9:
				
				cifra9++;
				
				break;
			}
			
			numUsuario=numUsuario/10;
			
		}
		
		System.out.println("Cifra 0: hay "+cifra0+" en su número");
		System.out.println("Cifra 1: hay "+cifra1+" en su número");
		System.out.println("Cifra 2: hay "+cifra2+" en su número");
		System.out.println("Cifra 3: hay "+cifra3+" en su número");
		System.out.println("Cifra 4: hay "+cifra4+" en su número");
		System.out.println("Cifra 5: hay "+cifra5+" en su número");
		System.out.println("Cifra 6: hay "+cifra6+" en su número");
		System.out.println("Cifra 7: hay "+cifra7+" en su número");
		System.out.println("Cifra 8: hay "+cifra8+" en su número");
		System.out.println("Cifra 9: hay "+cifra9+" en su número");

	}

}
