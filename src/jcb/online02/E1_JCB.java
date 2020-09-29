package jcb.online02;
import java.util.Scanner;

public class E1_JCB {

    public static void main(String[] args) {
        /* 
        Indique si el número introducido es positivo o negativo mostrando un mensaje por pantalla. 
        El cero lo consideraremos como número positivo.
        */
        System.out.println("Introducir número: ");
        Scanner teclado = new Scanner(System.in);
        double numero = teclado.nextDouble();
        if (numero < 0) {
            System.out.println("El número es negativo");            
        }
        else if (numero >= 0 ) {
                    System.out.println("El número es positivo");
                    }
    }
    
}
