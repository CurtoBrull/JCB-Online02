package jcb.online02;
import java.util.Scanner;

public class E9_JCB {
        /*Programa que introducido un número indique si es positivo.
        Si no lo es finalizará el programa pero en caso de que sea mayor que cero 
        mostrará todos los números entre los que es divisible.
        */
    public static void main(String[] args) {
        // Solicitamos el numero y lo guardamos en una variable
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        
        // Si el numero es mayor que 0
        if (numero > 0) {
            System.out.println("El número es positivo.");
            System.out.println(numero + " es divisible por los siguientes números: ");
            // Recorremos desde 1 hasta el numero introducido y sumamos 1 a la variable i
            for (int i = 1; i <= numero; i++) {
                // Si el resto del numero dividido por la variable i es igual a 0 es que es divisible por i e imprimimos el valor de i que corresponda
                if (numero%i == 0) {                    
                    System.out.println(i);
                }
            }            
        }
        // Si el numero es negativo o "0"
        else {
            System.out.println("El numero no es positivo");
        }
    }
    
}
