package jcb.online02;
import java.util.Scanner;

public class E4_JCB {
        /* 
        Reciba dos números desde teclado. Y realice una de las siguientes acciones:
        
            1. Si el primer número es mayor que el segundo realice la resta.

            2. Si el primer número es menor que el segundo realice la suma.

            3. Si los números son iguales realice la multiplicación.
        */
    public static void main(String[] args) {
        // Pedimos 2 números
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introducir primer número: ");        
        double numero1 = teclado.nextDouble();
        System.out.print("Introducir segundo número: ");        
        double numero2 = teclado.nextDouble();
        
        // Si numero 1 es mayor que el 2
        if (numero1 > numero2) {
            // Guardamos la resta en una variable
            double resta = numero1 - numero2;
            System.out.println("La resta de " + numero1 + " y " + numero2 + " es " + resta);
        }
        // El numero 1 es menor al 2
        else if (numero1 < numero2) {
            // Guardamos la suma en una variable
            double suma = numero1 + numero2;
            System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + suma);
        }
        // Si no se cumplen las condiciones anteriores los numeros son iguales
        else {
            // Guardamos la multiplicacion en una variable
            double mult = numero1 * numero2;
            System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es " + mult);
        }
    }
    
}

