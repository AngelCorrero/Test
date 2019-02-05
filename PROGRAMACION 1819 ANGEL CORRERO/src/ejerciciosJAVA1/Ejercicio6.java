package ejerciciosJAVA1;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int ANYO=2018;
		int dia=0, mes=0, diaSemana=0, i=1, sumaDias=0;
		
		System.out.println("Introduce un dia: ");
		dia = Entrada.entero();
		
		System.out.println("Introduce un mes: ");
		mes = Entrada.entero();
		
		sumaDias=dia;
		
		while (i<mes) {
			
			if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12 ) {
				
				sumaDias=sumaDias+31;
				
			}
			
			if (i==4 || i==6 || i==9 || i==11) {
				
				sumaDias=sumaDias+30;
				
			}
			
			if (i==2) {
				
				if (ANYO%4==0 && (ANYO%100!=0 || ANYO%400==0)) {
					
					sumaDias=sumaDias+29;
					
				} else {
					
					sumaDias=sumaDias+28;
					
				}
				
			}
			
			i++;
			
		}
		
		diaSemana=sumaDias%7;
		
		switch (diaSemana) {
		case 0:
			
			System.out.println("El día "+dia+" del mes "+mes+" es: DOMINGO");
			
			break;
			
		case 1:
			
			System.out.println("El día "+dia+" del mes "+mes+" es: LUNES");
			
			break;
			
		case 2:
			
			System.out.println("El día "+dia+" del mes "+mes+" es: MARTES");
			
			break;
			
		case 3:
			
			System.out.println("El día "+dia+" del mes "+mes+" es: MIERCOLES");
			
			break;
			
		case 4:
			
			System.out.println("El día "+dia+" del mes "+mes+" es: JUEVES");
			
			break;
			
		case 5:
			
			System.out.println("El día "+dia+" del mes "+mes+" es: VIERNES");
			
			break;
			
		case 6:
			
			System.out.println("El día "+dia+" del mes "+mes+" es: SABADO");
			
			break;
		}
		
		System.out.println(sumaDias);

	}

}
