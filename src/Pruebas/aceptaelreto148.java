package Pruebas;

import java.util.Scanner;

public class aceptaelreto148 {
	private static Scanner teclado;
	
public static void main(String[] args) {
	    teclado = new Scanner(System.in);
	    String hora;
	    int minutos=0;
	    
	    while(minutos!=1440){
	    System.out.println("Inserta la hora:");
				hora=teclado.nextLine();
							
			char[] array = hora.toCharArray();			
			
			int horas = Character.getNumericValue(array[0]);
	        horas=horas*10;
	        horas=horas+Character.getNumericValue(array[1]);
	        
	        minutos = Character.getNumericValue(array[3]);
	        minutos=minutos*10;
	        minutos=minutos+Character.getNumericValue(array[4]);
	        	        	       
	        minutos=minutos+(horas*60);        
	        minutos=1440-minutos;
	        
	        if (minutos==1440) {			
			}
	        else{
	            System.out.println("Faltan "+minutos+" minutos para la medianoche.");
	        }	        
	   }
	}
}