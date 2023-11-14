/* Escreva um código que ordene os elemento sde um array de strings em ordem alfabética. Use o método Arrays.short() para isso. */

import java.util.Arrays;

public class exercicioUm {

    public static void main(String[] args) {

        final String[] nomes = {"Ana", "Bruno", "Carlos", "Daniela", "Eduardo"};
        Arrays.sort(nomes);

        for(String nome:nomes) {
            System.out.println(nome);
        }
        
    }
}
