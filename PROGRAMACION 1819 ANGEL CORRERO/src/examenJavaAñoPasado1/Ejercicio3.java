package examenJavaAñoPasado1;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numMin=0, numMax=0, i=1, divisores=0, primoMin=0, primoMax=0, distancia=0, distanciaMax=0, primoA=0, primoB=0;
		
		System.out.println("Introduzca el menor número del rango: ");
		numMin = Entrada.entero();
		
		System.out.println("Introduzca el mayor número del rango: ");
		numMax = Entrada.entero();
		
		while (numMin<=numMax) {
			
			while (i <= numMin/2 && divisores <= 1) {

				if (numMin % i == 0) {

					divisores++;

				}

				i++;

			}

			if (divisores == 1 || divisores == 0) {

				if (primoMin!=0) {
					
					primoMax=numMin;
					
				} else {
					
					primoMin=numMin;
					
				}

			}
			
			if (numMin==primoMax) {
				
				distancia=primoMax-primoMin-1;
				
				if (distancia>distanciaMax) {
					
					distanciaMax=distancia;
					
					primoA=primoMin;
					
					primoB=primoMax;
					
				}
				
				primoMin=primoMax;
				
			}
			
			numMin++;
			
			i=1;
			
			divisores=0;
			
		}
		
		System.out.println(primoMin);
		
		System.out.println("La mayor distancia entre dos primos es "+distanciaMax+" y está entre los primos "+primoA+" y "+primoB);

	}

}
