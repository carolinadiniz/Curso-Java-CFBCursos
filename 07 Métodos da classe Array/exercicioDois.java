/* Escreva um código que preencha um array de inteiros com valor 10. Uso o método Arrays.fill() para isso. */
import java.util.Arrays;

public class exercicioDois {
    public static void main(String[] args) {

        final int TAM = 5;
        final int VALOR = 10;
        
        final int[] numeros = new int[TAM];
        Arrays.fill(numeros, VALOR);

        for(int numero:numeros) {
            System.out.println(numero);
        }

    }
}
