package Pruebas;

import java.util.Scanner;

public class Numeros {
    private static Scanner teclado;

	public static void main(String[] args){
        teclado = new Scanner(System.in);
        
        int num=0;
        int ale;
        String cad;
        boolean gan= false;
   do {
        System.out.println("Que quieres sacar: piedra, papel o tijera");
        cad=teclado.nextLine();
        cad= cad.toLowerCase();
        
        if (cad.equals("piedra")) {
			num=1;
		}
        else if (cad.equals("papel")) {
			num=2;
		}
        else if (cad.equals("tijera")) {
			num=3;
		}
        else {
        	System.out.println("Error debes introducir un dato valido");
        	gan=true;
        }
        //System.out.println(num);
        
       ale= (int) Math.floor(Math.random()*3+1); 
       //System.out.println(ale);
       
   		if (num==1 && ale==3) {
			gan=true;
		}
   		else if (num==2 && ale==1) {
   			gan=true;
   		}
   		
   		else if (num==3 && ale==2) {
   			gan=true;
   		}
   		
   		if (num==ale) {
   			System.out.println("Empate");
   		}
   		
   		else if (gan==true) {
			System.out.println("Has ganado");
		}
   		else if (gan==false) {
   			System.out.println("Has perdido");
   		}
   		
   		if (ale==1) {
			System.out.println("La maquina ha sacado: piedra");
		}
   		else if (ale==2) {
			System.out.println("La maquina ha sacado: papel");
		}
       
   		else if (ale==3) {
			System.out.println("La maquina ha sacado: tijera");
		}
       }while(gan!=true);
    }
}