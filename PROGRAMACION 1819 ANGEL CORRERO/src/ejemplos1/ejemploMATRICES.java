package ejemplos1;

public class ejemploMATRICES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz1=new int[4][5];
		
		int [][] matrizNOCuadrada={{1,2,3},{4,5},{6,7,8,9,10}};
		
		//Rellenando matriz1
		System.out.println("\n\nRellenando matriz1...\n\n");
		for(int i=0;i<matriz1.length;i++)
			for(int j=0;j<matriz1[i].length;j++)
			{
				System.out.println("Introduzca un valor para fila "+i+" columna "+j);
				matriz1[i][j]=Entrada.entero();
			}
		//Mostrando matriz1
		System.out.println("\n\nMostrando matriz1...\n\n");
		for(int i=0;i<matriz1.length;i++)
			for(int j=0;j<matriz1[i].length;j++)
			{
				System.out.println("Mostrando fila "+i
						+" columna "+j+", valor: "+matriz1[i][j]);				
			}
		
		//Mostrando matrizNOCuadrada
		System.out.println("\n\nMostrando matrizNOCuadrada...\n\n");
		for(int i=0;i<matrizNOCuadrada.length;i++)
			for(int j=0;j<matrizNOCuadrada[i].length;j++)
			{
				System.out.println("Mostrando fila "+i
						+" columna "+j+" valor: "+matrizNOCuadrada[i][j]);				
			}
	}

}
