package ordenacion1;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vector = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		System.out.println(busquedabin(vector, 6));

	}
	
	public static int busquedabin(int  vector[], int dato) {
		int centro,inf=0,sup=vector.length-1;
		while(inf<=sup) {
			centro=(sup+inf)/2;
			System.out.println("La posición min es "+inf+" y su valor es "+vector[inf]);
			System.out.println("La posición intermedia es "+centro+" y su valor es "+vector[centro]);
			System.out.println("La posición max es "+sup+" y su valor es "+vector[sup]);
			if(vector[centro]==dato) {
				return centro;
			}
			else if(dato < vector [centro] ) {
			        sup=centro-1;
			}
			else {
			       inf=centro+1;
			}
		}
		return -1;

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

}
