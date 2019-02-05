package cadenas;

public class EjerciciosInicialesCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//correo();
		//System.out.println(cuentaVocales("mUrcielAgo"));
		//caracterSeparado("alastor");
		cambiarVocales("paris se uema paris se quema paris se uema");

	}
	
	public static void correo() {
		String nombre = new String("");
		String dominio = new String("");
		String tld = new String("");
		
		System.out.println("Introduzca nombre: ");
		nombre = Entrada.cadena().toLowerCase().trim();
		System.out.println("Introduzca dominio: ");
		dominio = Entrada.cadena().toLowerCase().trim();
		System.out.println("Introduzca TLD: ");
		tld = Entrada.cadena().toLowerCase().trim();
		
		System.out.println(nombre.concat("@").concat(dominio).concat(".").concat(tld));
	}
	
	public static int cuentaVocales(String cadena) {
		int vocales=0;
		
		char [] vectorCaracteres = cadena.toLowerCase().toCharArray();
		for (int i = 0; i < vectorCaracteres.length; i++) {
			if (vectorCaracteres[i]=='a') {
				vocales++;
			}else if (vectorCaracteres[i]=='e') {
				vocales++;
			}else if (vectorCaracteres[i]=='i') {
				vocales++;
			}else if (vectorCaracteres[i]=='o') {
				vocales++;
			}else if (vectorCaracteres[i]=='u') {
				vocales++;
			}
		}
		return vocales;
	}
	
	public static int caracterSeparado(String cadena) {
		int vocales=0;
		
		char [] vectorCaracteres = cadena.toLowerCase().toCharArray();
		for (int i = 0; i < vectorCaracteres.length; i++) {
			if (i==vectorCaracteres.length-1) {
				System.out.print(vectorCaracteres[i]);
			} else {
				System.out.print(vectorCaracteres[i]+"-");
			}
		}
		return vocales;
	}
	
	public static void cambiarVocales(String cadena) {
		String cambiaVocales=new String("");
		int i=0;
		
		/*System.out.println(cadena.replaceAll("e", "a").replaceAll("i", "a").replaceAll("o", "a").replaceAll("u", "a"));
		System.out.println(cadena.replaceAll("a", "e").replaceAll("i", "e").replaceAll("o", "e").replaceAll("u", "e"));
		System.out.println(cadena.replaceAll("a", "i").replaceAll("e", "i").replaceAll("o", "i").replaceAll("u", "i"));
		System.out.println(cadena.replaceAll("a", "o").replaceAll("e", "o").replaceAll("i", "o").replaceAll("u", "o"));
		System.out.println(cadena.replaceAll("a", "u").replaceAll("e", "u").replaceAll("i", "u").replaceAll("o", "u"));*/
		
		cambiaVocales=cadena.replaceAll("e", "a").replaceAll("i", "a").replaceAll("o", "a");
		while (cambiaVocales.indexOf("u", i)!=-1) {
			if (cambiaVocales.substring(cambiaVocales.indexOf("u", i)-1, cambiaVocales.indexOf("u", i)+1).equalsIgnoreCase("qu") 
					|| cambiaVocales.substring(cambiaVocales.indexOf("u", i)-1, cambiaVocales.indexOf("u", i)+1).equalsIgnoreCase("gu")) {
				i=cambiaVocales.indexOf("u", i)+1;
			} else {
				cambiaVocales=cambiaVocales.substring(0, i).concat(cambiaVocales.substring(i, cambiaVocales.length()).replaceFirst("u", "a"));
			}
		}
		System.out.println(cambiaVocales);
		cambiaVocales=cadena.replaceAll("a", "e").replaceAll("i", "e").replaceAll("o", "e");
		while (cambiaVocales.indexOf("u", i)!=-1) {
			if (cambiaVocales.substring(cambiaVocales.indexOf("u", i)-1, cambiaVocales.indexOf("u", i)+1).equalsIgnoreCase("qu") 
					|| cambiaVocales.substring(cambiaVocales.indexOf("u", i)-1, cambiaVocales.indexOf("u", i)+1).equalsIgnoreCase("gu")) {
				i=cambiaVocales.indexOf("u", i)+1;
			} else {
				cambiaVocales=cambiaVocales.substring(0, i).concat(cambiaVocales.substring(i, cambiaVocales.length()).replaceFirst("u", "e"));
			}
		}
		System.out.println(cambiaVocales);
		cambiaVocales=cadena.replaceAll("a", "i").replaceAll("e", "i").replaceAll("o", "i");
		while (cambiaVocales.indexOf("u", i)!=-1) {
			if (cambiaVocales.substring(cambiaVocales.indexOf("u", i)-1, cambiaVocales.indexOf("u", i)+1).equalsIgnoreCase("qu") 
					|| cambiaVocales.substring(cambiaVocales.indexOf("u", i)-1, cambiaVocales.indexOf("u", i)+1).equalsIgnoreCase("gu")) {
				i=cambiaVocales.indexOf("u", i)+1;
			} else {
				cambiaVocales=cambiaVocales.substring(0, i).concat(cambiaVocales.substring(i, cambiaVocales.length()).replaceFirst("u", "i"));
			}
		}
		System.out.println(cambiaVocales);
		cambiaVocales=cadena.replaceAll("a", "o").replaceAll("e", "o").replaceAll("i", "o");
		while (cambiaVocales.indexOf("u", i)!=-1) {
			if (cambiaVocales.substring(cambiaVocales.indexOf("u", i)-1, cambiaVocales.indexOf("u", i)+1).equalsIgnoreCase("qu") 
					|| cambiaVocales.substring(cambiaVocales.indexOf("u", i)-1, cambiaVocales.indexOf("u", i)+1).equalsIgnoreCase("gu")) {
				i=cambiaVocales.indexOf("u", i)+1;
			} else {
				cambiaVocales=cambiaVocales.substring(0, i).concat(cambiaVocales.substring(i, cambiaVocales.length()).replaceFirst("u", "o"));
			}
		}
		System.out.println(cambiaVocales);
		cambiaVocales=cadena.replaceAll("a", "u").replaceAll("e", "u").replaceAll("i", "u").replaceAll("o", "u");
		System.out.println(cambiaVocales);
	}

}
