/* Exercício Fácil: Escreva um programa que crie um array de inteiros chamado numeros com 10 elementos e preencha-o com valores 
aleatórios entre 1 e 100. Em seguida, imprima na tela o conteúdo do array e a soma de todos os seus elementos. */

import java.util.Random;

public class ExercicioUm {
    public static void main(String[] args) {
        int tam = 10;
        int soma = 0;
        int[] numeros = new int[tam];

        // definindo o range
        int max = 100;
        int min = 1;

        // gera numeros aleatórios entre 1 e 100.
        for(int i = 0; i<numeros.length; i++) {

            Random random = new Random(); 
            int ran = random.nextInt(max) + min;

            numeros[i] = ran;
            soma += ran;

            System.out.printf("%d ",ran);
        }

        System.out.printf("%nA soma dos números é: %d", soma);
    }
}