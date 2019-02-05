package vectores1;

public class Ejercicio6B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, i=0, j=0;
		boolean repetido=false;
		int [] vectorSinRepetir= new int[10];
		
		while(i<vectorSinRepetir.length) {
			num=(int)(Math.random()*10+1);
			while (j < i && repetido==false) {
				if (num==vectorSinRepetir[j]) {
					repetido=true;
				}
				j++;
			}
			if (repetido==false) {
				vectorSinRepetir[i]=num;
				i++;
			}
			repetido=false;
			j=0;
		}
		
		for(int h=0;h<vectorSinRepetir.length;h++) {
			System.out.println("En la posición "+h+" está el valor "+vectorSinRepetir[h]);
		}

	}

}
