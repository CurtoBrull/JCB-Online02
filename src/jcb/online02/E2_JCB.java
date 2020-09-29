package jcb.online02;
import java.util.Scanner;

public class E2_JCB {

    public static void main(String[] args) {
        /* 
        Igual que el ejercicio 1 pero en el caso que sea cero el número 
        introducido muestre por pantalla el mensaje: "el número es cero".
        */
        System.out.println("Introducir número: ");
        Scanner teclado = new Scanner(System.in);
        double numero = teclado.nextDouble();
        if (numero < 0) {
            System.out.println("El número es negativo");            
        }
        else if (numero > 0 ) {
                    System.out.println("El número es positivo");
                    }
        else {
            System.out.println("El número es cero");
        }
    }
    
}

