package masEjerciciosFunciones1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char figura=' ';
		
		figura=escoger();
		area(figura);
		
	}
	
	public static char escoger(){
		char figura=' ';
		boolean valido=false;
		while (valido==false) {
			System.out.println("Escoge una de las siguientes opciones: ");
			System.out.println("a.Cuadrado");
			System.out.println("b.Rect�ngulo");
			System.out.println("c.Tri�ngulo");
			System.out.println("d.C�rculo");
			figura=Entrada.caracter();
			if (figura=='a' || figura=='b' || figura=='c' || figura=='d' ) {
				valido=true;
			} else {
				System.out.println("Opci�n incorrecta.");
				valido=false;
			}
		}
		return (figura);
	}
	
	public static void area(char figura) {
		double area=0;
		switch (figura) {
		case 'a':
			area=cuadrado();
			System.out.println("El area del cuadrado es "+area);
			break;
		case 'b':
			area=rectangulo();
			System.out.println("El area del rect�ngulo es "+area);
			break;
		case 'c':
			area=triangulo();
			System.out.println("El area del tri�ngulo es "+area);
			break;
		case 'd':
			area=circulo();
			System.out.println("El area del c�rculo es "+area);
			break;
		default:
			break;
		}
	}

	public static double cuadrado() {
		double area = 0, lado=0;
		System.out.println("Introduzca el lado del cuadrado: ");
		lado = Entrada.real();
		area = Math.pow(lado, 2) ;
		return (area);
	}

	public static double rectangulo() {
		double area = 0, base=0, altura=0;
		System.out.println("Introduzca la base del rect�ngulo: ");
		base = Entrada.real();
		System.out.println("Introduzca la altura del rect�ngulo: ");
		altura = Entrada.real();
		area = base*altura ;
		return (area);
	}
	
	public static double triangulo() {
		double area = 0, base=0, altura=0;
		System.out.println("Introduzca la base del tri�ngulo: ");
		base = Entrada.real();
		System.out.println("Introduzca la altura del tri�ngulo: ");
		altura = Entrada.real();
		area = (base*altura)/2 ;
		return (area);
	}
	
	public static double circulo() {
		double area = 0, radio=0;
		System.out.println("Introduzca el radio del c�rculo: ");
		radio = Entrada.real();
		area = Math.PI*Math.pow(radio, 2) ;
		return (area);
	}

}
