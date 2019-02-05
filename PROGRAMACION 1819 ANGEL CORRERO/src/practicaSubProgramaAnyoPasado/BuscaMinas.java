package practicaSubProgramaAnyoPasado;

import practica3JAVA1.Entrada;

public class BuscaMinas {
	static boolean desc1=false ,desc2=false ,desc3=false ,desc4=false ,desc5=false ,desc6=false ,desc7=false ,desc8=false, desc9=false;
	static int casillasDescubiertasSinBombas=0, casillasDescubiertasConBombas=0, num=1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int casillaUsuario=0, b1=0, b2=0, b3=0, maxBomb=9, minBomb=1;
		boolean terminada=false, distinto=false;
		b1=generaNumeroAleatorio(maxBomb, minBomb);
		while (distinto==false) {
			b2=generaNumeroAleatorio(maxBomb, minBomb);
			if (b2!=b1) {
				distinto=true;
			}
		}
		distinto=false;
		while (distinto==false) {
			b3=generaNumeroAleatorio(maxBomb, minBomb);
			if (b3!=b1 && b3!=b2) {
				distinto=true;
			}
		}
		System.out.println(b1+" "+b2+" "+b3);
		System.out.println("!!BIENVENIDO AL BUSCAMINAS¡¡");
		System.out.println("!Intenta destapar las casillas sin bombas y ganarás la partida, hay 3 bombas escondidas¡");
		muestraTablero(b1, b2, b3);
		while (terminada==false) {
			System.out.println("¿Qué casilla quieres decubrir?");
			casillaUsuario = Entrada.entero();
			if (yaEstaDescubiertaOEsIncorrecta(casillaUsuario)) {
				System.out.println("No puedes elegir esa casilla prque no existe o ya esta descubierta");
			} else {
				descubrirCasilla(casillaUsuario);
				incrementaCasilla(casillaUsuario, b1, b2, b3);
				muestraMensaje(casillaUsuario, b1, b2, b3);
				muestraTablero(b1, b2, b3);
				terminada=partidaTerminada();
			}
		}
		devuelveVeredicto();

	}
	
	public static void muestraTablero(int b1, int b2, int b3) {
		int i=0;
		while(i <= 12) {
			for (int j = 0; j <= 12; j++) {
				if (i%4==0) {
					if (j%4==0) {
						System.out.print(" ");
					} else {
						System.out.print("----");
					}
				} else {
					if (j%4==0) {
						System.out.print("|");
					} else {
						colocarCasillas(i, j, b1, b2, b3);
					}
				}
			}
			i++;
			System.out.println();
		}
		num=1;
	}
	
	public static void colocarCasillas(int i, int j, int b1, int b2, int b3) {
		if (i%2==0 && i%4!=0 && j%2==0 && j%4!=0) {
			switch (num) {
			case 1:
				if (desc1 && (b1==1 || b2==1 || b3==1)) {
					System.out.print(" BM ");
				} else if (desc1) {
					System.out.print(" NO ");
				} else {
					System.out.print(" XX ");
				}
				break;
			case 2:
				if (desc2 && (b1==2 || b2==2 || b3==2)) {
					System.out.print(" BM ");
				} else if (desc2) {
					System.out.print(" NO ");
				} else {
					System.out.print(" XX ");
				}
				break;
			case 3:
				if (desc3 && (b1==3 || b2==3 || b3==3)) {
					System.out.print(" BM ");
				} else if (desc3) {
					System.out.print(" NO ");
				} else {
					System.out.print(" XX ");
				}
				break;
			case 4:
				if (desc4 && (b1==4 || b2==4 || b3==4)) {
					System.out.print(" BM ");
				} else if (desc4) {
					System.out.print(" NO ");
				} else {
					System.out.print(" XX ");
				}
				break;
			case 5:
				if (desc5 && (b1==5 || b2==5 || b3==5)) {
					System.out.print(" BM ");
				} else if (desc5) {
					System.out.print(" NO ");
				} else {
					System.out.print(" XX ");
				}
				break;
			case 6:
				if (desc6 && (b1==6 || b2==6 || b3==6)) {
					System.out.print(" BM ");
				} else if (desc6) {
					System.out.print(" NO ");
				} else {
					System.out.print(" XX ");
				}
				break;
			case 7:
				if (desc7 && (b1==7 || b2==7 || b3==7)) {
					System.out.print(" BM ");
				} else if (desc7) {
					System.out.print(" NO ");
				} else {
					System.out.print(" XX ");
				}
				break;
			case 8:
				if (desc8 && (b1==8 || b2==8 || b3==8)) {
					System.out.print(" BM ");
				} else if (desc8) {
					System.out.print(" NO ");
				} else {
					System.out.print(" XX ");
				}
				break;
			case 9:
				if (desc9 && (b1==9 || b2==9 || b3==9)) {
					System.out.print(" BM ");
				} else if (desc9) {
					System.out.print(" NO ");
				} else {
					System.out.print(" XX ");
				}
				break;
			default:
				break;
			}
			num++;
		} else {
			System.out.print("    ");
		}
	}
	
	public static int generaNumeroAleatorio(int maxBomb, int minBomb) {
		int numBomba=0;
		numBomba=(int)(Math.random()*maxBomb+minBomb);
		return (numBomba);
	}
	
	public static boolean yaEstaDescubiertaOEsIncorrecta(int casillaUsuario) {
		boolean descubierta=true;
		switch (casillaUsuario) {
		case 1:
			if (desc1==false) {
				descubierta=false;
			}
			break;
		case 2:
			if (desc2==false) {
				descubierta=false;
			}
			break;
		case 3:
			if (desc3==false) {
				descubierta=false;
			}
			break;
		case 4:
			if (desc4==false) {
				descubierta=false;
			}
			break;
		case 5:
			if (desc5==false) {
				descubierta=false;
			}
			break;
		case 6:
			if (desc6==false) {
				descubierta=false;
			}
			break;
		case 7:
			if (desc7==false) {
				descubierta=false;
			}
			break;
		case 8:
			if (desc8==false) {
				descubierta=false;
			}
			break;
		case 9:
			if (desc9==false) {
				descubierta=false;
			}
			break;
		default:
			break;
		}
		return (descubierta);
	}
	
	public static void descubrirCasilla(int casillaUsuario) {
		switch (casillaUsuario) {
		case 1:
			desc1=true;
			break;
		case 2:
			desc2=true;
			break;
		case 3:
			desc3=true;
			break;
		case 4:
			desc4=true;
			break;
		case 5:
			desc5=true;
			break;
		case 6:
			desc6=true;
			break;
		case 7:
			desc7=true;
			break;
		case 8:
			desc8=true;
			break;
		case 9:
			desc9=true;
			break;
		default:
			break;
		}
	}
	
	public static void incrementaCasilla(int casillaUsuario, int b1, int b2, int b3) {
		if (casillaUsuario==b1 || casillaUsuario==b2 || casillaUsuario==b3) {
			casillasDescubiertasConBombas++;
		} else {
			casillasDescubiertasSinBombas++;
		}
	}
	
	public static void muestraMensaje(int casillaUsuario, int b1, int b2, int b3) {
		if (casillaUsuario==b1 || casillaUsuario==b2 || casillaUsuario==b3) {
			System.out.println("HABÍA BOMBA!!!");
		} else {
			System.out.println("MENOS MAL! NO HABIA BOMBA");
		}
	}
	
	public static boolean partidaTerminada() {
		boolean terminada=false;
		if (casillasDescubiertasSinBombas==6) {
			terminada=true;
		} else if (casillasDescubiertasConBombas==3) {
			terminada=true;
		}
		return (terminada);
	}
	
	public static void devuelveVeredicto() {
		if (casillasDescubiertasSinBombas==6) {
			System.out.println("BIEN!! Has ganado!");
		} else if (casillasDescubiertasConBombas==3) {
			System.out.println("OOOOOH! Has perdido!");
		}
	}
}
