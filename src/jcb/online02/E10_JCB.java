package jcb.online02;
import java.util.Scanner;

/**
 *
 * @author JCB
 * 
 * Visualiza al menos los puntos 2.6 (Estructura de decisión) 
 * y 2.7. (Estructura de repetición) del curso Java 8 desde cero. 
 * Posteriormente realiza la práctica de crear una calculadora.
 */
public class E10_JCB {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        // declaramos la variable de la respuesta del usuario
        int respuesta;
        
        do {
            // Creamos la presentación y el menú de la calculadora y capturamos la respuesta
            System.out.print("\n");
            System.out.print("\n");
            System.out.println("---- CALCULADORA ----");
            System.out.print("\n");
            System.out.println("Pulsa 1 para Sumar.");
            System.out.println("Pulsa 2 para Restar.");
            System.out.println("Pulsa 3 para Multiplicar.");
            System.out.println("Pulsa 4 para Dividir.");
            System.out.println("Pulsa 5 para calcular el Resto.");
            System.out.println("Pulsa 0 para Salir del Programa.");
            System.out.print("Introduce el tipo de operación a realizar: ");
            respuesta = teclado.nextInt();
            
                // Si la respuesta es menor a 0 o mayor a 5 vuelve al menú
                if (respuesta < 0 || respuesta > 5) {
                    System.out.println("Opción no válida, vuelva a introducir la operación a realizar");
                // Si la respuesta es diferente a 0 se ejecuta el código
                }else if (respuesta != 0) {
                    // Se piden y guardan 2 numeros que pueden ser decimales
                    System.out.print("\n");
                    System.out.print("Introduce el primer número: ");
                    float n1 = teclado.nextFloat();
                    System.out.print("Introduce el segundo número: ");
                    float n2 = teclado.nextFloat();
                    System.out.print("\n");
                    
                    // Dependiendo de la respuesta en el menú entramos en el caso que corresponda
                    switch (respuesta) {

                    case 1:
                        System.out.println("La suma de " + n1 + " + " + n2 + " = " + (n1+n2));
                        break;
                    case 2:
                        System.out.println("La resta de " + n1 + " - " + n2 + " = " + (n1-n2));
                        break;
                    case 3:
                        System.out.println("La multiplicación de " + n1 + " x " + n2 + " = " + (n1*n2));
                        break;
                    case 4:
                        System.out.println("La división de " + n1 + " / " + n2 + " = " + (n1/n2));
                        break;
                    case 5:
                        System.out.println("La resto de " + n1 + " / " + n2 + " = " + (n1%n2));
                        break;                   
                    }
                }   
        } while (respuesta != 0); // Todo esto ocurre siempre que la respuesta sea diferente a 0
        
        // En el caso de pulsar 0 se finaliza el programa
        teclado.close();
        System.out.print("\n");
        System.out.println("Cerrando calculadora...");
        System.out.print("\n");
    }
}          
    
    

