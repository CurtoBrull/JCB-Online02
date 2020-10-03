package jcb.online02;

public class E6_JCB {
        /* 
        Muestre los números pares que hay entre el 50 y el 97.
        */
    public static void main(String[] args) {
        // Declaramos la variable i con el valor 50       
        int i = 50;
        
        // Con la estructura do-while incluimos el 50
        
        // Mientras i sea menor que 97 realizaremos lo siguiente
        do {
            // Si el resto de i/2 es 0 es que es un número par
            if (i%2 == 0)
            System.out.println(i);
            // Sumamos 1 a la variable a iterar
            i++;
        }while (i < 97);
    }
    
}
