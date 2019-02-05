package matrices1;

public class EjerciciosInicialesMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, max=0;
		int [][] matrizCuadrada={{6,3,5},{4,8,7},{6,7,3}};
		
		int [][] matrizEscalar={{2,3,4},{4,6,6},{6,2,8}};
		
		int [][] matrizIdentidad={{1,0,0},{0,1,0},{0,0,1}};
		
		int [][] matrizNOCuadrada={{1,3,6},{4,6},{6,7,3,9,6}};
		
		int [][] matrizTriangular={{5,0},{0,1,0,6},{0,0,9,0}};
		
		int [][] matrizTriangularSuperior={{5,0,0,0},{7,1,0},{3,2,9}};
		
		int [][] matrizTriangularInferior={{5,4,7},{0,1,6},{0,0,9}};
		
		double [][] matrizCuadrada2={{2,1,2},{3,2,1},{2,2,1}};
		
		double [][] matrizEscalar2={{3,1,2},{1,2,0},{2,2,0}};
		
		double [][] matrizIdentidad2={{1,0,0},{0,1,0},{0,0,1}};
		
		double [][] matrizNOCuadrada2={{1,3,6},{4,6},{6,7,3,9,6}};
		
		double [][] matrizTriangular2={{5,0},{0,1,0,6},{0,0,9,0}};
		
		double [][] matrizTriangularSuperior2={{5,0,0,0},{7,1,0},{3,2,9}};
		
		double [][] matrizTriangularInferior2={{5,4,7},{0,1,6},{0,0,9}};
		
		//Ejercicio 1
		//System.out.println(sumaMatriz(matrizNOCuadrada));
		
		//Ejercicio 2
		/*System.out.println("Introduce un número: ");
		num = Entrada.entero();
		
		buscaElemento(matrizNOCuadrada, num);*/
		
		//Ejercicio 3
		//System.out.println(esMatrizCuadrada(matrizCuadrada));
		
		//System.out.println(esMatrizEscalar(matrizEscalar));
		
		//System.out.println(esMatrizIdentidad(matrizIdentidad));
		
		//esMatrizTriangular(matrizTriangular);
		
		/*double [][] sumaMatrices=sumaMatrices(matrizCuadrada2, matrizNOCuadrada2);
		
		for(int i=0;i<sumaMatrices.length;i++)
			for(int j=0;j<sumaMatrices[i].length;j++)
			{
				System.out.println("Mostrando fila "+i
						+" columna "+j+" valor: "+sumaMatrices[i][j]);				
			}*/
		double [][] multiplicaMatrices=multiplicaMatrices(matrizCuadrada2, matrizEscalar2);
		
		for(int i=0;i<multiplicaMatrices[0].length;i++) {
			if (multiplicaMatrices[i].length>max) {
				max=i;
			}
		}
	
		for(int i=0;i<multiplicaMatrices[max].length;i++) {
				System.out.print("\t"+i);
			}
		
		System.out.println();
		
		for(int i=0;i<multiplicaMatrices.length;i++) {
			System.out.print(i);
			for(int j=0;j<multiplicaMatrices[i].length;j++) {
				System.out.print("\t"+multiplicaMatrices[i][j]);
			}
			System.out.println();
		}

	}
	
	public static int maxColum(int [][] matriz) {
		int max=0;
		
		for(int i=0;i<matriz[0].length;i++) {
			if (matriz[i].length>max) {
				max=i;
			}
		}
		return (max);
	}
	
	public static void muestraMatriz(int [][] matriz) {
		
		for(int i=0;i<matriz[maxColum(matriz)].length;i++) {
			System.out.print("\t"+i);
		}
	
		System.out.println();
	
		for(int i=0;i<matriz.length;i++) {
			System.out.print(i);
		
			for(int j=0;j<matriz[i].length;j++) {
			System.out.print("\t"+matriz[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public static int sumaMatriz(int [][] matriz) {
		int sumaMatriz=0;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++)
			{
				sumaMatriz=sumaMatriz+matriz[i][j];
			}
		}
		return (sumaMatriz);
	}
	
	public static void buscaElemento(int [][] matriz, int num) {
		int numApariciones=0;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++)
			{
				if (matriz[i][j]==num) {
					System.out.println("El número se encuentra en la fila "+i+" y la columna "+j);
					numApariciones++;
				}
			}
		}
		System.out.println("El número ha aparecido "+numApariciones+" veces");
	}
	
	public static boolean esMatrizCuadrada(int [][] matriz) {
		int i=0;
		boolean cuadrada=true;
		
		while(i<matriz.length && cuadrada) {
			if (matriz.length!=matriz[i].length) {
				cuadrada=false;
			}
			i++;
		}
		return (cuadrada);
	}
	
	public static boolean esMatrizEscalar(int [][] matriz) {
		int i=1, diagonal=matriz[0][0];
		boolean escalar=true;
		
		if (!esMatrizCuadrada(matriz)) {
			return false;
		}
		
		while(i<matriz.length && escalar) {
			if (matriz[i][i]!=diagonal) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static boolean esMatrizIdentidad(int [][] matriz) {
		int i=0, j=0;
		boolean identidad=true;
		
		if (!esMatrizCuadrada(matriz)) {
			return false;
		}
		
		if (!esMatrizTriangularSuperior(matriz) || !esMatrizTriangularInferior(matriz)) {
			return false;
		}
		
		/*while(i<matriz.length && identidad) {
			
			while (j<matriz[i].length && identidad) {
				
				if (matriz[i][j]!=0 && i!=j) {
					return false;
				}
				j++;
				
			}*/
			
			if (matriz[i][i]!=1) {
				return false;
			}
			
			j=0;
			i++;
		return true;
	}
	
	public static void esMatrizTriangular(int [][] matriz) {
		int i=0, j=0;
		boolean triangular=true;
		
		if (esMatrizTriangularSuperior(matriz) && esMatrizTriangularSuperior(matriz) && digonalDistintaDe0(matriz)) {
			System.out.println("Es triangular.");
					
		} else if (esMatrizTriangularSuperior(matriz)) {
			System.out.println("Es triangular superior");
			
		} else if (esMatrizTriangularInferior(matriz)) {
			System.out.println("Es triangular inferior");
			
		} else {
			System.out.println("No es triangular");
			
		}
	}
	
	public static boolean digonalDistintaDe0(int [][] matriz) {
		int i=0;
		while(i<matriz.length) {
			if (matriz[i][i]!=0) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static boolean esMatrizTriangularInferior(int [][] matriz) {
		int i=0, j=0;
		
		if (!esMatrizCuadrada(matriz)) {
			return false;
		}
		
		while(i<matriz.length) {
			while (j<matriz[i].length) {
				if (matriz[i][j]!=0 && j>i) {
					return false;
				}
				j++;
			}
			j=0;
			i++;
		}
		return true;
	}
	
	public static boolean esMatrizTriangularSuperior(int [][] matriz) {
		int i=0, j=0;
		
		if (!esMatrizCuadrada(matriz)) {
			return false;
		}
		
		while(i<matriz.length) {
			while (j<matriz[i].length) {
				if (matriz[i][j]!=0 && j<i) {
					return false;
				}
				j++;
			}
			j=0;
			i++;
		}
		return true;
	}
	
	public static double [][] sumaMatrices(double [][] matriz1, double [][] matriz2) {
		int i=0, j=0;
		double [][] sumaMatrices=matriz1.clone();
		boolean iguales=true;
		
		if (matriz1.length!=matriz2.length) {
			iguales=false;
		}
		
		while(i<matriz1.length && iguales) {
			if (matriz1[i].length!=matriz2[i].length) {
				iguales=false;
			}
			i++;
		}
		
		i=0;
		
		while(i<matriz1.length && iguales) {
			while (j<matriz1[i].length && iguales) {
				sumaMatrices[i][j]=matriz1[i][j]+matriz2[i][j];
				j++;
			}
			j=0;
			i++;
		}
		
		if (!iguales) {
			while(i<matriz1.length) {
				while (j<matriz1[i].length) {
					sumaMatrices[i][j]=0;
					j++;
				}
				j=0;
				i++;
			}
		}
		
		return (sumaMatrices);
	}
	
	public static double [][] multiplicaMatrices(double [][] matriz1, double [][] matriz2) {
		int i=0, j=0, h=0; 
		double acumulador=0;
		double [][] multiplicaMatrices=new double[3][3];
		boolean iguales=true;
		
		while(i<matriz1.length && iguales) {
			if (matriz1.length!=matriz2[i].length) {
				iguales=false;
			}
			i++;
		}
		
		i=0;
		
		while(i<matriz1.length && iguales) {
			while (h<matriz1[i].length && iguales) {
				while (j<matriz1[i].length && iguales) {
					acumulador=acumulador+matriz1[i][j]*matriz2[j][h];
					j++;
				}
				multiplicaMatrices[i][h]=acumulador;
				h++;
				acumulador=0;
				j=0;
			}
			h=0;
			i++;
		}
		
		/*if (!iguales) {
			while(i<matriz1.length) {
				while (j<matriz1[i].length) {
					multiplicaMatrices[i][j]=0;
					j++;
				}
				j=0;
				i++;
			}
		}*/
		
		return (multiplicaMatrices);
	}

}
