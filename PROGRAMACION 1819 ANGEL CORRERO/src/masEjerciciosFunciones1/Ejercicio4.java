package masEjerciciosFunciones1;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numUsuario=0;
		char forma=' ';
		
		forma = escogerForma();
		numUsuario=escogerNumero(forma);
		crearFigura(forma, numUsuario);
		
	}
	
	public static int escogerNumero(char forma){
		int numUsuario=0;
		if (forma=='c' || forma=='d') {
			while (numUsuario%2==0 || numUsuario<=1) {
				System.out.println("Introduzca un número impar mayor de 1: ");
				numUsuario = Entrada.entero();
			}
		} else {
			System.out.println("Introduzca un número: ");
			numUsuario = Entrada.entero();
		}
		return (numUsuario);
	}
	
	public static char escogerForma(){
		char forma=' ';
		boolean valido=false;
		while (valido==false) {
			System.out.println("Escoge la figura: ");
			System.out.println("a.Cuadrado lleno");
			System.out.println("b.Cuadrado vacio");
			System.out.println("c.Rombo lleno");
			System.out.println("d.Rombo vacio");
			forma = Entrada.caracter();
			if (forma=='a' || forma=='b' || forma=='c' || forma=='d' ) {
				valido=true;
			} else {
				System.out.println("Opción incorrecta.");
				valido=false;
			}
		}
		return (forma);
	}
	
	public static void cuadradoLleno(int numUsuario) {
		int i=1, j=1;
		while (i <= numUsuario) {
			while (j <= numUsuario) {
				System.out.print("* ");
				j++;
			}
			System.out.println("");
			i++;
			j = 1;
		}
	}
	
	public static void cuadradoVacio(int numUsuario) {
		int i=1, j=1;
		while (i <= numUsuario) {
			while (j <= numUsuario) {
				if (i == 1 || i == numUsuario) {
					System.out.print("* ");
				} else {
					if (j == 1 || j == numUsuario) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
				j++;
			}
			System.out.println("");
			i++;
			j = 1;
		}
	}
	
	public static void romboVacio(int numUsuario) {
		int i=0, j=1, k=0;
		while (i < numUsuario) {
			while (j < numUsuario*2) {
				if ((j == numUsuario-i || j == numUsuario+i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println("");
			i++;
			j = 1;
		}
		i=2;
		while (i <= numUsuario) {
			while (j < numUsuario*2) {
				if ((j == i || j == numUsuario*2-i)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println("");
			i++;
			j = 1;
		}
	}
	
	public static void romboLleno(int numUsuario) {
		int i=0, j=1, k=0;
		while (i < numUsuario) {
			while (j < numUsuario*2) {
				if ((j == numUsuario-i || j == numUsuario+i)) {
					System.out.print("*");
				} else {
					if (j > numUsuario-i && j%2==0 && j < numUsuario+1 && i%2==0) {
						System.out.print("*");
					} else {
						if (j > numUsuario-i && j%2!=0 && j < numUsuario+1 && i%2!=0) {
							System.out.print("*");
						}
						System.out.print(" ");
					}
				}
				j++;
			}
			System.out.println("");
			i++;
			j = 1;
		}
		i=2;
		while (i <= numUsuario) {
			while (j < numUsuario*2) {
				if ((j == i || j == numUsuario*2-i)) {
					System.out.print("*");
				} else {
					if ((j > i && j < (numUsuario*2)-i)) {
						System.out.print(" *");
					} else {
						System.out.print(" ");
					}
				}
				j++;
			}
			System.out.println("");
			i++;
			j = 1;
		}
	}
	
	public static void crearFigura(char forma, int numUsuario) {
		switch (forma) {
		case 'a':
			cuadradoLleno(numUsuario);
			break;
		case 'b':
			cuadradoVacio(numUsuario);
			break;
		case 'c':
			romboLleno(numUsuario);
			break;
		case 'd':
			romboVacio(numUsuario);
			break;
		default:
			break;
		}
	}
}
