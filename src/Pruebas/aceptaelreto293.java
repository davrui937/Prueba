package Pruebas;
import java.util.Scanner;

public class aceptaelreto293 {
static final int TAM=5;
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    int casos=0;
    int aux=0;
    
    System.out.println("Cuantos casos de prueba vamos a tener:");
    casos=teclado.nextInt();
    
    int matriz[][] = new int[casos][TAM];

for (int i = 0; i < casos; i++) {
    
        for (int j = 0; j < TAM; j++) {
            
            matriz[i][j]=teclado.nextInt();
            
            if (j==0) {
                aux=aux+matriz[i][j]*6;
            }
            else if(j==1) {
                aux=aux+matriz[i][j]*8;
            }
            
            else if(j==2) {
                aux=aux+matriz[i][j]*10;
            }
            
            else if(j==4) {
                aux=aux+matriz[i][j-1]*(matriz[i][j]*2);             
            }            
        }
        
        System.out.println("La suma de todas las patas serian: "+aux);
        aux=0;    
}
}
}