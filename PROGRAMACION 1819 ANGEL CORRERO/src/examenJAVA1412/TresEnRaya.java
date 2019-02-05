package examenJAVA1412;

public class TresEnRaya {
	static int x1=0, x2=0, x3=0, o1=0, o2=0, o3=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numFichProg=1, numFichUsu=1, movUsu=0;
		char otraPartida=' ';
		String cadMovUsu=" ";
		boolean quedanFichas=true, ganaPrograma=false, ganaUsuario=false, valido=false;
		
		System.out.println("¡Jugemos al tres en raya!");
		imprimeTablero();
		
		while (otraPartida!='n') {
			while (ganaUsuario==false && ganaPrograma==false && quedanFichas==true) {
				System.out.println("¡Tu turno!");
				
				while (valido==false) {
					System.out.println("Elige donde quieres colocar tu ficha: ");
					cadMovUsu = Entrada.cadena().toUpperCase();
					movUsu=convierteAPosicionMovimiento(cadMovUsu);
					valido=usuarioMueveFicha(numFichUsu, movUsu);
					if (valido==false) {
						System.out.println("¡Movimiento erroneo!");
					}
				}
				
				System.out.println("MOVIMIENTO VÁLIDO");
				imprimeTablero();
				valido=false;
				ganaUsuario=ganaUsuario();
				
				if (ganaUsuario==false) {
					System.out.println("¡Turno de la maquina!");
					
					while (valido==false) {
						valido=mueveFichaAleatoria(numFichProg);
						if (valido==false) {
							System.out.println("¡Movimiento erroneo de la maquina!");
						}
					}
					
					System.out.println("MOVIMIENTO VÁLIDO");
					imprimeTablero();
					valido=false;
					ganaPrograma=ganaPrograma();
				}
				
				if (ganaUsuario==false && ganaPrograma==false) {
					quedanFichas=quedanFichas();
				}
				
				numFichUsu++;
				numFichProg++;
			}
			
			if (ganaUsuario==true) {
				System.out.println("¡Ganaste!");
			} else if (ganaPrograma==true) {
				System.out.println("¡Gana la maquina!");
			} else if (quedanFichas==false) {
				System.out.println("¡Empate!");
			}
			
			otraPartida='j';
			while (otraPartida!='s' && otraPartida!='n') {
				System.out.println("¿Otra partidita?(s/n)");
				otraPartida = Entrada.caracter();
			}
			
			if (otraPartida=='s') {
				limpiarTablero();
				ganaUsuario=false;
				ganaPrograma=false;
				quedanFichas=true;
				numFichUsu=1;
				numFichProg=1;
			}
		}
		
