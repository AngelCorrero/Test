package masEjerciciosFunciones1;

public class EjercicioFechasFunciones {
	static final int DIAHOY=9, MESHOY=12, ANYOHOY=2016;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia=0, anyo=0, mes=0;
		String mesCad=" ";
		
		while (!fechaCorrecta(dia, mes, anyo)) {
			System.out.println("Introduce dia: ");
			dia = Entrada.entero();
			
			System.out.println("Introduce mes en cadena: ");
			mesCad = Entrada.cadena().toUpperCase();
			mes=pasaMesAEntero(mesCad);
			
			System.out.println("Introduce año: ");
			anyo = Entrada.entero();
		}
		System.out.println(calculaEdad(dia, mes, anyo));
	}
	
	public static boolean esBisiesto(int anyo) {
		// TODO Auto-generated method stub
		boolean bisiesto=false;
		if (anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0)) {
			bisiesto=true;
		}
		return (bisiesto);
	}
	
	public static int pasaMesAEntero(String mesCad) {
		// TODO Auto-generated method stub
		switch (mesCad) {
		case "ENERO":
			return (1);
			
		case "FEBRERO":
			return (2);
			
		case "MARZO":
			return (3);
			
		case "ABRIL":
			return (4);
			
		case "MAYO":
			return (5);
			
		case "JUNIO":
			return (6);
			
		case "JULIO":
			return (7);
			
		case "AGOSTO":
			return (8);
			
		case "SEPTIEMBRE":
			return (9);
			
		case "OCTUBRE":
			return (10);
			
		case "NOVIEMBRE":
			return (11);
			
		case "DICIEMBRE":
			return (12);

		default:
			return (0);
		}
	}
	
	public static int diasMes(int mes, int anyo) {
		// TODO Auto-generated method stub
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			return (31);
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			return (30);
		} else if (mes == 2) {
			if (esBisiesto(anyo)) {
				return (29);
			} else {
				return (28);
			}
		} else {
			return (0);
		}
	}
	
	public static boolean fechaCorrecta(int dia, int mes, int anyo) {
		// TODO Auto-generated method stub
		if (dia>diasMes(mes, anyo) || dia<1 || mes<1 || mes>12 || anyo<1 || anyo>ANYOHOY || (anyo==ANYOHOY && esMayor(dia, mes))) {
			return (false);
		} else {
			return (true);
		}
	}
	
	public static boolean esMayor(int dia, int mes) {
		// TODO Auto-generated method stub
		if (mes>MESHOY || (mes==MESHOY && dia>DIAHOY)) {
			return (true);
		} else {
			return (false);
		}
	}
	
	public static int calculaEdad(int dia, int mes, int anyo) {
		// TODO Auto-generated method stub
		int edad=0;
		
		edad=ANYOHOY-anyo;
		if (esMayor(dia, mes)) {
			edad--;
		}
		return (edad);
	}

}
