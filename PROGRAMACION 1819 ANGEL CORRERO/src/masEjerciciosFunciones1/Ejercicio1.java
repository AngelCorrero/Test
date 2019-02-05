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
			System.out.println("b.Rectángulo");
			System.out.println("c.Triángulo");
			System.out.println("d.Círculo");
			figura=Entrada.caracter();
			if (figura=='a' || figura=='b' || figura=='c' || figura=='d' ) {
				valido=true;
			} else {
				System.out.println("Opción incorrecta.");
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
			System.out.println("El area del rectángulo es "+area);
			break;
		case 'c':
			area=triangulo();
			System.out.println("El area del triángulo es "+area);
			break;
		case 'd':
			area=circulo();
			System.out.println("El area del círculo es "+area);
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
		System.out.println("Introduzca la base del rectángulo: ");
		base = Entrada.real();
		System.out.println("Introduzca la altura del rectángulo: ");
		altura = Entrada.real();
		area = base*altura ;
		return (area);
	}
	
	public static double triangulo() {
		double area = 0, base=0, altura=0;
		System.out.println("Introduzca la base del triángulo: ");
		base = Entrada.real();
		System.out.println("Introduzca la altura del triángulo: ");
		altura = Entrada.real();
		area = (base*altura)/2 ;
		return (area);
	}
	
	public static double circulo() {
		double area = 0, radio=0;
		System.out.println("Introduzca el radio del círculo: ");
		radio = Entrada.real();
		area = Math.PI*Math.pow(radio, 2) ;
		return (area);
	}

}
