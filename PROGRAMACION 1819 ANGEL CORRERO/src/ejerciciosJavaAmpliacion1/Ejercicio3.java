package ejerciciosJavaAmpliacion1;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia=0, mes=0, anyo=0;
		boolean valido=false;
		
		System.out.println("Introduce un dia: ");
		dia = Entrada.entero();
		
		System.out.println("Introduce un mes: ");
		mes = Entrada.entero();
		
		System.out.println("Introduce un anyo: ");
		anyo = Entrada.entero();
		
		while (valido==false) {
			
			if (mes>=1 && mes<=12) {
				
				if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
					
					if (dia>=1 && dia<=31) {
						
						valido=true;
						
					}
					
				}
				
				if (mes==4 || mes==6 || mes==9 || mes==11) {
					
					if (dia>=1 && dia<=30) {
						
						valido=true;
						
					}
					
				}
				
				if (mes==2) {
					
					if (anyo%4==0 && (anyo%100!=0 || anyo%400==0)) {
						
						if (dia>=1 && dia<=29) {
							
							valido=true;
							
						}
						
					} else {
						
						if (dia>=1 && dia<=28) {
							
							valido=true;
							
						}
						
					}
					
				}
				
			}
			
		}
		
		if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ) {
			
			if (dia==31 && mes!=12) {
				
				dia=1;
				
				mes++;
				
			} else {
				
				if (mes==12 && dia==31) {
					
					dia=1;
					
					anyo++;
					
					mes=1;
					
				} else {
					
					dia++;
					
				}
				
			}
			
		}
		
		if (mes==4 || mes==6 || mes==9 || mes==11) {
			
			if (dia==30) {
				
				dia=1;
				
				mes++;
				
			} else {
				
				dia++;
				
			}
			
		}
		
		if (mes==2) {
			
			if (anyo%4==0 && (anyo%100!=0 || anyo%400==0)) {
				
				if (dia==29) {
					
					dia=1;
					
					mes++;
					
				} else {
					
					dia++;
					
				}
				
			} else {
				
				if (dia==28) {
					
					dia=1;
					
					mes++;
					
				} else {
					
					dia++;
					
				}
				
			}
			
		}
		
		System.out.println("El día siguiente al introducido es el "+dia+" del "+mes+" de "+anyo);

	}

}
