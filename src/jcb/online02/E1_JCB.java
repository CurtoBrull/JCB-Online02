package jcb.online02;
// Importamos la utilidad para capturar teclado
import java.util.Scanner;

public class E1_JCB {
        /* 
        Indique si el número introducido es positivo o negativo mostrando un mensaje por pantalla. 
        El cero lo consideraremos como número positivo.
        */
    public static void main(String[] args) {
        // Capturamos en la variable el numero introducido por el usuario
        System.out.println("Introducir número: ");
        Scanner teclado = new Scanner(System.in);
        double numero = teclado.nextDouble();
        // Si el número es menor a 0
        if (numero < 0) {
            System.out.println("El número es negativo");            
        }
        // Si es mayor o igual a 0
        else {
            System.out.println("El número es positivo");
        }
    }
    
}
