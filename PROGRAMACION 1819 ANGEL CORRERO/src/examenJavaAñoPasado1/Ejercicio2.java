package examenJavaAñoPasado1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCarta=0, numPalo=0, numUsuario=0, i=3;
		String paloCarta=" ", paloUsuario=" ";
		boolean victoria=false;
		
		numCarta=(int)((Math.random()*12)+1);
		
		numPalo=(int)((Math.random()*4)+1);
		
		System.out.println(numCarta);
		
		switch (numPalo) {
		case 1:
			paloCarta="oros";
			break;
			
		case 2:
			paloCarta="espadas";
			break;
			
		case 3:
			paloCarta="copas";
			break;
			
		case 4:
			paloCarta="bastos";
			break;

		default:
			break;
		}
		
		System.out.println(paloCarta);
		
		while (i>0) {
			
			System.out.println("Introduce el número de la carta");
			numUsuario = Entrada.entero();
			
			System.out.println("Introduce el palo de la carta");
			paloUsuario = Entrada.cadena();
			
			if (numCarta==numUsuario) {
				
				if (paloCarta.equalsIgnoreCase(paloUsuario)) {
					
					i=0;
					
					victoria=true;
					
				}
				
			}
			
			i--;
			
			if (i!=0) {
				
				System.out.println("FALLASTE!");
				
				System.out.println("Te Quedan "+i+" intentos");
				
			}
			
		}
		
		if (victoria==true) {
			
			System.out.println("MUY BIEN! ACERTASTE!");
			
		} else {
			
			System.out.println("FALLASTE!");
			
			System.out.println("La carta era el "+numCarta+" de "+paloCarta);
			
		}

	}

}
