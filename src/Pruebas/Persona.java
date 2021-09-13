package Pruebas;

public class Persona {
	
	private String dni="";
	private int salario = 1000;
	private int num2 = 3;
	
	
	//Constructores
	
	Persona(String dni, int salario, int num2){
		this.dni=dni;
		this.salario=salario;
		this.num2=num2;
		
	}
	
	Persona(String dni){
		this.dni=dni;
		
	}

	//Getter y Setter
	
	public String getDni() {
		return dni;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", salario=" + salario + ", num2=" + num2 + "]";
	}

	public static void sumaNumero(int salario, int num2) {
		int aux;
		aux= salario+num2;
		System.out.println("La suma es: "+aux);
	}
	
	

	public static int multiplicarNumero(int salario, int num2) {
		int aux;
		aux= salario*num2;
		return aux;
	}
	
	public static void encontrarSiete(String dni) {
	
		char[] array = dni.toCharArray();
		int cont=0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]=='7') {
				cont=cont+1;
			}
		 }
			System.out.println("Hay un total de "+cont+" sietes");	
		}	
}