/* Escreva um código que pesquise por um elemento em um array de dubles e imprima se ele foi encontrado ou não e em qual posição. Use o método Arrays.binarySearch() para isso. */

import java.util.Arrays;

public class exercicioCinco {
    public static void main(String[] args) {

        final double[] valores = {3.14, 2.71, 1.41, 0.62, 4.44};
        final double elemento = 3.14;

        Arrays.sort(valores);
        final int posicao = Arrays.binarySearch(valores, elemento);

        if (posicao >= 0) {
            System.out.printf("O elemento %.2f esta no array valores, na posicao %d.%n", elemento, posicao);

        } else {
            System.out.println("O elemento nao esta no array valores.");

        }
    }
}
