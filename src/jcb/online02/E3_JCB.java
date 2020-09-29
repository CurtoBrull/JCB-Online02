package jcb.online02;
import java.util.Scanner;

public class E3_JCB {

    public static void main(String[] args) {
        /* 
        Indique cuál es el mayor de dos números introducidos por teclado.
        Si son iguales también ha de notificarlo.
        */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir primer número: ");        
        double numero1 = teclado.nextDouble();
        System.out.println("Introducir segundo número: ");        
        double numero2 = teclado.nextDouble();
        if (numero1 < numero2) {
            System.out.println("El número " + numero2 + " es mayor que el número " + numero1);            
        }
        else if (numero1 > numero2 ) {
                    System.out.println("El número " + numero1 + " es mayor que el número " + numero2);
                    }
        else {
            System.out.println("Los números son iguales");
        }
    }
    
}

