package examenSubProgramasAñoPasado;

public class ExamenSubProgramaAnyoPasado {
	static char ficha1=' ', ficha2=' ', ficha3=' ', ficha4=' ', ficha5=' ';
	static int  blancasSecretas=0, negrasSecretas=0, pos=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char fic1=' ', fic2=' ', fic3=' ', fic4=' ', fic5=' ', color='B', ayuda=' ';
		int pos=1, i=0;
		boolean victoria=false;
		
		asignaColorAFichas();
		System.out.println(ficha1+" "+ficha2+" "+ficha3+" "+ficha4+" "+ficha5);
		
		while (victoria==false) {
			color='B';
			blancasSecretas=cuentaColorFichasSecretas(color);
			color='N';
			negrasSecretas=cuentaColorFichasSecretas(color);
			
			fic1=pideFicha(pos);
			pos++;
			fic2=pideFicha(pos);
			pos++;
			fic3=pideFicha(pos);
			pos++;
			fic4=pideFicha(pos);
			pos++;
			fic5=pideFicha(pos);
			pos=1;
			System.out.println("SU COMBINACIÓN: "+fic1+" "+fic2+" "+fic3+" "+fic4+" "+fic5);
			
			System.out.println("Tienes "+mensajeFichasBienColocadas(fic1, fic2, fic3, fic4, fic5)+" fichas bien colocadas");
			
			victoria=ganador(fic1, fic2, fic3, fic4, fic5);
			i++;
			
			if (victoria==false) {
				System.out.println("¿Quieres que te lo ponga facil? ¿Quieres ver que posiciones has acertado? (s/n)");
				ayuda = Entrada.caracter();
				if (ayuda=='s') {
					muestraResultadoParcial(fic1, fic2, fic3, fic4, fic5);
					System.out.println("Hay "+blancasSecretas+" blancas y "+negrasSecretas+" negras");
				}
				System.out.println();
				System.out.println();
				System.out.println();
			}
		}
		
		System.out.println("¡¡Muy bien!! Lo has conseguido en "+i+" intentos");
	}
	
	public static char pideFicha(int pos) {
		char fichU=' ';
		System.out.println("Introduzca una ficha para la posición "+pos+" (N/B): ");
		fichU = Entrada.caracter();
		return (fichU);
	}
	
	public static char aleatorioBlancoONegro() {
		int num=0;
		num=(int)(Math.random()*2+1);
		if (num==1) {
			return ('N');
		} else if (num==2) {
			return ('B');
		} else {
			return ('X');
		}
	}
	
	public static void asignaColorAFichas() {
		ficha1=aleatorioBlancoONegro();
		ficha2=aleatorioBlancoONegro();
		ficha3=aleatorioBlancoONegro();
		ficha4=aleatorioBlancoONegro();
		ficha5=aleatorioBlancoONegro();
	}
	
	public static int cuentaColorFichasSecretas(char color) {
		int num=0;
		if (ficha1==color) {
			num++;
		}
		if (ficha2==color) {
			num++;
		}
		if (ficha3==color) {
			num++;
		}
		if (ficha4==color) {
			num++;
		}
		if (ficha5==color) {
			num++;
		}
		return (num);
	}
	
	public static boolean comparaFichaEnSuPosicion(char fich, int pos) {
		boolean acierto=false;
		switch (pos) {
		case 1:
			if (ficha1==fich) {
				acierto=true;
			}
			break;
		case 2:
			if (ficha2==fich) {
				acierto=true;
			}
			break;
		case 3:
			if (ficha3==fich) {
				acierto=true;
			}
			break;
		case 4:
			if (ficha4==fich) {
				acierto=true;
			}
			break;
		case 5:
			if (ficha5==fich) {
				acierto=true;
			}
			break;

		default:
			break;
		}
		return (acierto);
	}

	
	public static int mensajeFichasBienColocadas(char fic1, char fic2, char  fic3, char fic4, char fic5) {
		int num=0, pos=1;
		if (comparaFichaEnSuPosicion(fic1, pos)) {
			num++;
		}
		pos++;
		if (comparaFichaEnSuPosicion(fic2, pos)) {
			num++;
		}
		pos++;
		if (comparaFichaEnSuPosicion(fic3, pos)) {
			num++;
		}
		pos++;
		if (comparaFichaEnSuPosicion(fic4, pos)) {
			num++;
		}
		pos++;
		if (comparaFichaEnSuPosicion(fic5, pos)) {
			num++;
		}
		return (num);
	}
	
	public static char devuelveCaracter(char fich, int pos) {
		switch (pos) {
		case 1:
			if (ficha1!=fich) {
				fich='X';
			}
			break;
		case 2:
			if (ficha2!=fich) {
				fich='X';
			}
			break;
		case 3:
			if (ficha3!=fich) {
				fich='X';
			}
			break;
		case 4:
			if (ficha4!=fich) {
				fich='X';
			}
			break;
		case 5:
			if (ficha5!=fich) {
				fich='X';
			}
			break;

		default:
			break;
		}
		return (fich);
	}
	
	public static void muestraResultadoParcial(char fic1, char fic2, char  fic3, char fic4, char fic5) {
		int pos=1;
		System.out.print(devuelveCaracter(fic1, pos)+" ");
		pos++;
		System.out.print(devuelveCaracter(fic2, pos)+" ");
		pos++;
		System.out.print(devuelveCaracter(fic3, pos)+" ");
		pos++;
		System.out.print(devuelveCaracter(fic4, pos)+" ");
		pos++;
		System.out.println(devuelveCaracter(fic5, pos)+" ");
	}
	
	public static boolean ganador(char fic1, char fic2, char  fic3, char fic4, char fic5) {
		boolean victoria=false;
		if (fic1==ficha1 && fic2==ficha2 && fic3==ficha3 && fic4==ficha4 && fic5==ficha5) {
			victoria=true;
		}
		return (victoria);
	}

}
