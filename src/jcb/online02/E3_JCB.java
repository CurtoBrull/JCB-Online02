package jcb.online02;
import java.util.Scanner;

public class E3_JCB {
        /* 
        Indique cuál es el mayor de dos números introducidos por teclado.
        Si son iguales también ha de notificarlo.
        */
    public static void main(String[] args) {
        
        // Solicitamos números que pueden ser decimales
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir primer número: ");        
        double numero1 = teclado.nextDouble();
        System.out.println("Introducir segundo número: ");        
        double numero2 = teclado.nextDouble();
        
        // El numero 1 es menor al 2
        if (numero1 < numero2) {
            System.out.println("El número " + numero2 + " es mayor que el número " + numero1);            
        }
        // El numero 1 es mayor a 2
        else if (numero1 > numero2 ) {
                    System.out.println("El número " + numero1 + " es mayor que el número " + numero2);
        }
        // Si no se cumple nada de lo anterior es que son números iguales
        else {
            System.out.println("Los números son iguales");
        }
    }
    
}

