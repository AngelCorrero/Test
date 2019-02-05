package golfistas;

public class ordenacion {
	public static int quickiterac=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vector=generaVectorAleatorio(100000,1,100);
		int [] vector1={-4,-0,1,3,7,10,12};
		//int [] vector={5,3,1,7,4};
	
		
		
		//muestraVector(vector);
		long start_time = System.currentTimeMillis();
		//burbujaSimple(vector);
		//burbujaOptimizada(vector1);
		insercion(vector1);
		for(int i=0;i<vector1.length;i++) {
			System.out.print(vector1[i]+" ");
		}
		//seleccion(vector1);
		//quicksort(vector1,0,vector1.length-1);
		//System.out.println("\nIteraciones quicksort: "+quickiterac);
		//mergesort(vector,0,vector.length);
		//muestraVector(vector);
		//muestraVector(vectorpos);
		//busquedaBinaria(vector1, 12);
		long end_time = System.currentTimeMillis();
		//muestraVector(vector);
		long diferencia=end_time-start_time;
		System.out.println("\n\nTiempo: "+diferencia+" milisegundos");
	}
	
	public static int [] generaVectorAleatorio(int tam , int min ,int max){
		
		int [ ]vector12=new int[tam];
		
		for(int i = 0; i < vector12.length ; i++ ){
			int  aleatorio = (int) (Math.random()*(max))+min;
			vector12[i]=aleatorio;
		}
		return vector12;
	}
	
	static void muestraVector(int[] vec)
	{
		System.out.print("\n"+vec[0]);
		for(int i=1; i<vec.length; i++)
			System.out.print(","+vec[i]);
	}
	
	static void burbujaSimple(int[] vector)
	{
		int temp;
		 for (int i=1; i<vector.length; i++)
			 for(int j=0 ; j<=(vector.length - 2); j++)
			 {
				 if (vector[j] > vector[j+1])
				 {
					 temp = vector[j];
					 vector[j] = vector[j+1];
					 vector[j+1] = temp;
				 }
			 }
	}
	
	static void burbujaOptimizada(int vector[])
	{
		int temp;
		int i, j;
		for (i = 1; i < vector.length; i++) {
			for (j = 0; j < i; j++) {
				if (vector[i] < vector[j]) {
					temp = vector[j];
					vector[j] = vector[i];
					vector[i] = temp;
				}
			}
		}
	}
	
	static void insercion(int vector[])
	{
		int i, temp, j;
		for (i = 1; i < vector.length; i++) {
			temp = vector[i];
			j = i - 1;
			while ((j >= 0) && (vector[j] < temp)) {
				vector[j + 1] = vector[j];
				j--;
			}
			vector[j + 1] = temp;
		}
	}
	
	static void seleccion(int[]vector)
	{
		int  pos, temp;
		for (int i = 0; i <= (vector.length - 2); i++) {
			pos = i;
			for (int j = i + 1; j < vector.length; j++)
				if (vector[j] < vector[pos])
					pos = j;
			
			if (pos != i) {
				temp = vector[pos];
				vector[pos] = vector[i];
				vector[i] = temp;
			}
		}
	}
	
	

	public static void quicksort(int A[], int izq, int der) {

		  int pivote=A[izq]; // tomamos primer elemento como pivote
		  int i=izq; // i realiza la búsqueda de izquierda a derecha
		  int j=der; // j realiza la búsqueda de derecha a izquierda
		  int aux;
		 
		  while(i<j){            // mientras no se crucen las búsquedas
		     while(A[i]<=pivote && i<j){ 
		    	 i++; 
		      	// busca elemento mayor que pivote
		     }
		     while(A[j]>pivote)
		     {
		    	 j--;
		    	 // busca elemento menor que pivote
		     }
		     if (i<j) {                      // si no se han cruzado                      
		         aux= A[i];                  // los intercambia
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
		   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
		   if(izq<j-1)
		      quicksort(A,izq,j-1); // ordenamos subarray izquierdo
		   if(j+1 <der)
		      quicksort(A,j+1,der); // ordenamos subarray derecho
		}
	
	public static void mergesort(int[ ] matrix, int init, int n)
	{
		int n1;
		int n2;
		if (n > 1) {
			n1 = n / 2;
			n2 = n - n1;
			mergesort(matrix, init, n1);
			mergesort(matrix, init + n1, n2);
			merge(matrix, init, n1, n2);
		}
	}
	
	private static void merge(int[ ] matrix, int init, int n1, int n2)
 {
		int[] buffer = new int[n1 + n2];
		int temp = 0;
		int temp1 = 0;
		int temp2 = 0;
		int i;
		while ((temp1 < n1) && (temp2 < n2)) {
			if (matrix[init + temp1] < matrix[init + n1 + temp2])
				buffer[temp++] = matrix[init + (temp1++)];
			else
				buffer[temp++] = matrix[init + n1 + (temp2++)];
		}
		while (temp1 < n1)
			buffer[temp++] = matrix[init + (temp1++)];
		while (temp2 < n2)
			buffer[temp++] = matrix[init + n1 + (temp2++)];
		for (i = 0; i < n1 + n2; i++)
			matrix[init + i] = buffer[i];
	}
	
	 public static int busquedaBinaria(int  vector[], int dato)
	 {
		 int centro,inf=0,sup=vector.length-1;
		   while(inf<=sup)
		   {
		     centro=(sup+inf)/2;
		     if(vector[centro]==dato) 
		    	 return centro;
		     else if(dato < vector [centro] )
		        sup=centro-1;
		     else 
		       inf=centro+1;
		   }
		   return -1;
		 }
	 
	 

}
