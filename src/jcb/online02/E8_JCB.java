package jcb.online02;
import java.util.Scanner;

public class E8_JCB {

    public static void main(String[] args) {
        /* 
        Muestre la tabla de multiplicar de un número introducido por teclado.
        */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introducir el número: ");        
        int numero = teclado.nextInt();
        /*
        Empieza la variable a iterar (i) desde 0; mientras i sea menor a 10;
        sumamos 1 a i
        */
        do {
            for(int i=0; i<11; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));            
            }
        }while (respuesta == "s" | respuesta == "S");
        
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Desea ver otra tabla?(s/n): ");
        String respuesta;
        respuesta = teclado2.nextLine();        
        System.out.println(":::::::...FIN...:::::::");

    }
    
}      

