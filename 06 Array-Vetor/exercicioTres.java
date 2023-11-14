/*Difícil: Escreva um programa que crie um array de strings chamado palavras com 5 elementos e preencha-o com palavras digitadas pelo usuário. Em seguida, ordene o array em ordem alfabética e imprima na tela o array ordenado e a palavra mais longa do array. */

import java.util.Scanner;
import java.util.Arrays;

public class exercicioTres {

    final static int TAMANHO = 5;

    // recebe palavras via teclado do usuário
    public static void lerPalavras(String[] palavras) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i < TAMANHO; i++) {
            System.out.printf("Digite a %dª palavra: ", i+1);
            palavras[i] = sc.nextLine();
        }
    }

    // ordena o array em ordem alfabética
    public static void ordenarPalavras(String[] palavras) {
        Arrays.sort(palavras);
    }

    // retorna a palavra mais longa
    public static String obterPalavraLonga(String[] palavras) {
        String maior = palavras[0];

        for(String palavra: palavras) {
            if (palavra.length() > maior.length()) {
                maior = palavra;
            }
        }

        return maior;
    }


    public static void main(String[] args) {

        String[] palavras = new String[TAMANHO];
        lerPalavras(palavras);
        ordenarPalavras(palavras);
        // Imprime as palavras em ordem
        for (int i=0; i < TAMANHO; i++) {
            System.out.printf("%s, ", palavras[i]);
        }

        // Imprime a maior palavra
        System.out.printf("%nA palavra mais longa é: %s.%n", obterPalavraLonga(palavras));
    }
    
}
