package vectores1;

public class VectoresyFunciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, tam=0, min=0, max=0;
		int [] vector= new int[10];
		int [] vector2= new int[10];
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=(int)(Math.random()*5)+1;
		}
		
		for(int i=0;i<vector2.length;i++) {
			vector2[i]=(int)(Math.random()*5)+1;
		}
		
		/*muestraValoresVector(vector);
		
		System.out.println("Introduce un número: ");
		num = Entrada.entero();
		
		System.out.println(devuelvePosicion(vector, num));*/
		
		/*muestraValoresVector(vector);

		System.out.println("Introduce un número: ");
		num = Entrada.entero();
		
		multiplicaPropioVector(vector, num);
		muestraValoresVector(vector);*/
		
		/*muestraValoresVector(vector);
		
		System.out.println("Introduce un número: ");
		num = Entrada.entero();
		
		muestraValoresVector(multiplicaVectorEnOtro(vector, num));*/
		
		/*muestraValoresVector(vector);
		System.out.println();
		muestraValoresVector(vector2);
		System.out.println();
		muestraValoresVector(sumaVectores(vector, vector2));*/
		
		/*muestraValoresVector(vector);
		System.out.println();
		muestraValoresVector(valoresPares(vector));*/
		
		muestraValoresVector(vector);
		
		System.out.println("Introduce un número: ");
		num = Entrada.entero();
		
		int [] vector3= devuelvePosiciones(vector, num);
		
		for(int i=0;i<vector3.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vector[vector3[i]]);
		}
		
		/*System.out.println("Introduce el tamaño: ");
		tam = Entrada.entero();
		
		System.out.println("Introduce el número mínimo: ");
		min = Entrada.entero();
		
		System.out.println("Introduce el número máximo: ");
		max = Entrada.entero();
		
		muestraValoresVector(sumaVectores(tam, min, max));*/

	}
	
	public static void muestraValoresVector(int [] vector) {
		
		for(int i=0;i<vector.length;i++) {
			System.out.println("En la posición "+i+" está el valor "+vector[i]);
		}
	}
	
	public static int devuelvePosicion(int [] vector, int num) {
		int i=0, pos=0;
		boolean encontrado=false;
		while(i<vector.length && !encontrado) {
			if (vector[i]==num) {
				encontrado=true;
				pos=i;
			}
			i++;
		}
		if (encontrado) {
			return(pos);
		} else {
			return(-1);
		}
	}
	
	public static void multiplicaPropioVector(int [] vector, int num) {
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=vector[i]*num;
		}
	}
	
	public static int [] multiplicaVectorEnOtro(int [] vector, int num) {
		int [] v_aux = new int[10];
		
		for(int i=0;i<v_aux.length;i++) {
			v_aux[i]=vector[i]*num;
		}
		
		return (v_aux);
	}
	
	public static int [] sumaVectores(int [] vector, int [] vector2) {
		int [] v_aux = new int[10];
		
		for(int i=0;i<vector.length;i++) {
			v_aux[i]=vector[i]+vector2[i];
		}
		
		return (v_aux);
	}
	
	public static int [] valoresPares(int [] vector) {
		int pares=0, j=0;
		
		for(int i=0;i<vector.length;i++) {
			if (vector[i]%2==0) {
				pares++;
			}
		}
		
		int [] v_aux = new int[pares];
		
		for(int i=0;i<vector.length;i++) {
			if (vector[i]%2==0) {
				v_aux[j]=vector[i];
				j++;
			}
		}
		
		return (v_aux);
	}
	
	public static int [] devuelvePosiciones(int [] vector, int num) {
		int numPos=0, j=0;
		
		for(int i=0;i<vector.length;i++) {
			if (vector[i]==num) {
				numPos++;
			}
		}
		
		int [] v_aux = new int[numPos];
		
		for(int i=0;i<vector.length;i++) {
			if (vector[i]==num) {
				v_aux[j]=i;
				j++;
			}
		}
		
		return (v_aux);
	}
	
	public static int [] generaVectorAleatorio(int tam, int min, int max) {
		int [] v_aux = new int[tam];
		
		for(int i=0;i<v_aux.length;i++) {
			v_aux[i]=(int)(Math.random()*(max-min+1))+min;
		}
		
		return (v_aux);
	}

}
