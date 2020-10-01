package jcb.online02;
import java.util.Scanner;

public class E8_JCB {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String r = teclado.nextLine();
        do {
            Scanner teclado2 = new Scanner(System.in);
            System.out.print("Introducir el número: ");        
            int numero = teclado2.nextInt();              
            for(int i=0; i<11; i++) {
                System.out.println(numero + " * " + i + " = " + (numero * i));
            }
        } while (r == "s");
         
    }
    
}      

