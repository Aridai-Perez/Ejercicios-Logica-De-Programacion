package ejercicios;

import java.util.Scanner;

public class MainInvertirCadena {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese una palabra o frase por favor.");
		String cadenaUsuario = scan.nextLine();
		
		StringBuilder stringBuilder = new StringBuilder(cadenaUsuario);
		
		
		String cadenaInvertida = stringBuilder.reverse().toString();
		System.out.println("Cadena original: " + cadenaUsuario);
		System.out.println("Cadena invertida: " + cadenaInvertida);
		
		scan.close();
	}
	
}
