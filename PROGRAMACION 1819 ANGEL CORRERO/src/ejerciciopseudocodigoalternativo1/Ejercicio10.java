package ejerciciopseudocodigoalternativo1;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1=" ", cad2=" ";
		
		System.out.println("Jugador 1 introduce piedra, papel o tijera");
		cad1 = Entrada.cadena();
		
		System.out.println("Jugador 2 introduce piedra, papel o tijera");
		cad2 = Entrada.cadena();
		
		if (cad1.equals(cad2)) {
			System.out.println("Los jugadores han empatado");
		}
		if (cad1.equals("piedra") && cad2.equals("tijera")) {
			System.out.println("El jugador 1 ha ganado");
		}
		if (cad1.equals("piedra") && cad2.equals("papel")) {
			System.out.println("El jugador 2 ha ganado");
		}
		if (cad1.equals("papel") && cad2.equals("piedra")) {
			System.out.println("El jugador 1 ha ganado");
		}
		if (cad1.compareTo("papel")==0 && cad2.compareTo("tijera")==0) {
			System.out.println("El jugador 2 ha ganado");
		}
		if (cad1.compareTo("tijera")==0 && cad2.compareTo("papel")==0) {
			System.out.println("El jugador 1 ha ganado");
		}
		if (cad1.compareTo("tijera")==0 && cad2.compareTo("piedra")==0) {
			System.out.println("El jugador 2 ha ganado");
		}

	}

}
