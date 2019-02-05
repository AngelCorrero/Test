package vectores1;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, i=1;
		int [] vectorOrdenados= new int[10];
		
		vectorOrdenados[0]=(int)(Math.random()*50+1);
		
		while(i<vectorOrdenados.length) {
			num=(int)(Math.random()*50+1);
			if (num>=vectorOrdenados[i-1]) {
				vectorOrdenados[i]=num;
				i++;
			}
		}
		
		for(int j=0;j<vectorOrdenados.length;j++) {
			System.out.println("En la posición "+j+" está el valor "+vectorOrdenados[j]);
		}

	}

}
