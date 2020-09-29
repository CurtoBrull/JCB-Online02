package jcb.online02;
import java.util.Scanner;

public class E7_JCB {

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
        for(int i=0; i<11; i++) {
        System.out.println(numero + " * " + i + " = " + (numero * i));
        }       
    }
    
}

