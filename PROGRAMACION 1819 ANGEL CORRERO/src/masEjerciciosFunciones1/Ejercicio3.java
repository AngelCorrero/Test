package masEjerciciosFunciones1;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char tipoNum=' '; 
		int numFinal=0, numA=0, numB=0, numC=0, numD=0;
		String cadFinal="", cadA="", cadB="", cadC="", cadD="";
		
		tipoNum=escoger();
		switch (tipoNum) {
		case 'a':
			numA=generaDigitoAleatorioBin();
			numB=generaDigitoAleatorioBin();
			numC=generaDigitoAleatorioBin();
			numD=generaDigitoAleatorioBin();
			numFinal=creaNumeroAleatorio(numA, numB, numC, numD);
			System.out.println(numFinal);
			break;
		case 'b':
			numA=generaDigitoAleatorioOct();
			numB=generaDigitoAleatorioOct();
			numC=generaDigitoAleatorioOct();
			numD=generaDigitoAleatorioOct();
			numFinal=creaNumeroAleatorio(numA, numB, numC, numD);
			System.out.println(numFinal);
			break;
		case 'c':
			numA=generaDigitoAleatorioDec();
			numB=generaDigitoAleatorioDec();
			numC=generaDigitoAleatorioDec();
			numD=generaDigitoAleatorioDec();
			numFinal=creaNumeroAleatorio(numA, numB, numC, numD);
			System.out.println(numFinal);
			break;
		case 'd':
			cadA=generaDigitoAleatorioHex();
			cadB=generaDigitoAleatorioHex();
			cadC=generaDigitoAleatorioHex();
			cadD=generaDigitoAleatorioHex();
			cadFinal=creaCadenaAleatoria(cadA, cadB, cadC, cadD);
			System.out.println(cadFinal);
			break;

		default:
			break;
		}

	}
	
	public static char escoger(){
		char tipoNum=' ';
		boolean valido=false;
		while (valido==false) {
			System.out.println("Escoge una de las siguientes opciones: ");
			System.out.println("a.Binario");
			System.out.println("b.Octal");
			System.out.println("c.Decimal");
			System.out.println("d.Hexadecimal");
			tipoNum=Entrada.caracter();
			if (tipoNum=='a' || tipoNum=='b' || tipoNum=='c' || tipoNum=='d' ) {
				valido=true;
			} else {
				System.out.println("Opción incorrecta.");
				valido=false;
			}
		}
		return (tipoNum);
	}
	
	public static int generaDigitoAleatorioBin() {
		int num=0;
		num=(int)Math.round(Math.random());
		return (num);
	}
	
	public static int generaDigitoAleatorioOct() {
		int num=0;
		num=(int)Math.round(Math.random()*7);
		return (num);
	}
	
	public static int generaDigitoAleatorioDec() {
		int num=0;
		num=(int)Math.round(Math.random()*9);
		return (num);
	}
	
	public static String generaDigitoAleatorioHex() {
		int num=0;
		String numHex=" ";
		num=(int)Math.round(Math.random()*15);
		switch (num) {
		case 0:
			numHex="0";
			break;
		case 1:
			numHex="1";
			break;
		case 2:
			numHex="2";
			break;
		case 3:
			numHex="3";
			break;
		case 4:
			numHex="4";
			break;
		case 5:
			numHex="5";
			break;
		case 6:
			numHex="6";
			break;
		case 7:
			numHex="7";
			break;
		case 8:
			numHex="8";
			break;
		case 9:
			numHex="9";
			break;
		case 10:
			numHex="A";
			break;
		case 11:
			numHex="B";
			break;
		case 12:
			numHex="C";
			break;
		case 13:
			numHex="D";
			break;
		case 14:
			numHex="E";
			break;
		case 15:
			numHex="F";
			break;
		default:
			break;
		}
		return (numHex);
	}
	
	public static int creaNumeroAleatorio(int numA, int numB, int numC, int numD) {
		int numFinal=0;
		numFinal=numA;
		numFinal=numFinal*10+numB;
		numFinal=numFinal*10+numC;
		numFinal=numFinal*10+numD;
		return (numFinal);
	}
	
	public static String creaCadenaAleatoria(String cadA, String cadB, String cadC, String cadD) {
		String cadFinal="";
		cadFinal=cadA+cadB+cadC+cadD;
		return (cadFinal);
	}

}
