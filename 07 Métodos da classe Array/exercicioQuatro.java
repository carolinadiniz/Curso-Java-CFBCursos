/* 4. Escreva um código que compare dois arrays de booleanos e imprima se eles são iguais ou não. use o método Arrays.equals() para isso. */

import java.util.Arrays;

public class exercicioQuatro {
    public static void main(String[] args) {
        final boolean[] verdadeiro = {true, true, false, false, true};
        final boolean[] falso = {false, false, true, false};

        System.out.printf("O Array verdadeiro e igual ao array falso? %s ", 
        Arrays.equals(verdadeiro, falso) ? "Sim" : "Nao");
    }    
}
