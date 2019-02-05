package ejerciciosJavaAmpliacion1;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unidades=0, decenas=0, centenas=0, millares=0, numUsuario=0, otro=0;
		String cadUnidades="", cadDecenas="", cadCentenas="", cadMillares="";
		
		System.out.println("Introduzca un número entero: ");
		numUsuario = Entrada.entero();
		
		otro=numUsuario;
		
		unidades=otro%10;
		
		switch (unidades) {
		case 1:
			
			cadUnidades="i";
			
			break;
			
		case 2:
			
			cadUnidades="ii";
			
			break;
			
		case 3:
			
			cadUnidades="iii";
			
			break;
			
		case 4:
			
			cadUnidades="iv";
			
			break;
			
		case 5:
			
			cadUnidades="v";
			
			break;
			
		case 6:
			
			cadUnidades="vi";
			
			break;
			
		case 7:
			
			cadUnidades="vii";
			
			break;
			
		case 8:
			
			cadUnidades="viii";
			
			break;
			
		case 9:
			
			cadUnidades="ix";
			
			break;

		default:
			break;
			
		}
		
		otro=otro/10;
		
		decenas=otro%10;
		
		switch (decenas) {
		case 1:
			
			cadDecenas="x";
			
			break;
			
		case 2:
			
			cadDecenas="xx";
			
			break;
			
		case 3:
			
			cadDecenas="xxx";
			
			break;
			
		case 4:
			
			cadDecenas="xl";
			
			break;
			
		case 5:
			
			cadDecenas="l";
			
			break;
			
		case 6:
			
			cadDecenas="lx";
			
			break;
			
		case 7:
			
			cadDecenas="lxx";
			
			break;
			
		case 8:
			
			cadDecenas="lxxx";
			
			break;
			
		case 9:
			
			cadCentenas="xc";
			
			break;

		default:
			break;
			
		}
		
		otro=otro/10;
		
		centenas=otro%10;
		
		switch (centenas) {
		case 1:
			
			cadCentenas="c";
			
			break;
			
		case 2:
			
			cadCentenas="cc";
			
			break;
			
		case 3:
			
			cadCentenas="ccc";
			
			break;
			
		case 4:
			
			cadCentenas="cd";
			
			break;
			
		case 5:
			
			cadCentenas="d";
			
			break;
			
		case 6:
			
			cadCentenas="dc";
			
			break;
			
		case 7:
			
			cadCentenas="dcc";
			
			break;
			
		case 8:
			
			cadCentenas="dccc";
			
			break;
			
		case 9:
			
			cadCentenas="cm";
			
			break;

		default:
			break;
			
		}
		
		otro=otro/10;
		
		millares=otro%10;
		
		switch (millares) {
		case 1:
			
			cadMillares="m";
			
			break;
			
		case 2:
			
			cadMillares="mm";
			
			break;
			
		case 3:
			
			cadMillares="mmm";
			
			break;
			
		}
		
		System.out.println(numUsuario+" "+cadMillares+cadCentenas+cadDecenas+cadUnidades);

	}

}
