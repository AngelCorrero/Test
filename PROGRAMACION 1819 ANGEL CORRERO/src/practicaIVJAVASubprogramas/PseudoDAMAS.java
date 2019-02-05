package practicaIVJAVASubprogramas;

public class PseudoDAMAS {
	static boolean fichaProg1=true, fichaProg2=true, fichaProg3=true, fichaUser1=true, fichaUser2=true, fichaUser3=true;
	static int XProg1=3, YProg1=2, XProg2=15, YProg2=2, XProg3=27, YProg3=2, XUser1=3, YUser1=18, XUser2=15, YUser2=18, XUser3=27, YUser3=18;
	static final int TAMFIL=20, TAMCOL=30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numFicha=0;
		String ladoFicha=" ";
		char tablas='n', jugador=' ';
		boolean pruebaValido=false, pruebaComido=false, victoria=false;
		
		System.out.println("¡¡BIENVENIDO AL JUEGO DE DAMAS!!");
		imprimeLetrasTablero();
		construirTablero();
		System.out.println("Empiezas tú");
		while (victoria==false) {
			System.out.println("¿Tablas (s/n)?");
			tablas = Entrada.caracter();
			if (tablas=='n') {
				System.out.println("Indica la ficha que quieres mover: ");
				numFicha = Entrada.entero();
				System.out.println("Indica hacia donde quieres mover la ficha: ");
				ladoFicha = Entrada.cadena().toUpperCase();
				if (ladoFicha.equals("DERECHA")) {
					pruebaValido=mueveDerechaFichaUsuario(numFicha, ladoFicha);
					System.out.println(pruebaValido);
				} else if (ladoFicha.equals("IZQUIERDA")) {
					pruebaValido=mueveIzquierdaFichaUsuario(numFicha, ladoFicha);
					System.out.println(pruebaValido);
				} else {
					pruebaValido=false;
				}
				if (pruebaValido) {
					System.out.println("BUEN MOVIMIENTO!!");
					jugador='u';
					pruebaComido=comeFicha(numFicha, jugador);
					if (pruebaComido) {
						System.out.println("Te acabas de comer una ficha del contrario!!");
					}
				} else {
					System.out.println("Movimiento erroneo, has perdido tu turno");
				}
				imprimeLetrasTablero();
				construirTablero();
				//Con el if de abajo el programa no juega su turno cuando pierde.
				//if (fichaProg1 || fichaProg2 || fichaProg3) {
				numFicha=fichaAleatoria();
				ladoFicha=ladoAleatorio();
				if (ladoFicha.equals("IZQUIERDA")) {
					pruebaValido=mueveIzquierdaFichaPrograma(numFicha, ladoFicha);
					System.out.println(pruebaValido);
				} else if (ladoFicha.equals("DERECHA")) {
					pruebaValido=mueveDerechaFichaPrograma(numFicha, ladoFicha);
					System.out.println(pruebaValido);
				} else {
					pruebaValido=false;
				}
				if (pruebaValido) {
					System.out.println("BUEN MOVIMIENTO!!");
					jugador='p';
					pruebaComido=comeFicha(numFicha, jugador);
					if (pruebaComido) {
						System.out.println("El programa te acaba de comer una ficha!!");
					}
				} else {
					System.out.println("Movimiento erroneo, el programa ha perdido su turno");
				}
				imprimeLetrasTablero();
				construirTablero();
				//}
				if (!fichaProg1 && !fichaProg2 && !fichaProg3) {
					victoria=true;
				} else if (!fichaUser1 && !fichaUser2 && !fichaUser3) {
					victoria=true;
				}
			} else if (tablas=='s') {
				victoria=true;
			}
		}
		if (tablas=='s') {
			System.out.println("¡TABLAS!");
		} else if (fichaProg1 || fichaProg2 || fichaProg3) {
			System.out.println("¡TE GANÓ EL PROGRAMA!");
		} else if (fichaUser1 || fichaUser2 || fichaUser3) {
			System.out.println("¡GANASTE!");
		}
	}
	
	public static void imprimeLetrasTablero() {
		char letra='A';
		int numLetra=0, i=0, j=3;
		numLetra=(int)letra;
		while (i<=TAMCOL) {
			if (i==j) {
				System.out.print((char)numLetra);
				j=j+6;
				numLetra++;
			} else {
				System.out.print(" ");
			}
			i++;
		}
		System.out.println();
	}
	
	public static void construirTablero() {
		int i=0, num=1;
		while(i <= TAMFIL) {
			for (int j = 0; j <= TAMCOL; j++) {
				if (i%4==0 || j%6==0) {
					System.out.print("*");
					if (j==TAMCOL && i%2==0 && i%4!=0) {
						System.out.print("\t"+num);
						num++;
					}
				} else {
					imprimeFichas(i, j);
				}
			}
			i++;
			System.out.println();
		}
	}
	
	public static void imprimeFichas(int i, int j) {
		if (fichaProg1==true && j==XProg1 && i==YProg1) {
			System.out.print("P");
		} else if (fichaProg2==true && j==XProg2 && i==YProg2) {
			System.out.print("P");
		} else if (fichaProg3==true && j==XProg3 && i==YProg3) {
			System.out.print("P");
		} else if (fichaUser1==true && j==XUser1 && i==YUser1) {
			System.out.print("U");
		} else if (fichaUser2==true && j==XUser2 && i==YUser2) {
			System.out.print("D");
		} else if (fichaUser3==true && j==XUser3 && i==YUser3) {
			System.out.print("T");
		} else {
			System.out.print(" ");
		}
	}
	
	public static int fichaAleatoria() {
		int numFicha=0;
		numFicha=(int)(Math.random()*3+1);
		return (numFicha);
	}
	
	public static String ladoAleatorio() {
		int numFicha=0;
		String ladoFicha=" ";
		numFicha=(int)(Math.random()*2+1);
		switch (numFicha) {
		case 1:
			ladoFicha="IZQUIERDA";
			return (ladoFicha);
		case 2:
			ladoFicha="DERECHA";
			return (ladoFicha);
		default:
			return (ladoFicha);
		}
	}
	
	public static boolean mueveDerechaFichaPrograma(int numFicha, String ladoFicha) {
		boolean valido=true;
		switch (numFicha) {
		case 1:
			if (!fichaProg1 || XProg1-6<3 || YProg1+4>TAMFIL-2) {
				valido=false;
			} else if (fichaProg2==true && XProg1-6==XProg2 && YProg1+4==YProg2) {
				valido=false;
			} else if (fichaProg3==true && XProg1-6==XProg3 && YProg1+4==YProg3) {
				valido=false;
			} else {
				XProg1=XProg1-6;
				YProg1=YProg1+4;
			}
			return (valido);
		case 2:
			if (fichaProg2==false || XProg2-6<3 || YProg2+4>TAMFIL-2) {
				valido=false;
			} else if (fichaProg1==true && XProg2-6==XProg1 && YProg2+4==YProg1) {
				valido=false;
			} else if (fichaProg3==true && XProg2-6==XProg3 && YProg2+4==YProg3) {
				valido=false;
			} else {
				XProg2=XProg2-6;
				YProg2=YProg2+4;
			}
			return (valido);
		case 3:
			if (fichaProg3==false || XProg3-6<3 || YProg3+4>TAMFIL-2) {
				valido=false;
			} else if (fichaProg1==true && XProg3-6==XProg1 && YProg3+4==YProg1) {
				valido=false;
			} else if (fichaProg2==true && XProg3-6==XProg2 && YProg3+4==YProg2) {
				valido=false;
			} else {
				XProg3=XProg3-6;
				YProg3=YProg3+4;
			}
			return (valido);
		default:
			valido=false;
			return (valido);
		}
	}
	
	public static boolean mueveIzquierdaFichaPrograma(int numFicha, String ladoFicha) {
		boolean valido=true;
		switch (numFicha) {
		case 1:
			if (fichaProg1==false || XProg1+6>TAMCOL-3 || YProg1+4>TAMFIL-2) {
				valido=false;
			} else if (fichaProg2==true && XProg1+6==XProg2 && YProg1+4==YProg2) {
				valido=false;
			} else if (fichaProg3==true && XProg1+6==XProg3 && YProg1+4==YProg3) {
				valido=false;
			} else {
				XProg1=XProg1+6;
				YProg1=YProg1+4;
			}
			return (valido);
		case 2:
			if (fichaProg2==false || XProg2+6>TAMCOL-3 || YProg2+4>TAMFIL-2) {
				valido=false;
			} else if (fichaProg1==true && XProg2+6==XProg1 && YProg2+4==YProg1) {
				valido=false;
			} else if (fichaProg3==true && XProg2+6==XProg3 && YProg2+4==YProg3) {
				valido=false;
			} else {
				XProg2=XProg2+6;
				YProg2=YProg2+4;
			}
			return (valido);
		case 3:
			if (fichaProg3==false || XProg3+6>TAMCOL-3 || YProg3+4>TAMFIL-2) {
				valido=false;
			} else if (fichaProg1==true && XProg3+6==XProg1 && YProg3+4==YProg1) {
				valido=false;
			} else if (fichaProg2==true && XProg3+6==XProg2 && YProg3+4==YProg2) {
				valido=false;
			} else {
				XProg3=XProg3+6;
				YProg3=YProg3+4;
			}
			return (valido);
		default:
			valido=false;
			return (valido);
		}
	}
	
	public static boolean mueveDerechaFichaUsuario(int numFicha, String ladoFicha) {
		boolean valido=true;
		switch (numFicha) {
		case 1:
			if (fichaUser1==false || XUser1+6>TAMCOL-3 || YUser1-4<2) {
				valido=false;
			} else if (fichaUser2==true && XUser1+6==XUser2 && YUser1-4==YUser2) {
				valido=false;
			} else if (fichaUser3==true && XUser1+6==XUser3 && YUser1-4==YUser3) {
				valido=false;
			} else {
				XUser1=XUser1+6;
				YUser1=YUser1-4;
			}
			return (valido);
		case 2:
			if (fichaUser2==false || XUser2+6>TAMCOL-3 || YUser2-4<2) {
				valido=false;
			} else if (fichaUser1==true && XUser2+6==XUser1 && YUser2-4==YUser1) {
				valido=false;
			} else if (fichaUser3==true && XUser2+6==XUser3 && YUser2-4==YUser3) {
				valido=false;
			} else {
				XUser2=XUser2+6;
				YUser2=YUser2-4;
			}
			return (valido);
		case 3:
			if (fichaUser3==false || XUser3+6>TAMCOL-3 || YUser3-4<2) {
				valido=false;
			} else if (fichaUser1==true && XUser3+6==XUser1 && YUser3-4==YUser1) {
				valido=false;
			} else if (fichaUser2==true && XUser3+6==XUser2 && YUser3-4==YUser2) {
				valido=false;
			} else {
				XUser3=XUser3+6;
				YUser3=YUser3-4;
			}
			return (valido);
		default:
			valido=false;
			return (valido);
		}
	}
	
	public static boolean mueveIzquierdaFichaUsuario(int numFicha, String ladoFicha) {
		boolean valido=true;
		switch (numFicha) {
		case 1:
			if (fichaUser1==false || XUser1-6<3 || YUser1-4<2) {
				valido=false;
			} else if (fichaUser2==true && XUser1-6==XUser2 && YUser1-4==YUser2) {
				valido=false;
			} else if (fichaUser3==true && XUser1-6==XUser3 && YUser1-4==YUser3) {
				valido=false;
			} else {
				XUser1=XUser1-6;
				YUser1=YUser1-4;
			}
			return (valido);
		case 2:
			if (fichaUser2==false || XUser2-6<3 || YUser2-4<2) {
				valido=false;
			} else if (fichaUser1==true && XUser2-6==XUser1 && YUser2-4==YUser1) {
				valido=false;
			} else if (fichaUser3==true && XUser2-6==XUser3 && YUser2-4==YUser3) {
				valido=false;
			} else {
				XUser2=XUser2-6;
				YUser2=YUser2-4;
			}
			return (valido);
		case 3:
			if (fichaUser3==false || XUser3-6<3 || YUser3-4<2) {
				valido=false;
			} else if (fichaUser1==true && XUser3-6==XUser1 && YUser3-4==YUser1) {
				valido=false;
			} else if (fichaUser2==true && XUser3-6==XUser2 && YUser3-4==YUser2) {
				valido=false;
			} else {
				XUser3=XUser3-6;
				YUser3=YUser3-4;
			}
			return (valido);
		default:
			valido=false;
			return (valido);
		}
	}
	
	public static boolean comeFicha(int numFicha, char jugador) {
		boolean comido=false;
		if (jugador=='u') {
			switch (numFicha) {
			case 1:
				if (XUser1==XProg1 && YUser1==YProg1) {
					fichaProg1=false;
					comido=true;
				} else if (XUser1==XProg2 && YUser1==YProg2) {
					fichaProg2=false;
					comido=true;
				} else if (XUser1==XProg3 && YUser1==YProg3) {
					fichaProg3=false;
					comido=true;
				}
				break;
				
			case 2:
				if (XUser2==XProg1 && YUser2==YProg1) {
					fichaProg1=false;
					comido=true;
				} else if (XUser2==XProg2 && YUser2==YProg2) {
					fichaProg2=false;
					comido=true;
				} else if (XUser2==XProg3 && YUser2==YProg3) {
					fichaProg3=false;
					comido=true;
				}
				break;
			case 3:
				if (XUser3==XProg1 && YUser3==YProg1) {
					fichaProg1=false;
					comido=true;
				} else if (XUser3==XProg2 && YUser3==YProg2) {
					fichaProg2=false;
					comido=true;
				} else if (XUser3==XProg3 && YUser3==YProg3) {
					fichaProg3=false;
					comido=true;
				}
				break;
			default:
				break;
			}
		}
		if (jugador=='p') {
			switch (numFicha) {
			case 1:
				if (XProg1==XUser1 && YProg1==YUser1) {
					fichaUser1=false;
					comido=true;
				} else if (XProg1==XUser2 && YProg1==YUser2) {
					fichaUser2=false;
					comido=true;
				} else if (XProg1==XUser3 && YProg1==YUser3) {
					fichaUser3=false;
					comido=true;
				}
				break;
			case 2:
				if (XProg2==XUser1 && YProg2==YUser1) {
					fichaUser1=false;
					comido=true;
				} else if (XProg2==XUser2 && YProg2==YUser2) {
					fichaUser2=false;
					comido=true;
				} else if (XProg2==XUser3 && YProg2==YUser3) {
					fichaUser3=false;
					comido=true;
				}
				break;
			case 3:
				if (XProg3==XUser1 && YProg3==YUser1) {
					fichaUser1=false;
					comido=true;
				} else if (XProg3==XUser2 && YProg3==YUser2) {
					fichaUser2=false;
					comido=true;
				} else if (XProg3==XUser3 && YProg3==YUser3) {
					fichaUser3=false;
					comido=true;
				}
				break;
			default:
				break;
			}
		}
		return (comido);
	}
}
