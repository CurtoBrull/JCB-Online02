package jcb.online02;
import java.util.Scanner;

public class E8_JCB {    
        /*
        Basándonos en el ejercicio 7 nos diga si queremos mostrar otra tabla de multiplicar. 
        Si el usuario introduce una 's' volverá a comenzar el programa y pedirá un nuevo número 
        del que mostrar la tabla de multiplicar y realizará nuevamente la pregunta de si se quiere mostrar una tabla de multiplicar.
        */      
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            // Declaramos todas las variables int y String
            int numero, i, resultado;
            String respuesta;
            System.out.print("Quieres ver la tabla de multiplicar de un número? (S/N) ");
            respuesta = teclado.next();
            System.out.println("");
            
            // Siempre que la respuesta sea "S" se ejecutará el código dentro de while
            while (respuesta.equals("S")) {
                // Pedimos el número
                System.out.print("Introduce el número de la tabla deseada: ");
                numero = teclado.nextInt();
                System.out.println("");
                
                // Ciclo for hasta llegar al 10 incluido
                for (i = 0; i <= 10; i++) {
                    resultado = numero * i;
                    System.out.println(numero + " x " + i + " = " + resultado);
                }
                // Volvemos a preguntar si se quiere una tabla
                System.out.println("");
                System.out.print("Desea ver la tabla de otro número? (S/N) ");
                respuesta = teclado.next(); 
            }
            // Cuando en algun momento no se introduce "S" se finaliza el programa
            System.out.println("");
            System.out.println("Fin del programa.");
            System.out.println("");
        } 
    }


