package matrices1;

public class EjercicioDosCorredores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] tiemposCorredores=new double[2][5];
		
		pideTiempos(tiemposCorredores, 1);
		pideTiempos(tiemposCorredores, 2);
		
		double [] puntos=calculaPuntos(tiemposCorredores).clone();
		
		if (puntos[0]>puntos[1]) {
			
			System.out.println("El ganador es el corredor 1");
			
		} else if (puntos[0]<puntos[1]) {
			
			System.out.println("El ganador es el corredor 2");
			
		}  else {
			if (corredorConMenorTiempo(tiemposCorredores)==1) {
				
				System.out.println("El ganador es el corredor 1");
				
			} else if (corredorConMenorTiempo(tiemposCorredores)==2) {
				
				System.out.println("El ganador es el corredor 2");
				
			} else {
				
				System.out.println("Los corredores han empatado");
				
			}
		}

	}
	
	public static void pideTiempos(double [][] matriz, int corredor) {
		
		for(int j=0;j<matriz[0].length;j++)
			{
				if (corredor==1) {
					System.out.println("Introduzca el tiempo del corredor "+corredor+" en la carrera "+(j+1));
					matriz[0][j]=Entrada.entero();
				} else if (corredor==2) {
					System.out.println("Introduzca el tiempo del corredor "+corredor+" en la carrera "+(j+1));
					matriz[1][j]=Entrada.entero();
				}
			}

	}
	
	public static double [] calculaPuntos(double [][] matriz) {
		double [] puntos= new double[2];
		
		for(int j=0;j<matriz[0].length;j++) {
				if (matriz[0][j]<matriz[1][j]) {
					
					puntos[0]=puntos[0]+3;
					puntos[1]=puntos[1]+1;
					
				} else if (matriz[0][j]>matriz[1][j]) {
					
					puntos[0]=puntos[0]+1;
					puntos[1]=puntos[1]+3;
					
				} else {
					
					puntos[0]=puntos[0]+2;
					puntos[1]=puntos[1]+2;
					
				}
		}
		
		return puntos;

	}
	
	public static int corredorConMenorTiempo(double [][] matriz) {
		double tiempo1=0, tiempo2=0;
		
		for(int j=0;j<matriz[0].length;j++) {
			tiempo1=tiempo1+matriz[0][j];
			tiempo2=tiempo2+matriz[1][j];
		}
		
		if (tiempo1<tiempo2) {
			
			return 1;
			
		} else if (tiempo1>tiempo2) {
			
			return 2;
			
		} else {
			
			return 0;
			
		}

	}

}
