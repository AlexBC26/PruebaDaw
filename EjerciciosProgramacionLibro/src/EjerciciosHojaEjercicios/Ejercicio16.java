package EjerciciosHojaEjercicios;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        int n = sc.nextInt();
        
        for (int fila = n; fila <= n && fila > 0; fila--){
            
            for (int asteriscos = 1; asteriscos <= fila; asteriscos++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}