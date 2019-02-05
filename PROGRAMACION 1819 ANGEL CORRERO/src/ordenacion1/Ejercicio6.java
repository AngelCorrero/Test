package ordenacion1;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vector = generaVectorAleatorio(50 , 10 ,80);
		int [] vector1 = {3,4,2,2,2,10,5,6,7,7,1,7,7};
		
		ejercicio6(vector);
 		
		for(int i=0;i<vector.length;i++) {
			System.out.print(vector[i]+", ");
		}

	}
	
	public static int [] generaVectorAleatorio(int tam , int min ,int max){
		
		int [ ]vector12=new int[tam];
		
		for(int i = 0; i < vector12.length ; i++ ){
			int  aleatorio = (int) (Math.random()*(max))+min;
			vector12[i]=aleatorio;
		}
		return vector12;
	}
	
	public static int valorRepetido(int  vector[]) {
		 int i=0, temp=vector[i], rep=0, numRep1=0, numRepMax=0;
		   while(i<vector.length)
		   {
			   if (vector[i]==temp) {
				   
				   numRep1++;
				
			   } else {
				   
				   numRep1=0;
				   temp=vector[i];
				
			   }
			   
			   if (numRep1>numRepMax) {
				   
				   rep=vector[i];
				   numRepMax=numRep1;
				
			   }
			   
			   i++;
		   }
		   return rep;
	}
	
	public static int numeroMayor(int  vector[]) {
		 int i=0, max=vector[i];
		   while(i<vector.length)
		   {
			   if (vector[i]>max) {
				   
				   max=vector[i];
				
			   }
			   
			   i++;
		   }
		   return max;
	}
	
	public static int numeroMenor(int  vector[]) {
		 int i=0, min=vector[i];
		   while(i<vector.length)
		   {
			   if (vector[i]<min) {
				   
				   min=vector[i];
				
			   }
			   
			   i++;
		   }
		   return min;
	}
	
	public static int media(int  vector[]) {
		 int i=0, acu=0, media=0;
		   while(i<vector.length){
			   
			   acu=acu+vector[i];
			   i++;
		   }
		   System.out.println(acu);
		   media=acu/vector.length;
		   
		   return media;
	}
	
	public static int busquedaBinaria(int  vector[], int dato) {
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
	
	public static void ejercicio6(int  vector[]){
		int min=0, max=0, i=0, acu=0, media=0, temp=0, rep=0, numRep=0, numRepMax=0;
		ordenacion.quicksort(vector,0,vector.length-1);
		
		min=vector[0];
		System.out.println("El mínimo es "+min);
		max=vector[vector.length-1];
		System.out.println("El máximo es "+max);
		
		while(i<vector.length){
			   acu=acu+vector[i];
			   i++;
		   }
		media=acu/vector.length;
		System.out.println("La media es "+media);
		
		temp=vector[0];
		
		for(i=0;i<vector.length;i++) {
			   if (vector[i]==temp) {
				   numRep++;
			   } else {
				   numRep=0;
				   temp=vector[i];
			   }
			   if (numRep>numRepMax) {
				   rep=vector[i];
				   numRepMax=numRep;
			   }
		 }
		 System.out.println("El valor que mas se repite es "+rep);
		
	}

}
