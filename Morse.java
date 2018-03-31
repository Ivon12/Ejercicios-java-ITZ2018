package modelo;

public class Morse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena="HOY ES LUNES";//cadena que va a evaluar y convertir a morse
		System.out.println("Texto a Morse     "+convertirAMorse(cadena));
				
		String cadenaMorse=".... --- .-.. .-    -- ..- -. -.. ---";//Cadena que se va a convertir a texto
		System.out.println("Morse a Texto     "+convertirATexto(cadenaMorse));
	
	}
	public static String convertirATexto(String cadena){
		String resMorse="";
		String[] morse=cadena.split(" ");
		int cont=1;
		for (int indice2 = 0; indice2 < morse.length; indice2++) {
			if(morse[indice2].equals("")){
				cont=cont+1;
				if(cont==3){
					resMorse+=" ";
					cont=1;
				}
			}else{
					if (morse[indice2].equalsIgnoreCase(".-")) {
						resMorse+="a";
					}
					if (morse[indice2].equalsIgnoreCase("-...")) {
						resMorse+="b";
					}
					if (morse[indice2].equalsIgnoreCase("-.-.")) {
						resMorse+="c";
					}
					if (morse[indice2].equalsIgnoreCase("-..")) {
						resMorse+="d";
					}
					if (morse[indice2].equalsIgnoreCase(".")) {
						resMorse+="e";
					}
					if (morse[indice2].equalsIgnoreCase("..-.")) {
						resMorse+="f";
					}
					if (morse[indice2].equalsIgnoreCase("--.")) {
						resMorse+="g";
					}
					if (morse[indice2].equalsIgnoreCase("....")) {
						resMorse+="h";
					}
					if (morse[indice2].equalsIgnoreCase("..")) {
						resMorse+="i";
					}
					if (morse[indice2].equalsIgnoreCase(".---")) {
						resMorse+="j";
					}
					if (morse[indice2].equalsIgnoreCase("-.-")) {
						resMorse+="k";
					}
					if (morse[indice2].equalsIgnoreCase(".-..")) {
						resMorse+="l";
					}
					if (morse[indice2].equalsIgnoreCase("--")) {
						resMorse+="m";
					}
					if (morse[indice2].equalsIgnoreCase("-.")) {
						resMorse+="n";
					}
					if (morse[indice2].equalsIgnoreCase("---")) {
						resMorse+="o";
					}
					if (morse[indice2].equalsIgnoreCase(".--.")) {
						resMorse+="p";
					}
					if (morse[indice2].equalsIgnoreCase("--.-")) {
						resMorse+="q";
					}
					if (morse[indice2].equalsIgnoreCase(".-.")) {
						resMorse+="r";
					}
					if (morse[indice2].equalsIgnoreCase("...")) {
						resMorse+="s";
					}
					if (morse[indice2].equalsIgnoreCase("-")) {
						resMorse+="t";
					}
					if (morse[indice2].equalsIgnoreCase("..-")) {
						resMorse+="u";
					}
					if (morse[indice2].equalsIgnoreCase("...-")) {
						resMorse+="v";
					}
					if (morse[indice2].equalsIgnoreCase(".--")) {
						resMorse+="w";
					}
					if (morse[indice2].equalsIgnoreCase("-..-")) {
						resMorse+="x";
					}
					if (morse[indice2].equalsIgnoreCase("-.--")) {
						resMorse+="y";
					}
					if (morse[indice2].equalsIgnoreCase("--..")) {
						resMorse+="z";
					}
			}
		}
		return resMorse;
	}
 public static String convertirAMorse(String cadena){
		char[] palabra=cadena.toCharArray();
		String resultado="";
		for (int indice = 0; indice < palabra.length; indice++) {
			
			if (palabra[indice]==' ') {
				resultado+="   ";
			}else{
				if(palabra[indice]=='a' || palabra[indice]=='A'){
					resultado+=" "+".-";
				}
				if(palabra[indice]=='b' || palabra[indice]=='B'){
					resultado+=" "+"-...";
				}
				if(palabra[indice]=='c' || palabra[indice]=='C'){
					resultado+=" "+"-.-.";
				}
				if(palabra[indice]=='d' || palabra[indice]=='D'){
					resultado+=" "+"-..";
				}
				if(palabra[indice]=='e' || palabra[indice]=='E'){
					resultado+=" "+".";
				}
				if(palabra[indice]=='f' || palabra[indice]=='F'){
					resultado+=" "+"..-.";
				}
				if(palabra[indice]=='g' || palabra[indice]=='G'){
					resultado+=" "+"--.";
				}
				if(palabra[indice]=='h' || palabra[indice]=='H'){
					resultado+=" "+"....";
				}
				if(palabra[indice]=='i' || palabra[indice]=='I'){
					resultado+=" "+"..";
				}
				if(palabra[indice]=='j' || palabra[indice]=='J'){
					resultado+=" "+".---";
				}
				if(palabra[indice]=='k' || palabra[indice]=='K'){
					resultado+=" "+"-.-";
				}
				if(palabra[indice]=='l' || palabra[indice]=='L'){
					resultado+=" "+".-..";
				}
				if(palabra[indice]=='m' || palabra[indice]=='M'){
					resultado+=" "+"--";
				}
				if(palabra[indice]=='n' || palabra[indice]=='N'){
					resultado+=" "+"-.";
				}
				if(palabra[indice]=='o' || palabra[indice]=='O'){
					resultado+=" "+"---";
				}
				if(palabra[indice]=='p' || palabra[indice]=='P'){
					resultado+=" "+".--.";
				}
				if(palabra[indice]=='q' || palabra[indice]=='Q'){
					resultado+=" "+"--.-";
				}
				if(palabra[indice]=='r' || palabra[indice]=='R'){
					resultado+=" "+".-.";
				}
				if(palabra[indice]=='s' || palabra[indice]=='S'){
					resultado+=" "+"...";
				}
				if(palabra[indice]=='t' || palabra[indice]=='T'){
					resultado+=" "+"-";
				}
				if(palabra[indice]=='u' || palabra[indice]=='U'){
					resultado+=" "+"..-";
				}
				if(palabra[indice]=='v' || palabra[indice]=='V'){
					resultado+=" "+"...-";
				}
				if(palabra[indice]=='w' || palabra[indice]=='W'){
					resultado+=" "+".--";
				}
				if(palabra[indice]=='x' || palabra[indice]=='X'){
					resultado+=" "+"-..-";
				}
				if(palabra[indice]=='y' || palabra[indice]=='Y'){
					resultado+=" "+"-.--";
				}
				if(palabra[indice]=='z' || palabra[indice]=='Z'){
					resultado+=" "+"--..";
				}
			}
			
		}
		return resultado;
	}

}
