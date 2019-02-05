package ejerciciosJAVA1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ANYOACTUAL = 2018, MESACTUAL = 11, DIAACTUAL = 12;
		int dia = 0, mes = 0, anyo = 0, edad = 0;
		String cadenaMes = " ";
		boolean fechaMal=false;

		System.out.println("Indique su dia nacimiento: ");
		dia = Entrada.entero();

		System.out.println("Indique su mes nacimiento: ");
		cadenaMes = Entrada.cadena();

		System.out.println("Indique su año nacimiento: ");
		anyo = Entrada.entero();

		switch (cadenaMes) {
		case "ENERO":

			mes = 1;

			break;
		case "FEBRERO":

			mes = 2;

			break;
		case "MARZO":

			mes = 3;

			break;
		case "ABRIL":

			mes = 4;

			break;
		case "MAYO":

			mes = 5;

			break;
		case "JUNIO":

			mes = 6;

			break;
		case "JULIO":

			mes = 7;

			break;
		case "AGOSTO":

			mes = 8;

			break;
		case "SEPTIEMBRE":

			mes = 9;

			break;
		case "OCTUBRE":

			mes = 10;

			break;
		case "NOVIEMBRE":

			mes = 11;

			break;
		case "DICIEMBRE":

			mes = 12;

			break;

		}
		
		if (dia>=31 && !(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 )) {
			
			fechaMal=true;
			
		} else {
				
				if ((dia==29 && mes==2) && !(anyo%4==0 && (anyo%100!=0 || anyo%400==0))) {
					
					fechaMal=true;
					
				}
				
		}
		
		if (fechaMal==true) {
			
			System.out.println("La fecha introducida no es valida");
			
		} else {
			
			if (MESACTUAL > mes || (MESACTUAL == mes && DIAACTUAL < dia)) {

				edad = ANYOACTUAL - anyo;

			} else {

				edad = ANYOACTUAL - anyo - 1;

			}
			
			System.out.println("El usuario tiene " + edad + " años");
			
		}

	}

}
