package Pruebas;

import java.util.Scanner;

public class PersonaEje {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
       /* String dni;
        int sueldo;
        int num2;*/
			
		Persona objP = new Persona("0473457657R",2000,500);
		
		/*System.out.println("Inserta un Dni:");
        dni=teclado.nextLine();
        
        System.out.println("Inserta un Sueldo:");
        sueldo=teclado.nextInt();
		
        System.out.println("Inserta un numero:");
        num2=teclado.nextInt();
        
		Persona obj2 = new Persona (dni,sueldo,num2);
		
		System.out.println(obj2);*/
			
		System.out.println(objP);	//Llama de forma automatica al metodo To string
	
	
	/*objP.sumaNumero(objP.getSalario(), objP.getNum2());
	System.out.println("La multiplicacion es: "+objP.multiplicarNumero(objP.getSalario(), objP.getNum2()));
	
	System.out.println("La multiplicacion de ambos sueldos es: "+ objP.multiplicarNumero(objP.getSalario(), obj2.getSalario()));*/
	
	objP.encontrarSiete(objP.getDni());
	
	}
	
}