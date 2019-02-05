package golfistas;

public class EjercicioGolfistas {
	static final int N=5, M=4;
	//static int [][] golfistas_jornadas = new int[N][M];
	static int [][] golfistas_jornadas = {{10,12,10,14},{11,9,13,14},{12,11,10,14},{10,13,10,10},{10,15,12,12}};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] punt_golf = new int[N];
		
		//rellenaMatriz();
		muestraResultados();
		calculaPuntosDeJornada(punt_golf);
		golfistas_jornadas_ordenados(punt_golf);
		for(int i=0;i<punt_golf.length;i++) {
			System.out.println("Jugador "+(i+1)+": "+punt_golf[i]);
		}
		imprimePodio(punt_golf);
		System.out.println("Stay Tunes, Folks");
		System.out.println("Inside of every demon is a rainbow");

	}
	
	public static void rellenaMatriz() {
		for(int i=0;i<golfistas_jornadas.length;i++) {
			System.out.println("Jugador "+(i+1)+": ");
			for(int j=0;j<golfistas_jornadas[i].length;j++) {
				System.out.println("Introduzac el número de golpes para la jornada "+(j+1)+": ");
				golfistas_jornadas[i][j]=Entrada.entero();
			}
		}

	}
	
	public static void muestraResultados() {
		System.out.print("Jornadas");
		for(int i=0;i<M;i++) {
			System.out.print("\t"+(i+1));
		}
		System.out.println();
		
		for(int i=0;i<golfistas_jornadas.length;i++) {
			System.out.print("Jugador "+(i+1));
			for(int j=0;j<golfistas_jornadas[i].length;j++) {
				System.out.print("\t"+golfistas_jornadas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}
	
	public static void calculaPuntosDeJornada(int [] punt_golf) {
		int i=0, j=0;
		int [] vectorMin = new int[3];
		
		while (j<M) {
			
			vectorMin[0]=1000;
			vectorMin[1]=1000;
			vectorMin[2]=1000;
			
			for (i = 0; i < N; i++) {
				if (golfistas_jornadas[i][j]<vectorMin[0]) {
					vectorMin[2]=vectorMin[1];
					vectorMin[1]=vectorMin[0];
					vectorMin[0]=golfistas_jornadas[i][j];
				} else if (golfistas_jornadas[i][j]<vectorMin[1] && golfistas_jornadas[i][j]!=vectorMin[0]) {
					vectorMin[2]=vectorMin[1];
					vectorMin[1]=golfistas_jornadas[i][j];
				} else if (golfistas_jornadas[i][j]<vectorMin[2] && golfistas_jornadas[i][j]!=vectorMin[0] && golfistas_jornadas[i][j]!=vectorMin[1]) {
					vectorMin[2]=golfistas_jornadas[i][j];
				}
			}
			
			for (i = 0; i < N; i++) {
				if (golfistas_jornadas[i][j]==vectorMin[0]) {
					punt_golf[i]=punt_golf[i]+3;
				} else if (golfistas_jornadas[i][j]==vectorMin[1]) {
					punt_golf[i]=punt_golf[i]+2;
				} else if (golfistas_jornadas[i][j]==vectorMin[2]) {
					punt_golf[i]=punt_golf[i]+1;
				}
			}
			
			j++;
		}
	}
	
	public static void golfistas_jornadas_ordenados(int [] punt_golf) {
		int [][] golfistas_jornadas_ordenados = golfistas_jornadas.clone();
		int min1=1000, min2=1000;
		
		for(int i=0;i<N;i++) {
			insercion(golfistas_jornadas_ordenados[i]);
		}
		
		for(int j=M-1;j<M;j++) {
			for (int i = 0; i < N; i++) {
				if (golfistas_jornadas_ordenados[i][j]<min1) {
					
					min1=golfistas_jornadas_ordenados[i][j];
					
				} else if (golfistas_jornadas_ordenados[i][j]<min2 && golfistas_jornadas_ordenados[i][j]!=min1) {
					
					min2=golfistas_jornadas_ordenados[i][j];
				}
			}
			for (int i = 0; i < N; i++) {
				if (golfistas_jornadas_ordenados[i][j]==min1) {
					punt_golf[i]=punt_golf[i]+2;
				} else if (golfistas_jornadas_ordenados[i][j]==min2) {
					punt_golf[i]=punt_golf[i]+1;
				}
			}
		}

	}
	
	public static void imprimePodio(int [] punt_golf) {
		int [] vectorMax = {0,0,0};
		
		for (int i = 0; i < N; i++) {
			if (punt_golf[i]>vectorMax[0]) {
				vectorMax[2]=vectorMax[1];
				vectorMax[1]=vectorMax[0];
				vectorMax[0]=punt_golf[i];
			} else if (punt_golf[i]>vectorMax[1] && punt_golf[i]!=vectorMax[0]) {
				vectorMax[2]=vectorMax[1];
				vectorMax[1]=punt_golf[i];
			} else if (punt_golf[i]>vectorMax[2] && punt_golf[i]!=vectorMax[0] && punt_golf[i]!=vectorMax[1]) {
				vectorMax[2]=punt_golf[i];
			}
		}
		for (int j = 0; j < 3; j++) {
			if (j==0) {
				System.out.println("Primer puesto: ");
				for (int i = 0; i < N; i++) {
					if (punt_golf[i]==vectorMax[0]) {
						System.out.println("\tJugador "+(i+1));
					}
				}
			} else if (j==1) {
				System.out.println("Segundo puesto: ");
				for (int i = 0; i < N; i++) {
					if (punt_golf[i]==vectorMax[1]) {
						System.out.println("\tJugador "+(i+1));
					}
				}
			} else if (j==2) {
				System.out.println("Tercer puesto: ");
				for (int i = 0; i < N; i++) {
					if (punt_golf[i]==vectorMax[2]) {
						System.out.println("\tJugador "+(i+1));
					}
				}
			}
		}

	}
	
	static void insercion(int vector[])
	{
		int i, temp, j;
		for (i = 1; i < vector.length; i++) {
			temp = vector[i];
			j = i - 1;
			while ((j >= 0) && (vector[j] < temp)) {
				vector[j + 1] = vector[j];
				j--;
			}
			vector[j + 1] = temp;
		}
	}

}
