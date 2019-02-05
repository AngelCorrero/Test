package vectores1;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, i=0;
		boolean repetido=false;
		int [] vectorSinRepetir= new int[10];
		
		while(i<vectorSinRepetir.length) {
			num=(int)(Math.random()*50+1);
			for (int j = 0; j < vectorSinRepetir.length; j++) {
				if (num==vectorSinRepetir[j]) {
					repetido=true;
				}
			}
			if (repetido==false) {
				vectorSinRepetir[i]=num;
				i++;
			}
			repetido=false;
		}
		
		for(int j=0;j<vectorSinRepetir.length;j++) {
			System.out.println("En la posición "+j+" está el valor "+vectorSinRepetir[j]);
		}

	}

}
