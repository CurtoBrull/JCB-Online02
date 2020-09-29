package jcb.online02;
import java.util.Scanner;

public class E4_JCB {

    public static void main(String[] args) {
        /* 
        Reciba dos números desde teclado. Y realice una de las siguientes acciones:
        
            1. Si el primer número es mayor que el segundo realice la resta.

            2. Si el primer número es menor que el segundo realice la suma.

            3. Si los números son iguales realice la multiplicación.
        */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introducir primer número: ");        
        double numero1 = teclado.nextDouble();
        System.out.print("Introducir segundo número: ");        
        double numero2 = teclado.nextDouble();
        
        
        if (numero1 > numero2) {
            double resta = numero1 - numero2;
            System.out.println("La resta de " + numero1 + " y " + numero2 + " es " + resta);
        }
            else if (numero1 < numero2) {
                double suma = numero1 + numero2;
                System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + suma);
            }
                else {
                    double mult = numero1 * numero2;
                    System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es " + mult);
                }
    }
    
}

