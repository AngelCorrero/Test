package matrices1;

public class EjercicioOrdenaVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vector={4,1,1,9,8};
		
		for(int i=0;i<vector.length;i++) {
			System.out.print(" "+vector[i]);
		}
		ordenaVector(vector);
		System.out.println();
		for(int i=0;i<vector.length;i++) {
			System.out.print(" "+vector[i]);
		}

	}
	
	public static void ordenaVector(int [] vector) {
		int temp=0;
		for (int i=0; i<vector.length; i++) {
			for (int j=i; j<vector.length; j++) {
				if (vector[j]<vector[i]) {
					temp=vector[i];
					vector[i]=vector[j];
					vector[j]=temp;
				}
			}
		}
	}

	
	

}