		System.out.println("ADIOS");
	}
	
	public static void imprimeTablero() {
		int i=0;
		while (i<10) {
			switch (i) {
			case 1:
				if (x1==1 || x2==1 || x3==1) {
					System.out.print("x");
				} else if (o1==1 || o2==1 || o3==1) {
					System.out.print("o");
				} else {
					System.out.print("-");
				}
				break;
			case 2:
				if (x1==2 || x2==2 || x3==2) {
					System.out.print("\tx");
				} else if (o1==2 || o2==2 || o3==2) {
					System.out.print("\to");
				} else {
					System.out.print("\t-");
				}
				break;
			case 3:
				if (x1==3 || x2==3 || x3==3) {
					System.out.println("\tx");
				} else if (o1==3 || o2==3 || o3==3) {
					System.out.println("\to");
				} else {
					System.out.println("\t-");
				}
				break;
			case 4:
				if (x1==4 || x2==4 || x3==4) {
					System.out.print("x");
				} else if (o1==4 || o2==4 || o3==4) {
					System.out.print("o");
				} else {
					System.out.print("-");
				}
				break;
			case 5:
				if (x1==5 || x2==5 || x3==5) {
					System.out.print("\tx");
				} else if (o1==5 || o2==5 || o3==5) {
					System.out.print("\to");
				} else {
					System.out.print("\t-");
				}
				break;
			case 6:
				if (x1==6 || x2==6 || x3==6) {
					System.out.println("\tx");
				} else if (o1==6 || o2==6 || o3==6) {
					System.out.println("\to");
				} else {
					System.out.println("\t-");
				}
				break;
			case 7:
				if (x1==7 || x2==7 || x3==7) {
					System.out.print("x");
				} else if (o1==7 || o2==7 || o3==7) {
					System.out.print("o");
				} else {
					System.out.print("-");
				}
				break;
			case 8:
				if (x1==8 || x2==8 || x3==8) {
					System.out.print("\tx");
				} else if (o1==8 || o2==8 || o3==8) {
					System.out.print("\to");
				} else {
					System.out.print("\t-");
				}
				break;
			case 9:
				if (x1==9 || x2==9 || x3==9) {
					System.out.println("\tx");
				} else if (o1==9 || o2==9 || o3==9) {
					System.out.println("\to");
				} else {
					System.out.println("\t-");
				}
				break;
			default:
				break;
			}
			
			i++;
		}

	}
	
	public static boolean mueveFichaAleatoria(int numFichProg) {
		int numMov=0;
		boolean valido=false;
		
		numMov=(int)(Math.random()*9+1);
		System.out.println(numMov);
		
		if (numFichProg==1) {
			if (numMov!=o1) {
				valido=true;
				x1=numMov;
			}
		} 
		if (numFichProg==2) {
			if (numMov!=o1 && numMov!=o2 && numMov!=x1) {
				valido=true;
				x2=numMov;
			}
		} 
		if (numFichProg==3) {
			if (numMov!=o1 && numMov!=x1 && numMov!=o2 && numMov!=x2 && numMov!=o3) {
				valido=true;
				x3=numMov;
			}
		}
		return (valido);
	}
	
	public static int convierteAPosicionMovimiento(String cadMovUsu) {
		
		switch (cadMovUsu) {
		case "ARRIBA IZQUIERDA":
			return (1);
		case "ARRIBA CENTRO":
			return (2);
		case "ARRIBA DERECHA":
			return (3);
		case "CENTRO IZQUIERDA":
			return (4);
		case "CENTRO CENTRO":
			return (5);
		case "CENTRO DERECHA":
			return (6);
		case "ABAJO IZQUIERDA":
			return (7);
		case "ABAJO CENTRO":
			return (8);
		case "ABAJO DERECHA":
			return (9);
		default:
			return (0);
		}
	}
	
	public static boolean usuarioMueveFicha(int numFichUsu, int movUsu) {
		// TODO Auto-generated method stub
		boolean valido=false;
		
		if (numFichUsu==1) {
			if (movUsu!=0) {
				valido=true;
				o1=movUsu;
			}
		} 
		if (numFichUsu==2) {
			if (movUsu!=o1 && movUsu!=x1 && movUsu!=0) {
				valido=true;
				o2=movUsu;
			}
		} 
		if (numFichUsu==3) {
			if (movUsu!=o1 && movUsu!=x1 && movUsu!=o2 && movUsu!=x2 && movUsu!=0) {
				valido=true;
				o3=movUsu;
			}
		}
		return (valido);
	}
	
	public static void limpiarTablero() {
		
		x1=0;
		x2=0;
		x3=0;
		o1=0;
		o2=0;
		o3=0;

	}
	
	public static boolean quedanFichas() {
		// TODO Auto-generated method stub
		
		if (x1!=0 && x2!=0 && x3!=0 && o1!=0 && o2!=0 && o3!=0) {
			return (false);
		}
		return (true);
	}
	
	public static boolean ganaPrograma() {
		
		if ((x1==1 || x1==2 || x1==3) && (x2==1 || x2==2 || x2==3) && (x3==1 || x3==2 || x3==3)) {
			return (true);
		}
		if ((x1==4 || x1==5 || x1==6) && (x2==4 || x2==5|| x2==6) && (x3==4 || x3==5 || x3==6)) {
			return (true);
		}
		if ((x1==7 || x1==8 || x1==9) && (x2==7 || x2==8|| x2==9) && (x3==7 || x3==8 || x3==9)) {
			return (true);
		}
		if ((x1==1 || x1==4 || x1==7) && (x2==1 || x2==4|| x2==7) && (x3==1 || x3==4 || x3==7)) {
			return (true);
		}
		if ((x1==2 || x1==5 || x1==8) && (x2==2 || x2==5|| x2==8) && (x3==2 || x3==5 || x3==8)) {
			return (true);
		}
		if ((x1==3 || x1==6 || x1==9) && (x2==3 || x2==6|| x2==9) && (x3==3 || x3==6 || x3==9)) {
			return (true);
		}
		if ((x1==1 || x1==5 || x1==9) && (x2==1 || x2==5|| x2==9) && (x3==1 || x3==5 || x3==9)) {
			return (true);
		}
		if ((x1==3 || x1==5 || x1==7) && (x2==3 || x2==5|| x2==7) && (x3==3 || x3==5 || x3==7)) {
			return (true);
		}
		return (false);
	}
	
	public static boolean ganaUsuario() {
		
		if ((o1==1 || o1==2 || o1==3) && (o2==1 || o2==2 || o2==3) && (o3==1 || o3==2 || o3==3)) {
			return (true);
		}
		if ((o1==4 || o1==5 || o1==6) && (o2==4 || o2==5|| o2==6) && (o3==4 || o3==5 || o3==6)) {
			return (true);
		}
		if ((o1==7 || o1==8 || o1==9) && (o2==7 || o2==8|| o2==9) && (o3==7 || o3==8 || o3==9)) {
			return (true);
		}
		if ((o1==1 || o1==4 || o1==7) && (o2==1 || o2==4|| o2==7) && (o3==1 || o3==4 || o3==7)) {
			return (true);
		}
		if ((o1==2 || o1==5 || o1==8) && (o2==2 || o2==5|| o2==8) && (o3==2 || o3==5 || o3==8)) {
			return (true);
		}
		if ((o1==3 || o1==6 || o1==9) && (o2==3 || o2==6|| o2==9) && (o3==3 || o3==6 || o3==9)) {
			return (true);
		}
		if ((o1==1 || o1==5 || o1==9) && (o2==1 || o2==5|| o2==9) && (o3==1 || o3==5 || o3==9)) {
			return (true);
		}
		if ((o1==3 || o1==5 || o1==7) && (o2==3 || o2==5|| o2==7) && (o3==3 || o3==5 || o3==7)) {
			return (true);
		}
		return (false);
	}
}
