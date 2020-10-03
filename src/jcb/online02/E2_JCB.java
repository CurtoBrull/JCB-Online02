package jcb.online02;
import java.util.Scanner;

public class E2_JCB {
        /* 
        Igual que el ejercicio 1 pero en el caso que sea cero el número 
        introducido muestre por pantalla el mensaje: "el número es cero".
        */
    public static void main(String[] args) {
        
        System.out.println("Introducir número: ");
        Scanner teclado = new Scanner(System.in);
        double numero = teclado.nextDouble();
        // Numero menor a 0
        if (numero < 0) {
            System.out.println("El número es negativo");            
        }
        // Número mayor a 0
        else if (numero > 0 ) {
                    System.out.println("El número es positivo");
                    }
        // Si no es menor, ni mayor a 0
        else {
            System.out.println("El número es cero");
        }
    }
    
}

