package Pruebas;

import java.util.Scanner;

public class aceptaelreto {
	private static Scanner teclado;
	
public static void main(String[] args) {
    teclado = new Scanner(System.in);

	String frase="";
	String aux;
	
	do{
	
	System.out.println("Inserta la frase que quiere comprobar: ");
	frase=teclado.nextLine();
	
	frase= frase.replace(" ","");
	frase=frase.toLowerCase();
	
	StringBuilder strb = new StringBuilder(frase);
	aux=strb.reverse().toString();
	
	if (frase.equals("xxx")) {
		
	}
	else if (frase.equals(aux)) {
		System.out.println("Es un palindromo");
	}
	else {
		System.out.println("No es un palindromo");

	}
	
	}while(!frase.equals("xxx"));
}
}