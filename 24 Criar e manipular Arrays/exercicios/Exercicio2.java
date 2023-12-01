/* Escreva um programa em java que leia um array de 5 strings e ordene-o em ordem alfabética. Em seguida, imprima o array ordenado e o número de trocas que foram feitas para ordená-lo. */
package exercicios;

public class Exercicio2 {
    public static void main(String[] args) {
        
        String[] palavras = {"Oculos", "Teclado", "Fones de Ouvido", "Celular", "Chaves"};
        int trocas = 0;

        for(int i=0; i < palavras.length - 1; i++) {
            int minimo = i;
            for(int j = i + 1; j < palavras.length; j++) {
                if (palavras[j].compareTo(palavras[minimo]) < 0) {
                    minimo = j;
                }
            }
            if(minimo != i) {
                String temp = palavras[i];
                palavras[i] = palavras[minimo];
                palavras[minimo] = temp;
                trocas++;
            }
        }

        for(String palavra:palavras) {
            System.out.printf("%s%n", palavra);
        }

        System.out.printf("Numero de trocas: %d%n", trocas);
    }
}
