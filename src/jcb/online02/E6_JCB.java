package jcb.online02;

public class E6_JCB {

    public static void main(String[] args) {
        /* 
        Muestre los números pares que hay entre el 50 y el 97.
        */
        
        // Con la estructura do-while incluimos el 50
        int i = 50;
        do {
            if (i%2 == 0)
            System.out.println(i);
            i++;
        }while (i < 97);
    }
    
}
